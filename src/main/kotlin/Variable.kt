//Variable Constant untuk kebutuhan global
const val APPLICATION = "Belajar Kotlin"
const val VERSION = "0.0.1"

fun main() {

    // Variable ada Immutable dan Mutable
    // (Val) Immutable artinya variable tidak dapat diubah lagi
    // (Var) Mutable artinya variable dapat diubah kembali
    // Direkomendasikan ketika membuat variable yaitu Immutable

    val firstName = "Mohamad Syalva"
    val age = 25

    println(firstName)
    println(age)

    // Nullable
    // Tidak direkomendasikan membuat variable nullable
    var lastName: String? = null
    lastName = "Syalabi Rosyidy"
    // error karena lastName bisa null (di video error)
    println(lastName.length)
    // di video menggunakan code seperti dibawah
    println(lastName?.length)

    //==========================================================\\
    //Variable Constant
    //Disimpan sebelum fun main {...}
    //Cara memanggil const
    println("$APPLICATION $VERSION")
}