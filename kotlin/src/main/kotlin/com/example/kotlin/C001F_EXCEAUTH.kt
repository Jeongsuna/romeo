package romeo

import java.net.Socket
import romeo.C001F_EXCEAUTH.auth.FAIL
import romeo.C001F_EXCEAUTH.auth.SERVER_IP
import romeo.C001F_EXCEAUTH.auth.SERVER_PORT
import romeo.C001F_EXCEAUTH.auth.MAX_ATTEMPTS
import java.lang.Exception


class C001F_EXCEAUTH {
    object auth {
        const val SERVER_IP = "127.0.0.1"
        const val SERVER_PORT = 8080
        const val FAIL = -1
        const val MAX_ATTEMPTS = 5
    }

    fun bad() {
        val username: String? = null
        val password: String? = null
        var socket: Socket? = null
        var result: Int = FAIL
        socket = Socket(SERVER_IP, SERVER_PORT)
        //인증 실패에 대해 제한을 두지 않아 안전하지 않다.
        while (result == FAIL) {
//            ...
            result = verifyUser(username, password);
        }
    }

    fun good() {
        val username: String? = null
        val password: String? = null
        var socket: Socket? = null
        var result: Int = FAIL
        var count = 0
        try {
            socket = Socket(SERVER_IP, SERVER_PORT)
            while (result == FAIL && count < MAX_ATTEMPTS) {
//                ...
                result = verifyUser(username, password);
                count++;
            }
        } catch (e: Exception) {
            // ...
        }

    }

    private fun verifyUser(username: String?, password: String?): Int {
        return 1;
    }
}