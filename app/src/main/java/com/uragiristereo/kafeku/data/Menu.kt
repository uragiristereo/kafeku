package com.uragiristereo.kafeku.data

enum class Menu(
    val code: String,
    val type: MenuType,
    val nama: String,
    val description: String,
    val price: Int,
) {
    KopiHitam(
        code = "B01",
        type = MenuType.Minuman,
        nama = "Kopi Hitam",
        description = "Kopi Hitam dibuat dengan teknik espresso, dimana biji kopi yang digunakan yaitu berasal dari Aceh Gayo jenis Arabika, disajikan dengan gula terpisah",
        price = 10000,
    ),
    Cappucino(
        code = "B02",
        type = MenuType.Minuman,
        nama = "Cappuccino",
        description = "Paduan kopi dengan buih susu kental serta menggunakan sirup karamel, dimana biji kopi yang digunakan berasal dari Gunung Puntang Jawa Barat jenis Robusta",
        price = 20000,
    ),
    SparklingTea(
        code = "M03",
        type = MenuType.Minuman,
        nama = "Sparkling Tea",
        description = "Minuman Teh yang menggunakan daun teh dari pegunungan daerah Garut dengan tambahan sari melati asli dan gula merah alami",
        price = 15000,
    ),
    Batagor(
        code = "F01",
        type = MenuType.Makanan,
        nama = "Batagor",
        description = "Baso dan Tahu Goreng dengan sajian bumbu kacang dan kecap khas Bandung",
        price = 25000,
    ),
    Cireng(
        code = "F02",
        type = MenuType.Makanan,
        nama = "Cireng",
        description = "Makanan ringan berupa tepung kanji goreng isi bahan dasar tempe fermentasi yang disebut oncom, disajikan dengan bumbu kacang pedas",
        price = 10000,
    ),
    NasiGoreng(
        code = "F03",
        type = MenuType.Makanan,
        nama = "Nasi Goreng",
        description = "Nasi goreng ayam yang disajikan dengan telur mata sapi disertai satai ayam",
        price = 50000,
    ),
    CheeseCake(
        code = "D01",
        type = MenuType.Dessert,
        nama = "Cheese Cake",
        description = "Kue Tart 1 slice dengan bahan utama cream cheese dengan topping buah-buahan asli seperti anggur, jeruk, kiwi",
        price = 40000,
    ),
    BlackSalad(
        code = "D02",
        type = MenuType.Dessert,
        nama = "Black Salad",
        description = "Potongan buah-buahan segar yang terdiri dari pepaya, jambu, melon, dan mangga disajikan dengan bumbu rujak kacang pedas dan gula merah",
        price = 30000,
    ),
}
