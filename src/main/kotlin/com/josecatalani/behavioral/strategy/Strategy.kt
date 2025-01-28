package com.josecatalani.behavioral.strategy

fun main() {
    val shipping = Shipping()

    shipping.setShippingStrategy(ExpressShipping())
    println("The ${shipping.getStrategyName()} Strategy is applied with cost of ${shipping.checkout(2)}")

    shipping.setShippingStrategy(EconomyShipping())
    println("The ${shipping.getStrategyName()} Strategy is applied with cost of ${shipping.checkout(2)}")
}