package com.pemmob.melysaayu.data.dummy
import com.pemmob.melysaayu.data.model.Category
import com.pemmob.melysaayu.data.model.Product

object DummyData {
    val categories = listOf(
        Category(id = 1, name = "Makanan", description = "Aneka Makanan Lokal", products_count = 5),
        Category(id = 2, name = "Minuman", description = "Minuman Segar", products_count = 5),
        Category(id = 3, name = "Kerajinan", description = "Kerajinan Tangan", products_count = 5)
    )

    val products = listOf(
        // Makanan
        Product(id = 1, category_id = 1, category = categories[0], name = "Kripik Singkong", description = "Kripik Gurih", price = 15000.0, stock = 30, img = "dummy_product"),
        Product(id = 2, category_id = 1, category = categories[0], name = "Mendoan", description = "Mendoan Khas Banyumas", price = 20000.0, stock = 25, img = "dummy_product"),
        Product(id = 3, category_id = 1, category = categories[0], name = "Sale Pisang", description = "Sale Manis", price = 25000.0, stock = 20, img = "dummy_product"),
        Product(id = 4, category_id = 1, category = categories[0], name = "Getuk Goreng", description = "Getuk Manis Sokaraja", price = 30000.0, stock = 40, img = "dummy_product"),
        Product(id = 5, category_id = 1, category = categories[0], name = "Nopia", description = "Nopia Khas Purbalingga", price = 22000.0, stock = 15, img = "dummy_product"),

        // Minuman
        Product(id = 6, category_id = 2, category = categories[1], name = "Es Dawet", description = "Dawet Ayu Segar", price = 10000.0, stock = 50, img = "dummy_product"),
        Product(id = 7, category_id = 2, category = categories[1], name = "Kopi Robusta", description = "Kopi Hitam Lokal", price = 15000.0, stock = 30, img = "dummy_product"),

        // Kerajinan
        Product(id = 8, category_id = 3, category = categories[2], name = "Batik Purbalingga", description = "Kain Batik Khas", price = 150000.0, stock = 10, img = "dummy_product"),
        Product(id = 9, category_id = 3, category = categories[2], name = "Sapu Glagah", description = "Sapu Lantai Awet", price = 25000.0, stock = 40, img = "dummy_product")
    )
}