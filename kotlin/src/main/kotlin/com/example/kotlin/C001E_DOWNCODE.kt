package romeo

import java.io.File
import java.io.FileOutputStream
import java.io.InputStream
import java.net.URL
import java.net.URLClassLoader
import java.net.URLConnection


class C001E_DOWNCODE {
    fun bad() {
        val classURLs: Array<URL> = arrayOf<URL>(URL("file:subdir/"))
        val loader = URLClassLoader(classURLs)
        val loadedClass = Class.forName("LoadMe", true, loader)
    }

    fun good() {
        // 공개키 방식의 암호화 알고리즘과 메커니즘을 이용하여 전송파일에 대한 시그니처를 생성하고
        // 파일의 변조유무를 판단한다. 서버에서는 Private Key를 가지고 MyClass를 암호화한다.
        val privateKey: String = "privateKey"
        val publicKey: String = "publicKey"

        val jarFile = "./download/util.jar"
        val fileManager = FileManager()
        var loadFile: ByteArray? = fileManager.getBytes(jarFile)
        loadFile = encrypt(loadFile, privateKey)
        // jarFileName으로 암호화된 파일을 생성한다.
        fileManager.createFile(loadFile, "jarFileName")

        // 클라이언트에서는 파일을 다운로드 받을 경우 Public Key로 복호화한다.
        val classURLs = URL("http://filesave.com/download/util.jar")
        val classURLsArray = arrayOf(classURLs)
        val conn: URLConnection = classURLs.openConnection()
        val `is`: InputStream = conn.getInputStream()

        // 입력 스트림을 jarFile명으로 파일을 출력한다.
        val fos = FileOutputStream(File(jarFile))
//        While (is.read(buf) != -1) {
//            ......
//        }
        loadFile = decrypt(loadFile, publicKey)

        // 복호화된 파일을 생성한다.
        fileManager.createFile(loadFile, jarFile)
        val loader = URLClassLoader(classURLsArray)
        val loadedClass = Class.forName("MyClass", true, loader)
    }

    fun encrypt(file: ByteArray?, privateKey: String):ByteArray? {
        return file
    }
    fun decrypt(file: ByteArray?, publicKey: String):ByteArray? {
        return file
    }

}
class FileManager{

    fun getBytes(file: String): ByteArray?{
        return file.toByteArray()
    }

    fun createFile(file:ByteArray?, fileName: String) {
        // create file
    }
}