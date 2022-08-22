package JSON

class Contact{
    var contactName:String? = null
    var contactNumbers:List<String>? = null

    constructor(contactName: String?, contactNumbers: List<String>?) {
        this.contactName = contactName
        this.contactNumbers = contactNumbers
    }

    constructor()

}
