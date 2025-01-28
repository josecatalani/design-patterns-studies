package com.josecatalani.behavioral.strategy

class Shipping {
    private var shippingStrategy: ShippingStrategy? = null

    fun setShippingStrategy(shippingStrategy: ShippingStrategy) {
        this.shippingStrategy = shippingStrategy
    }

    fun getStrategyName(): String? {
        return this.shippingStrategy?.name
    }

    fun checkout(cost: Int): Double? {
        return this.shippingStrategy?.calculate(cost)
    }
}
