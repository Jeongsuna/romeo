<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Http\Response;
use App\Http\Requests;
use App\Http\Controllers\Controller;

class C001B_PERSCOOKIE__laravel_forever_bad_01 extends Controller {
    public function setCookie(Request $request){
        $response = new Response('Hello World');
        // flaw:
        $response->withCookie(cookie()->forever('name', 'value'));
        return $response;
    }
    public function getCookie(Request $request){
        $value = $request->cookie('name');
        echo $value;
    }
}