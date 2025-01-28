package com.josecatalani.behavioral.strategy

interface ShippingStrategy {
    val name: String
    fun calculate(cost: Int): Double
}