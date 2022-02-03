package br.com.productlistrecyclerview.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import br.com.productlistrecyclerview.R
import br.com.productlistrecyclerview.model.Product

class AdapterProduct(private val context: Context, private val produtos: MutableList<Product>) :
    RecyclerView.Adapter<AdapterProduct.ProductViewHolder>() {


    //responsável por criar visualizações
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemList = LayoutInflater.from(context).inflate(R.layout.hardwares_item, parent, false)
        val holder = ProductViewHolder(itemList)
        return holder
    }

    //responsável por exibir as visualiações para o usuário
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.foto.setImageResource(produtos[position].foto)
        holder.nome.text = produtos[position].nome
        holder.descricao.text = produtos[position].descricao
        holder.preco.text = produtos[position].preco

    }

    override fun getItemCount(): Int = produtos.size

    inner class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto = itemView.findViewById<ImageView>(R.id.imageProduct)
        val nome = itemView.findViewById<TextView>(R.id.tvNameProduct)
        val descricao = itemView.findViewById<TextView>(R.id.tvDescProduct)
        val preco = itemView.findViewById<TextView>(R.id.tvProductPrice)
    }
}