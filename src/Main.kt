import JSON.ContactService
import JSON.ContactServiceImpl
import com.google.gson.Gson
import java.io.File

fun main(args: Array<String>) {
    val vv = ContactServiceImpl()
    vv.addContact()
}