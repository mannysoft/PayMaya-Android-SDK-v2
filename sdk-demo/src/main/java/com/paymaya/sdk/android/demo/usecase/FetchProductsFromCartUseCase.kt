package com.paymaya.sdk.android.demo.usecase

import com.paymaya.sdk.android.demo.data.CartProductsKeeper
import com.paymaya.sdk.android.demo.model.CartProduct

class FetchProductsFromCartUseCase(
    private val cartProductsKeeper: CartProductsKeeper
) {
    fun run(): List<CartProduct> =
        cartProductsKeeper.fetchProducts()

}