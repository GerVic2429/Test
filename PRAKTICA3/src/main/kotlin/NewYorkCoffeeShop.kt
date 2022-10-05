class NewYorkCoffeeShop(americanoPrice: Double, cappuccinoPrice:Double, lattePrice:Double):
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice){

    override fun makeAmericano() {
        americanoCount++
        println("Thanks for order Americano in NewYork Coffee Shop")
    }

    override fun makeCappuccino() {
        cappuccinoCount++
        println("Thanks for order Cappuccino in NewYork Coffee Shop")
    }

    override fun makeLatte() {
        latteCount++
        println("Thanks for order Latte in NewYork Coffee Shop")
    }
}