package com.yummy.dicoding.myapp.data

import com.yummy.dicoding.myapp.model.Shop

object ShopData {
    private val shopImage = arrayOf(
        "https://photo.kontan.co.id/photo/2019/12/23/740853300p.jpg",
        "https://nos.jkt-1.neo.id/mcdonalds/assets/img/bg/img_visi.jpg",
        "https://www.nabatigroup.com/file/2014/05/IMG_2634-823x480.jpg",
        "https://piknikwisata.com/wp-content/uploads/2019/11/pasar-cisangkuy.jpg",
        "https://upload.wikimedia.org/wikipedia/commons/thumb/8/8c/Gerai_Ichiban_Sushi.jpg/1280px-Gerai_Ichiban_Sushi.jpg",
        "https://claytonresto.com/wp-content/uploads/2021/07/RKK01367-scaled.jpg",
        "https://images.bisnis-cdn.com/thumb/posts/2020/08/28/1284492/pzza-sarimelati-1.jpg?w=400&h=400",
        "https://3.bp.blogspot.com/-C8Po9smXKJY/Wh6MJr8o3-I/AAAAAAABezM/mSwgnqXhXs0ADussagnN2DRICqe2zkr1ACLcBGAs/s1600/IMG_20171129_182928.jpg",
        "https://2.bp.blogspot.com/-q0qqiyToBGU/Vvf10nP19_I/AAAAAAAAD_w/WKPqirIuUzsdxNXizDYQJ8C2CFudDvgAw/s1600/IMG_20160326_195241.jpg",
        "https://majalah.ottenstatic.com/uploads/2016/05/52.jpg",
        "https://lh3.googleusercontent.com/p/AF1QipMu5G92Q2aiuPAp9vdWH7Ek8MXFPeaHBUJcppZa=s1600-w400",
        "https://sumutupdate.com/wp-content/uploads/2020/10/IMG_20200928_192157.jpg",
        "https://2.bp.blogspot.com/-r4XQVP1Xa-A/Vur2rJw15eI/AAAAAAAADxg/60Fi89jTIug4-JhhTkkdoLGKRju_lK8pQ/s1600/IMG_20160317_162310.jpg",
        "https://bijb.co.id/sites/default/files/tenant-janjijiwa.jpg",
        "https://s.yimg.com/uu/api/res/1.2/LYUIQ338qK9oPzFEr_Lkfg--~B/aD0zNzk7dz02NzM7YXBwaWQ9eXRhY2h5b24-/https://media.zenfs.com/id/liputan6_hosted_772/01e9146fda14c56863606d4038dc9f90"
    )

    private val shopNames = arrayOf(
        "KFC",
        "Mc.Donald",
        "Richeese",
        "Cisangkuy",
        "Ichiban Sushi",
        "Clayton Cafe&Resto",
        "Pizza Hut",
        "Texas Chicken",
        "Kuali Nyonya",
        "Rimbun Coffee",
        "Mandy's Coffee",
        "Waroeng Steak & Shake",
        "KiosK",
        "Janji Jiwa",
        "Menantea Padang"
    )

