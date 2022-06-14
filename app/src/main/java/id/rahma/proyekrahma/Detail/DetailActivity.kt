package id.rahma.proyekrahma.Detail
//perintah ini berfungsi untuk memanggil dan menampilkan konten dari aplikasi yang telah kita buat.
//yang disertai dengan gsmbar dan button dan juga tersambung dengan gradlenya.
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.request.RequestOptions
import com.bumptech.glide.request.target.Target
import id.rahma.proyekrahma.R
// membuat kelas aktivity detail.
class DetailActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_FOOD = "extra_food"
        const val EXTRA_FOOD_NAME = "extra_food_name"
        const val EXTRA_FOOD_DETAIL = "extra_food_detail"
    }
//perintah berikut digunakan untuk memanggil kelas super onCreate untuk menyelesaikan
// pembuatan aktivitas seperti hierarchy pada sebuah tampilan yang kemudian akan tersimpan.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    //pada kode program berikut ini digunakan untuk mengatur tata letak antarmuka pengguna
            // untuk aktivitas ini.
            // Dimana file tata letak didefinisikan dalam file proyek res/layout/activity_detail.xml.
        setContentView(R.layout.activity_detail)
// untuk detail nama maka akan dilakukan pemanggilan pada text view yang berada pada aktivity detail.
    // begitu juga dengan detail foto maka pemanggilannya atau dihubungkan dengan textview yang berada pada
    //aktivity detail pada bagian gambar detail.
        val name_detail = findViewById<TextView>(R.id.detail_name)
        val item_detail = findViewById<TextView>(R.id.detail_item)
        val photo_detail = findViewById<ImageView>(R.id.detail_image)

        val name = intent.getStringExtra(EXTRA_FOOD_NAME)
        val detail = intent.getStringExtra(EXTRA_FOOD_DETAIL)

        Glide.with(this)
            .load(intent.getIntExtra(EXTRA_FOOD, 0))
            .apply(RequestOptions().format(DecodeFormat.PREFER_ARGB_8888)
                .override(Target.SIZE_ORIGINAL))
            .into(photo_detail)

        name_detail.text = name.toString()
        item_detail.text = detail.toString()
// perintah ini digunakan untuk membagikan konten ke pengguna yang kita inginkan melalui sosial media
    //atau aplikasi-aplikasinya yang bisa digunakan.
        val btn_share = findViewById<Button>(R.id.btn_share)

        btn_share.setOnClickListener {
            val share = Intent(Intent.ACTION_SEND)
            share.type = "text/plain"
            val link = "https://www.inews.id/travel/kuliner/makanan-khas-indonesia"
            share.putExtra(Intent.EXTRA_SUBJECT, "Share")
            share.putExtra(Intent.EXTRA_TEXT, link)
            startActivity(Intent.createChooser(share, "share to"))
        }

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}