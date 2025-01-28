package com.josecatalani.behavioral.strategy

class ExpressShipping (override val name: String = "Express") : ShippingStrategy {
    override fun calculate(cost: Int): Double {
        return cost * 1.5
    }
}