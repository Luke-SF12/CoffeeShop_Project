class RndCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice), Biscuits {
    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in Rostov-on-Don!")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Cappuccino in Rostov-on-Don!")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in Rostov-on-Don!")
    }

    override fun sellBiscuits() {
        println("Take your biscuits")
    }

}