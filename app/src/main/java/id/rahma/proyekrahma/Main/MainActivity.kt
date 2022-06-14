package id.rahma.proyekrahma.Main
//perintah dibawah digunakan untuk pemanggilan serta menyambungkan satu activity satu dengan yang lainnya
//serta dengan view ,dan class yang ada dalam proyekrahma.
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import id.rahma.proyekrahma.About.AboutActivity
import id.rahma.proyekrahma.Detail.DetailActivity
import id.rahma.proyekrahma.R
import id.rahma.proyekrahma.data.Food
import id.rahma.proyekrahma.About.FoodData

//Membuat class main aktiviti
class MainActivity : AppCompatActivity() {

    private lateinit var rvFood: RecyclerView
    private var list: ArrayList<Food> = arrayListOf()

    //perintah berikut digunakan untuk memanggil kelas super onCreate untuk menyelesaikan
    // pembuatan aktivitas seperti hierarchy pada sebuah tampilan.
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //pada kode program berikut ini digunakan untuk mengatur tata letak antarmuka pengguna
        // untuk aktivitas ini.
        // Dimana file tata letak didefinisikan dalam file proyek res/layout/activity_main.xml.
        setContentView(R.layout.activity_main)

        rvFood = findViewById(R.id.rv_foods)
        rvFood.setHasFixedSize(true)
// semua data makanan ditampilkan berupa list dari semua data makanan yang sudah di iinputkan.
        list.addAll(FoodData.listData)
        showRecylerList()
    }

    private fun showRecylerList() {
        rvFood.layoutManager = LinearLayoutManager(this)
        val listFoodAdapter = ListFoodAdapter(list)
        rvFood.adapter = listFoodAdapter

        listFoodAdapter.setOnItemClickCallback(object : ListFoodAdapter.OnItemClickCallback {

            // pada tampilan activity detail,konten akan menampilkan berupa nama data,foto beserta data detailnya
            //seperti sebuah deskripsi yang menjelaskan tentang tampilan tersebut.
            override fun onItemClicked(data: Food) {
                val intent = Intent(this@MainActivity, DetailActivity::class.java)
                with(intent) {
                    val name = data.name
                    val detail = data.detail
                    val photo = data.photo

                    putExtra(DetailActivity.EXTRA_FOOD_NAME, name)
                    putExtra(DetailActivity.EXTRA_FOOD_DETAIL, detail)
                    putExtra(DetailActivity.EXTRA_FOOD, photo)

                    startActivity(intent)
                }

            }

        })

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMenu(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMenu(selectedMenu: Int) {
        when(selectedMenu) {
            R.id.about -> {
                val intent = Intent(this@MainActivity, AboutActivity::class.java)
                startActivity(intent)
            }
        }
    }
}