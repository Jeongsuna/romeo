<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Redirect;

class C0006_REDIRECT__laravel_redirect_away_bad_02 extends Controller {
    use AuthenticatesAndRegistersUsers, ThrottlesLogins;
    /**
     * Handle a login request to the application.
     *
     * @param  Illuminate\Http\Request  $request
     * @return Response
     */
    public function bad(Request $request)
    {
        $site = $request->input('site');
        // flaw
        return Redirect::away($site);
    }
}
