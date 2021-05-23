package com.example.superdemo

class ProductModel(
    var productImage: String,
    var productName: String,
    var productDescription: String,
    var productInStock: String,
    var supermarketOneName: String,
    var supermarketOnePrice: String,
    var supermarketTwoName: String,
    var supermarketTwoPrice: String
) {
    constructor() : this(
        "",
        "",
        "",
        "",
        "",
        "",
        "",
        ""
    )
}