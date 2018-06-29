<?php

use Illuminate\Foundation\Auth\AuthenticatesAndRegistersUsers;
use Illuminate\Http\Request;
use Illuminate\Contracts\Auth\Guard;
use Illuminate\Foundation\Auth\ThrottlesLogins;

use App\Http\Controllers\Controller;
use App\Http\Requests\Auth\LoginRequest;
use App\Http\Requests\Auth\RegisterRequest;
use App\Repositories\UserRepository;
use App\Jobs\SendMail;

class C001F_EXCEAUTH__laravel_login_bad_01
{
    use AuthenticatesAndRegistersUsers, ThrottlesLogins;
    /**
     * Handle a login request to the application.
     *
     * @param  App\Http\Requests\LoginRequest  $request
     * @param  Guard  $auth
     * @return Response
     */
    public function bad(
        LoginRequest $request,
        Guard $auth)
    {
        $credentials = [
            'username'  => $request->input('username'),
            'password'  => $request->input('password')
        ];

        if(!$auth->validate($credentials)) {
            return redirect('/auth/login')
                ->with('error', trans('front/login.credentials'))
                ->withInput($request->only('log'));
        }

        $user = $auth->getLastAttempted();

        if($user->confirmed) {
            // flaw: 001F EXCEAUTH
            $auth->login($user, $request->has('memory'));

            if($request->session()->has('user_id'))	{
                $request->session()->forget('user_id');
            }

            return redirect('/');
        }

        $request->session()->put('user_id', $user->id);

        return redirect('/auth/login')->with('error', trans('front/verify.again'));
    }
}