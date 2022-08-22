package API

import java.net.HttpURLConnection
import java.net.URL

fun main(){

   println( checkIfRecourse(URL("http://google.com")))
}
fun checkIfRecourse(url: URL):Boolean{
    val httpUrlConnection = url.openConnection() as HttpURLConnection
    println(httpUrlConnection.responseMessage)
    println(httpUrlConnection.responseCode)
    httpUrlConnection.disconnect()
    return httpUrlConnection.responseCode == 200
}


