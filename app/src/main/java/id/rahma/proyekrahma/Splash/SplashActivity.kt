package id.rahma.proyekrahma.Splash
//fungsi dari program ini untuk menyambungkan satu activity ke activity lainnya.
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.rahma.proyekrahma.Main.MainActivity
import id.rahma.proyekrahma.R

class SplashActivity : AppCompatActivity() {
    //perintah berikut digunakan untuk memanggil kelas super onCreate untuk menyelesaikan
    // pembuatan aktivitas seperti hierarchy pada sebuah tampilan.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // pada kode program berikut ini digunakan untuk mengatur tata letak antarmuka pengguna
        // untuk aktivitas ini.
        //   Dimana file tata letak didefinisikan dalam file proyek res/layout/activity_splash
        setContentView(R.layout.activity_splash)
// perintah berikut berfungsi untuk layar pembuka yang menampilkan ikon
// aplikasi, dan transisi ke aplikasi itu sendiri.
        val splashScreen = Thread {
            try {
                //  untuk menunjukkan durasi animasi ikon layar pembuka.
                    //  Setelan ini tidak akan berpengaruh pada waktu aktual saat layar pembuka ditampilkan.
                Thread.sleep(3000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            } finally {
                val intent = Intent(this@SplashActivity, MainActivity::class.java)
                startActivity(intent)
            }
        }
        splashScreen.start()
    }
}