    private val shopAddress = arrayOf(
        "Jl. Patimura No.23, Olo, Kec. Padang Bar., Kota Padang, Sumatera Barat 25115",
        "Jl. Bandar Damar No.18A, Olo, Kec. Padang Bar., Kota Padang, Sumatera Barat",
        "Jl. Jend. A Yani No.23, Kp. Jao, Kec. Padang Bar., Kota Padang, Sumatera Barat",
        "Jl. Rimbo Kaluang No.21, Rimbo Kaluang, Kec. Padang Bar., Kota Padang, Sumatera Barat 25111",
        "Jl. Khatib Sulaiman, Lolong Belanti, Kec. Padang Utara, Kota Padang, Sumatera Barat 25173",
        "Jl. Dr. Moh. Hatta No.56, RT.2, Binuang Kp. Dalam, Kec. Pauh, Kota Padang, Sumatera Barat 25176",
        "Jl. Jend. A Yani No.21, Kp. Jao, Kec. Padang Bar., Kota Padang, Sumatera Barat 25114",
        "Jl. Gereja No.40, Belakang Tangsi, Kec. Padang Bar., Kota Padang, Sumatera Barat",
        "Jl. Olo Ladang, Olo, Kec. Padang Bar., Kota Padang, Sumatera Barat 25117",
        "Jl. KIS. Mangunsarkoro, Jati Baru, Kec. Padang Tim., Kota Padang, Sumatera Barat 25129",
        "Jl. Hayam Wuruk No.Kel, Belakang Tangsi, Kec. Padang Bar., Kota Padang, Sumatera Barat",
        "Jl. Kp. Nias V Kel No.1, Belakang Pd., Kec. Padang Sel., Kota Padang, Sumatera Barat 25211",
        "Jl. Tepi Pasang No.40-46, Kp. Pd., Kec. Padang Bar., Kota Padang, Sumatera Barat 25119",
        "Jl. Dr. Sutomo No.125, Kubu Marapalam, Kec. Padang Tim., Kota Padang, Sumatera Barat 25143",
        "Jl. Batang Arau No.34, Berok Nipah, Kec. Padang Bar., Kota Padang, Sumatera Barat 25134"
    )

    private val shopRating = doubleArrayOf(
        4.4, 4.3, 4.4, 4.3, 2.4, 4.3, 4.5, 4.3, 4.4, 4.6, 4.5, 4.4, 4.5, 4.5, 4.5
    )

    private val shopDistance = doubleArrayOf(
        2.1, 3.5, 4.2, 2.0, 1.0, 0.9, 0.1, 5.2, 1.2, 0.5, 1.3, 3.2, 4.3, 1.2, 1.0
    )

    private val shopTelPhone = arrayOf(
        "(0751)22339",
        "08119790244",
        null,
        "081270292853",
        null,
        "089620818565",
        "08113249092",
        "(0751)23621",
        "(0751)8955351",
        "(0751)8950075",
        "(0751)810289",
        "082242520000",
        "(0751)893199",
        "081266702006",
        null
    )

    private val shopWebsite = arrayOf(
        null,
        "http://www.mcdonalds.co.id/",
        "http://www.richeesefactory.com/",
        "https://kedai-cisangkuy-gor-padang.business.site/",
        "http://www.ichibansushi.co.id/location",
        null,
        "https://www.pizzahut.co.id/",
        "http://texaschicken.co.id/",
        "https://kualinyonya.business.site/",
        "http://rimbun-espresso-brew-bar-padang.business.site/",
        "https://mandys-ice-cream-cafe.business.site/",
        "http://waroengsteakandshake.com/",
        "https://kiosk-restaurant.business.site/",
        null,
        null
    )

