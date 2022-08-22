package API

import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import model.valyuta
import java.net.HttpURLConnection
import java.net.URL
import java.util.Scanner

fun main(args: Array<String>) {



    val url = URL("http://cbu.uz/uzc/arkhiv-kursov-valyut/json/")
    val httpURLConnection = url.openConnection() as HttpURLConnection

    httpURLConnection.connect()
    println(httpURLConnection.responseCode)

    val inputString = httpURLConnection.inputStream
    val bufferReader = inputString.bufferedReader()

    val list = bufferReader.readLines()
    val stringBuilder = StringBuilder()

    for (s in list) {
        stringBuilder.append(s)
    }
    val gson = Gson()
    val type = object:TypeToken<List<valyuta>>(){}.type
    val list2 = gson.fromJson<List<valyuta>>(stringBuilder.toString() , type)
    println(list2[0])

    println("Necha dollar olmoqchisiz?")
    val scanner = Scanner(System.`in`)
    val count = scanner.nextInt()

    val DollarPrice = list2[0].Rate
    println("${count * DollarPrice.toDouble()} - so'm miqdorida bo'ladi... ${list2[0].Date}")

}