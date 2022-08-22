package API

import JSON.Amaliyotchi
import com.google.gson.Gson
import java.io.File

fun main() {

  val gson = Gson()
    val amaliyotchi = Amaliyotchi()
    amaliyotchi.name = "Shaxriyor"
    amaliyotchi.surname = "Xusinov"
    amaliyotchi.stack = "Android"

    val file = File("amaliyot.txt")
    val str = gson.toJson(file)
    val array = str.toByteArray()
    file.writeBytes(array)


     val jsonString = file.readText()
     gson.fromJson<Amaliyotchi>(jsonString, Amaliyotchi::class.java)
    println("${amaliyotchi.name} ${amaliyotchi.surname}  ${amaliyotchi.stack}")

}