    private val shopDesc = arrayOf(
        """
            KFC (kependekan dari Kentucky Fried Chicken), adalah jaringan restoran cepat saji Amerika yang berkantor pusat di Louisville, Kentucky, yang berspesialisasi dalam ayam goreng. Ini adalah jaringan restoran terbesar kedua di dunia (diukur berdasarkan penjualan) setelah McDonald's, dengan 22.621 lokasi secara global di 150 negara pada Desember 2019. Jaringan restoran ini adalah anak perusahaan dari Yum! Brands, sebuah perusahaan restoran yang juga membawahi Pizza Hut, Taco Bell, dan WingStreet.
        """.trimIndent(),
        """
            McDonald's Corporation adalah perusahaan makanan cepat saji Amerika, yang didirikan pada tahun 1940 sebagai restoran yang dioperasikan oleh Richard dan Maurice McDonald, di San Bernardino, California, Amerika Serikat. Mereka mengisi ulang bisnis mereka sebagai kios hamburger, dan kemudian mengubah perusahaan menjadi waralaba, dengan logo Golden Arches diperkenalkan pada tahun 1953 di sebuah lokasi di Phoenix, Arizona. Pada tahun 1955, Ray Kroc, seorang pengusaha, bergabung dengan perusahaan sebagai agen waralaba dan mulai membeli rantai dari McDonald bersaudara. McDonald's memiliki kantor pusat aslinya di Oak Brook, Illinois, tetapi memindahkan kantor pusat dunianya ke Chicago pada Juni 2018.
        """.trimIndent(),
        """
            Richeese Factory adalah sebuah jaringan rumah makan siap saji asal Indonesia dengan menu utama ayam goreng dan keju yang dimiliki oleh PT Richeese Kuliner Indonesia, anak usaha Kaldu Sari Nabati. Richeese Factory membuka gerai pertamanya di pusat perbelanjaan Paris Van Java, Bandung, pada 8 Februari 2011. Hingga bulan Desember 2018, restoran ini memiliki 130 gerai yang tersebar di wilayah Indonesia.
        """.trimIndent(),
        """
            Kedai Cisangkuy GOR Padang berdiri pada tanggal 07 Juni 2016. Menyediakan aneka makanan berat, cemilan serta minuman. Menerima reservasi ulang tahun, arisan, catering dll. Menyediakan ruang meeting dengan fasilitas infocus dan sound system. Memiliki banyak space untuk perayaan ulang tahun serta menyediakan fasilitas Wifi. Kami siap memberikan pelayanan terbaik buat pelanggan setia kami dimanapun berada.
        """.trimIndent(),
        """
            Ichiban Sushi adalah rumah makan masakan Jepang full-service dengan jumlah outlet terbanyak di Indonesia, yang telah hadir lebih dari dua dekade. Hidangan utama di restoran Ichiban Sushi adalah sushi roll, tetapi mereka juga menyajikan hidangan-hidangan Jepang lainnya yang disesuaikan dengan selera masyarakat Indonesia.
        """.trimIndent(),
        """
            Clayton Cafe & Resto Juanda adalah Resto dan Cafe yang berkonsep sebuah bar dengan mengusung tema “onestop shopping culinary”. Nusantara, Western, Japanese, dan Chinese. Untuk minuman kami menyajikan minuman berkelas bar, seperti : Mocktail, Mojito, dan Coffee yang biasanya hanya tersedia di bar hotel berbintang seperti Irish Coffee.
        """.trimIndent(),
        """
            Pizza Hut adalah rantai restoran Amerika dan waralaba internasional yang didirikan pada tahun 1958 di Wichita, Kansas oleh Dan dan Frank Carney. Perusahaan ini dikenal dengan menu masakan Italia-Amerika, termasuk pizza dan pasta, serta lauk dan makanan penutup. Pizza Hut memiliki 18.703 restoran di seluruh dunia pada tanggal 31 Desember 2019, menjadikannya rantai pizza terbesar di dunia dalam hal lokasi. Ini adalah anak perusahaan dari Yum! Brands, Inc., salah satu perusahaan restoran terbesar di dunia.
        """.trimIndent(),
        """
            Church's Chicken adalah rumah makan siap saji ayam goreng dari Amerika Serikat. Di luar Amerika Utara (termasuk di Indonesia), rumah makan ini beroperasi dengan nama Texas Chicken. Jaringan rumah makan ini didirikan oleh George W. Church, Sr. pada 17 April 1952 di San Antonio berseberangan dengan The Alamo. Kantor pusatnya di Sandy Springs, Georgia. Church's Chicken adalah restoran berantai ayam goreng terbesar nomor empat di dunia setelah KFC, Chick-fil-A, dan mantan jaringan restoran saudari dari Church's Chicken, Popeyes.
        """.trimIndent(),
        """
            Kuali Nyonya adalah sebuah usaha kafe yang berdiri sejak tahun 2017. Menyediakan tempat yang nyaman dan alami. Yang beralamat diJalan Olo Ladang kelurahan olo kecamatan padang barat Kota Padang Sumatera Barat. 
        """.trimIndent(),
        """
            Langkah kecil kami bermula sejak 2011 dengan bendera Rumah Kopi Nunos, dengan mimpi membangun sebuah ekosistem kopi di sebuah Kota kecil di Pantai Barat Sumatera. Walaupun tidak sepenuhnya tepat untuk disebut mimpi, karena dalam sebuah catatan dagang pernah tertulis bahwa pada akhir abad 18 kapal berbendera Amerika Serikat membawa 2.000 pikul Kopi dari tanah ini. Berbekal mimpi dan kepingan sejarah, kami mencoba membangkit masa lalu dalam setiap cangkir kopi yang kami suguhkan. Dalam perjalanan yang tidak pernah mudah, kami berganti nama menjadi Rimbun Espresso and Brew Bar pada 2015. Namun yang hingga hari ini tidak terganti adalah semangat untuk selalu menyuguhkan kopi pilihan dari tanah kami sendiri, tanah Andalas.
        """.trimIndent(),
        """
            Mandy's Ice cream & Cafe berdiri sejak Tahun 2014. Mandy's Ice cream & Cafe berlokasi di Jalan Hayam Wuruk no.10C, Kelurahan Belakang Tangsi, Kecamatan Padang Barat Kota Padang. Mandy's Ice cream & Cafe siap bersaing dengan bisnis - bisnis sejenisnya di area Kota Padang. Jika memerlukan informasi mengenai Mandy's Ice cream & Cafe, silakan hubungi kami di nomor telepon yang tertera pada website.
        """.trimIndent(),
        """
            Pada awalnya, usaha ini didirikan di teras rumah kontrakan oleh Jody Brotosuseno (@JodyWaroeng) dan istrinya Siti Hariyani (@Anieksiti) di Jalan Cenderawasih no. 30 Yogyakarta. Usaha ini tidak terlepas dari pengaruh ayah Jody. Sebelum mempunyai usaha sendiri, mereka berdua telah aktif membantu usaha ayah Jody yang memang telah lebih dulu berkecimpung di dunia bisnis restoran steak bernama Obonk Steak. Obonk Steak memang sudah cukup lama berdiri di Yogyakarta dan sasaran konsumen restoran ini adalah kelas menengah ke atas. Dari sinilah, Aniek (nama panggilan Siti Haryani) dan Jody mempunyai ide untuk membuka tempat makan steak yang dapat menyentuh lapisan menengah ke bawah.
        """.trimIndent(),
        """
            Kiosk berdiri tahun 2014. Berlokasi di Jalan Tepi No. 40-42, Kampung Pondok. Kiosk mampu bersaing dengan bisnis-bisnis lainnya pada area Kota Padang. Melalui produk andalannya yaitu ayam goreng rawit, sirloin steak, salmon steak, lalu untuk minuman Kiosk menyediakan cold brew, magic dan berbagai makanan dan minman lainnya. Yang berasal dari bahan-bahan terbaik dan dibuat secara home made mampu memberikan makanan dan minuman yang berkualitas untuk seluruh pelanggan setianya
        """.trimIndent(),
        """
            Janji Jiwa adalah kedai kopi asli Indonesia milik PT. Luna Boga Narayan yang didirikan pertama kali oleh Billy Kurniawan selaku Business Owner di ITC Kuningan pada tahun 2018. Sebelumnya, PT. Luna Boga Narayan telah sukses membangun brand bisnis minuman Think Thai Tea dan Go Mango yang merupakan minuman khas Thailand yang sudah memiliki banyak cabang di berbagai wilayah sejak tahun 2017.
        """.trimIndent(),
        """
            Menantea, brand teh buah modern di Indonesia yang diprakarsai oleh Hendy Setiono (Founder of BabaRafi Enterprise), Sylvia (Founder of Kopi Soe), Bisma Adi Putra (Founder & CEO of Masakin Group), Jehian Panangian Sijabat (Direktur Utama Mantappu Corp), dan Jerome Polin (Pendiri Mantappu Corp) hadir memberikan warna baru dengan varian teh buah. Menantea telah membuktikan kesuksesannya dengan terus melebarkan sayap hingga membuka 122 toko di 55 kota seluruh Indonesia hanya dalam kurun waktu tujuh bulan.
        """.trimIndent()
    )

    val listData: ArrayList<Shop>
        get() {
            val list = arrayListOf<Shop>()
            for (position in shopNames.indices) {
                val shop = Shop()
                shop.image = shopImage[position]
                shop.name = shopNames[position]
                shop.address = shopAddress[position]
                shop.rating = shopRating[position]
                shop.distance = shopDistance[position]
                shop.telphone = shopTelPhone[position].toString()
                shop.website = shopWebsite[position].toString()
                shop.description = shopDesc[position]
                list.add(shop)
            }

            return list
        }
}