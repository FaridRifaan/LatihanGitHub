fun main() {
    print("Masukkan angka : ")
    val masukanAngka = readLine()!!.toInt()

    var bilangan = false
    for (i in 2..masukanAngka / 2) {
        if (masukanAngka % i == 0) {
            bilangan = true
            break
        }
    }
    if (!bilangan)
        println("$masukanAngka adalah bilangan prima.")
    else
        println("$masukanAngka bukan bilangan prima.")
}