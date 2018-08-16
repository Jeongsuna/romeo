<?php

namespace App\Http\Controllers;

use Illuminate\Support\Facades\DB;
use App\Http\Controllers\Controller;
use App\Http\Requests\Request;

class UserController extends Controller
{
    /**
     * Show a list of all of the application's users.
     *
     * @return Response
     */
    public function index(Request $request)
    {
        $user = $request->input('username');

        $users = DB::table('users')
                    ->select(DB::raw('count(*) as user_count, status'))
                    ->where(DB::raw('name = ' . $user))
                    ->get();

        return view('user.index', ['users' => $users]);
    }
}