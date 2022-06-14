package id.rahma.proyekrahma.About
// perintah dibawah ini digunakan untuk pemanggilan class data food yang berada pada proyekrahma
import id.rahma.proyekrahma.R
import id.rahma.proyekrahma.data.Food

object FoodData {
//perintah dibawah merupakan nama-nama dari makanan yang disimpan menjadi satu variabel.
    private val foodNames = arrayOf(
        "Rendang",
        "Rawon",
        "Sate",
        "Soto",
        "Nasi Goreng",
        "Gado - Gado",
        "Bakso",
        "Ketoprak",
        "Pempek",
        "Bubur Ayam"
    )

// pada setiap nama makanan akan dilengkapi dengan deksripsi singkat tentang makanan tersebut.
    private val foodDetails = arrayOf(
        "Makanan khas Indonesia yang populer hingga mancanegara adalah rendang. Rendang atau randang adalah masakan daging asli Indonesia yang berasal dari Minangkabau. Makanan ini sangat populer di Indonesia dan wilayah-wilayah Asia Tenggara karena kelezatannya. Bahkan, saking populer dan lezat, rendang telah dinobatkan sebagai hidangan yang menduduki peringkat pertama dalam daftar World's 50 Most Delicious Foods versi CNN International",
        "Makanan khas Indonesia di urutan berikutnya adalah rawon. Masakan berkuah asal Surabaya ini belum lama ini meraih prestasi sebagai hidangan sup terenak se-Asia. Rawon, seperti yang kita tahu adalah sup daging berkuah hitam dengan campuran bumbu khas yang menggunakan kluwek. Makanan ini terkenal di Pulau Jawa, khususnya Jawa Timur. ",
        "Berikutnya ada sate atau satai, makanan khas Indonesia yang banyak dijumpai dan mempunyai beragam versi sesuai dengan daerah masing-masing. Ini merupakan makanan berupa daging, baik ayam, sapi, atau kambing, yang dipotong kecil-kecil dan ditusuk sedemikian dengan tusukan lidi, lalu dipanggang menggunakan bara arang kayu. Sate kemudian disajikan dengan berbagai macam bumbu yang tergantung dengan variasi resep sate.",
        "Makanan khas Indonesia selanjutnya adalah soto. Walau banyak variasinya, soto pada umumnya adalah hidangan berkuah seperti sup yang terbuat dari kaldu daging dan sayuran. Berbagai daerah di Indonesia memiliki soto khas daerahnya masing-masing dengan komposisi yang berbeda-beda, misalnya soto Madura, soto Kediri, soto Pemalang, soto Lamongan, soto Jepara, soto Semarang, soto Kudus, soto Betawi, soto Padang, soto Bandung, sroto Sokaraja, soto Banjar, soto Medan, hingga coto Makassar.",
        "Makanan khas Nusantara yang sangat terkenal di luar negeri adalah nasi goreng. Nasi goreng juga dikenal sebagai masakan nasional Indonesia. Sesuai namanya, nasi goreng adalah hidangan nasi yang digoreng. Umumnya, nasi digoreng bersama kecap manis, bawang merah, bawang putih, lada dan bumbu-bumbu lainnya. Kemudian disajikan bersama telur, ayam, dan kerupuk.",
        "Makanan khas Indonesia yang juga masuk ke dalam jajaran masakan nasional Indonesia adalah gado-gado. Ini merupakan masakan asal Jakarta yang terbuat dari sayur-sayuran yang direbus dan dicampur jadi satu, dengan bumbu kacang atau saus dari kacang tanah dan yang dihaluskan disertai irisan telur. Rasa gado-gado semakin mantap jika ditambah taburan bawang goreng dan kerupuk",
        "Selanjutnya ada bakso. Meski sebenarnya makanan ini berasal dari seni kuliner Tionghoa-Indonesia, namun hidangan ini identik dengan Indonesia. Ini merupakan jajanan yang sangat populer di Indonesia, dan ada di setiap sudut kota. Mulai dari gerobak pedagang kaki lima hingga restoran besar.",
        "Makanan khas Indonesia yang populer berikutnya adalah ketoprak. Ketoprak merupakan kuliner yang menggunakan ketupat dan bahan-bahan lainnya meliputi tahu, bihun, mentimun, taoge, dan bisa juga memakai telur rebus yang dilengkapi dengan saus kacang, kecap manis, dan taburan bawang merah goreng. Lebih mantap lagi jika disajikan dengan taburan kerupuk di atasnya. Yummy!",
        "Selanjutnya ada pempek atau empek-empek. Makanan ini asalnya dari Palembang, Sumatera Selatan. Makanan ini terbuat dari daging ikan yang digiling lembut, dicampur tepung kanji atau tepung sagu, serta komposisi beberapa bahan lain. Misalnya, telur, bawang putih yang dihaluskan, penyedap rasa, dan garam. Pempek biasanya disajikan dengan kuah cuka yang memiliki rasa asam, manis, dan pedas.",
        "Terakhir adalah bubur. Makanan ini juga mempunyai ragam variasi tergantung dari daerah asalnya. Pada umumnya, bubur disajikan dengan irisan daging ayam dengan beberapa bumbu, seperti kecap asin dan kecap manis, merica, garam, dan kadang-kadang diberi kaldu ayam. Hidangan ini juga dilengkapi dengan taburan daun bawang cincang, bawang goreng, seledri, tongcai (sayur asin), cakwe, dan kerupuk. Anda tim diaduk atau tidak diaduk?."
    )
// pemanggilan pada foto setiap makan telah disimpan dan diinputkan pada drawable.
    private val foodImages = intArrayOf(
        R.drawable.rendang,
        R.drawable.rawon,
        R.drawable.sate,
        R.drawable.soto,
        R.drawable.nasi,
        R.drawable.gado,
        R.drawable.bakso,
        R.drawable.ketoprak,
        R.drawable.pempek,
        R.drawable.bubur
    )
// pada list data makanan akan tampilannya terdiri dari nama makanan,detail serta foto dari masing-masing makanannya.
    val listData: ArrayList<Food>
    get() {
        val list = arrayListOf<Food>()
        for (position in foodNames.indices) {
            val food = Food()
            food.name = foodNames[position]
            food.detail = foodDetails[position]
            food.photo = foodImages[position]
            list.add(food)
        }
        return list
    }


}