package com.example.superdemo

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<ProductModel> {
            val list = ArrayList<ProductModel>()
            list.add(
                ProductModel(
                    "https://ke.jumia.is/unsafe/fit-in/680x680/filters:fill(white)/product/26/982821/1.jpg?2066",
                    "Del Monte Juice 2L",
                    "Product Name: Del Monte Juice \nOrange 1L Brand Name:Del Monte",
                    "In Stock"
                )
            )
            list.add(
                ProductModel(
                    "https://159onlineshop.com/uploads/product_image/product_567_1.jpg",
                    "Kabras Sugar 2kg",
                    "Kabras Sugar 2kg - Sugar - \nFood Stuffs",
                    "In Stock"
                )
            )

            list.add(
                ProductModel(
                    "https://cdn.shortpixel.ai/client/q_glossy,ret_img,w_680/https://papkart.co.ke/wp-content/uploads/2020/06/Jogoo-2kg.jpg",
                    "Jogoo 2Kg",
                    "Product Name: Jogoo Maize \nFlour 2Kg, Brand Name: Jogoo, \nQuality: Top Quality",
                    "In Stock"
                )
            )
            list.add(
                ProductModel(
                    "https://cliqshop.co.ke/wp-content/uploads/2020/04/Highlands-Pineapple-Cordial-5L.jpg",
                    "Pineapple Cordial 5L",
                    "Highlands Pineapple Cordial 5L",
                    "In Stock"
                )
            )
            list.add(
                ProductModel(
                    "https://ke.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/42/197482/1.jpg?7117",
                    "WaistCoat (Men)",
                    "Fashion Mens Formal Premium \nButton Down Vest Waistcoat",
                    "Out of Stock"
                )
            )
            list.add(
                ProductModel(
                    "https://ke.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/08/943943/1.jpg?7763",
                    "Samsung A12",
                    "Samsung A12, 6.5, 4 GB + 64 GB \n(Dual SIM) 5000 MAH - Black",
                    "In Stock"
                )
            )
            list.add(
                ProductModel(
                    "https://ke.jumia.is/unsafe/fit-in/500x500/filters:fill(white)/product/79/717043/1.jpg?9598",
                    "Sports Shoe",
                    "Fashion Men's Sports Shoe \nBreathable Casual Shoes \nWhite A",
                    "In Stock"
                )
            )
            return list
        }
    }

}