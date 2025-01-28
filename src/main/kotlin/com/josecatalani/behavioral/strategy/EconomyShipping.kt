package com.josecatalani.behavioral.strategy

class EconomyShipping (override val name: String = "Economy") : ShippingStrategy {
    override fun calculate(cost: Int): Double {
        return cost * 1.2
    }
}