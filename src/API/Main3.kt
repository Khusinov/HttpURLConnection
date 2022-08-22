package API

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import model.valyuta
import java.net.HttpURLConnection
import java.net.URL

fun mainaa(args: Array<String>) {

    val url = URL("https://jsonplaceholder.typicode.com/posts")
    val httpUrlConnection = url.openConnection() as HttpURLConnection

    httpUrlConnection.connect()
    println(httpUrlConnection.responseCode)
    val inputString  = httpUrlConnection.inputStream
    val bufferedReader = inputString.bufferedReader()

    val list = bufferedReader.readLines()
    val stringBuilder = StringBuilder()

    for (a in list) {
         stringBuilder.append(a)
    }

    val gson = Gson()
    var type = object: TypeToken<List<valyuta>>(){}.type
    val list2 = gson.fromJson<List<valyuta>>(inputString.toString() , type)
    println(list2[4])


}