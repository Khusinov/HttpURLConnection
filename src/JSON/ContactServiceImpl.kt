package JSON

import com.google.gson.Gson
import java.io.File
import java.util.Scanner

class ContactServiceImpl:ContactService {

    val gson = Gson()

    val file = File("Contact.txt")
    override fun addContact() {
        println("Contact name:")
        val scanner = Scanner(System.`in`)
        val contactName = scanner.nextLine()

        println("Contact Count:")
        val contactCount = scanner.nextInt()
        val contactNumbers = ArrayList<String>()

        for(i in 0 until contactCount){
            println("${i+1} - contact:")
            contactNumbers.add(scanner.nextLine())
        }

        val contact = Contact(contactName , contactNumbers)

        val gsonContactString = gson.toJson(contact)
        file.writeBytes(gsonContactString.toByteArray())

        println("Successfully")

    }

    override fun removeContact() {

    }
}