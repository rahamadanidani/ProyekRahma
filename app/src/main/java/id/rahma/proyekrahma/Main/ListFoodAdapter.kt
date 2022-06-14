package id.rahma.proyekrahma.Main
// perintah ini berfungsi untuk menyambungkan antara view yang satu dengan yang lainnya dalam sebuah aplikasi.
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import id.rahma.proyekrahma.R
import id.rahma.proyekrahma.data.Food

//membuat class listfood adapter.Dimana pada tampilan akan terdiri dari list makanan-makanan beserta
//dengan nama,foto dan keterangan atau deskripsi tentang makanan tersebut.
//Serta pada saat mengklik salah satu tampilan dari makanan yang berada pada list maka kita akan berada
//pada halaman detail.Yang mana akan menjelaskan secara detail tentang makanan tersebut.
class ListFoodAdapter(private val listFood: ArrayList<Food>) : RecyclerView.Adapter<ListFoodAdapter.ListViewHolder>() {

    private lateinit var onItemClickCallback : OnItemClickCallback

    fun setOnItemClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_row, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val food = listFood[position]

        Glide.with(holder.itemView.context)
            .load(food.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)

        holder.tvName.text = food.name
        holder.tvDetail.text = food.detail

        holder.itemView.setOnClickListener{
            onItemClickCallback.onItemClicked(listFood[holder.adapterPosition])
        }
    }

    override fun getItemCount(): Int {
        return listFood.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tvName: TextView = itemView.findViewById(R.id.tv_item_name)
        var tvDetail: TextView = itemView.findViewById(R.id.tv_item_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.img_photo)

    }

    interface OnItemClickCallback {
        fun onItemClicked(data : Food)
    }


}