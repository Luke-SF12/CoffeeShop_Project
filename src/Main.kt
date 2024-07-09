import kotlin.system.exitProcess

fun main() {

    val sochiCoffeeShop = SochiCoffeeShop(2.0, 2.5, 2.5)
    val rndCoffeeShop = RndCoffeeShop(1.5, 2.0, 2.0)
    var currentCoffeeShop: CoffeeShop


    while (true) {
        println("Hello, choose a city: \n1. Sochi\n2. Rostov-on-Don\n3. Exit")
        val city = readLine()
        currentCoffeeShop = when (city) {
            "1" -> sochiCoffeeShop
            "2" -> rndCoffeeShop
            "3" -> break
            else -> {
                println("ERROR")
                continue
            }
        }
        chooseDrink(currentCoffeeShop)
    }
}

private fun chooseDrink(currentCoffeeShop: CoffeeShop) {
    println("Choose a drink: \n1. Americano\n2. Cappuccino\n3. Latte\n4. Show statistics")
    val drink = readLine()
    when (drink) {
        "1" -> {
            currentCoffeeShop.makeAmericano()
            checkAndAskForBuiscuits(currentCoffeeShop)
        }

        "2" -> {
            currentCoffeeShop.makeCappuccino()
            checkAndAskForBuiscuits(currentCoffeeShop)
        }

        "3" -> {
            currentCoffeeShop.makeLatte()
            checkAndAskForBuiscuits(currentCoffeeShop)
        }

        "4" -> currentCoffeeShop.showStatistics()
        else -> {
            println("ERROR")
            exitProcess(1)
        }
    }
}

private fun checkAndAskForBuiscuits(currentCoffeeShop: CoffeeShop) {
    if (currentCoffeeShop is Biscuits) {
        println("Would you like biscuits?")
        println("1. Yes\n2. No")

        val isBiscuits = readLine()
        if (isBiscuits == "1") {
            currentCoffeeShop.sellBiscuits()
        }
    }
}