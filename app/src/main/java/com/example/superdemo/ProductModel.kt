package com.example.superdemo

class ProductModel(
    var productImage: String,
    var productName: String,
    var productDescription: String,
    var productInStock: String
) {
    constructor() : this(
        "",
        "",
        "",
        ""
    )
}