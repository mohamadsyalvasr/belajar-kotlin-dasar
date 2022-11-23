fun main() {
    var firstName: String = "Mohamad Syalva"
    var lastName: String = "Syalabi Rosyidy"
    var address: String = """
        Sukabumi
        Jawa Barat
        Indonesia
    """.trimIndent()

    var addresses: String = """
        |Sukabumi
        |Jawa Barat
        |Indonesia
    """.trimMargin()

    println(firstName)
    println(lastName)
    println(address)
    println(addresses)

    // Menggabungkan String
    // var fullName: String = firstName + " " + lastName
    // println(fullName)

    // String Template (Direkomendasikan untuk melakukan operasi string)
    var fullName: String = "$firstName $lastName"
    var desc: String = "total karakter $fullName adalah ${fullName.length}"
    println(fullName)
    println(desc)
}