package id.rahma.proyekrahma.About
// perintah ini berfungsi untuk memanggil dan menampilkan pada class lainnya.
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.rahma.proyekrahma.R
// membuat sebuah aktivity tentang(about).
class AboutActivity : AppCompatActivity() {
    //perintah berikut digunakan untuk memanggil kelas super onCreate untuk menyelesaikan
    // pembuatan aktivitas seperti hierarchy pada sebuah tampilan.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //pada kode program berikut ini digunakan untuk mengatur tata letak antarmuka pengguna
        // untuk aktivitas ini.
        // Dimana file tata letak didefinisikan dalam file proyek res/layout/ctivity_about.xml.
        setContentView(R.layout.activity_about)
    }
}