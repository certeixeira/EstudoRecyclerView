package br.com.productlistrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.productlistrecyclerview.adapter.AdapterProduct
import br.com.productlistrecyclerview.model.Product

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar!!.hide()
        val rvProducts = findViewById<RecyclerView>(R.id.rv_products)
        //orientação do linear layout vertical
        rvProducts.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        //otimizar lista
        rvProducts.setHasFixedSize(true)
        //configura adapter
        val productList: MutableList<Product> = mutableListOf()
        val adapterProduct = AdapterProduct(this, productList)
        rvProducts.adapter = adapterProduct

        val product1 = Product(
            R.drawable.ssd,
            "SSD SanDisk Plus 480GB",
            "Confiável, rápido e muita capacidade. A SanDisk, pioneira em tecnologias de armazenamento de estado sólido é a marca de confiança dos profissionais da área, oferece maior velocidade e desempenho com o SanDisk SSD Plus.",
            "R$ 450,00"
        )
        productList.add(product1)

        val product2 = Product(
            R.drawable.processador,
            "Intel Core i5 10400F",
            "Os novos processadores da 10ª geração oferecem atualizações de desempenho incríveis para melhorar a produtividade e proporcionar entretenimento surpreendente.",
            "R$ 1050,00"
        )
        productList.add(product2)

        val product3 = Product(
            R.drawable.memoria,
            "Memória Ram Corsair  8GB DDR4",
            "Memória Corsair Vengeance LPX, 8GB, 2666MHz, DDR4, C16, Preto.",
            "R$ 369,00"
        )
        productList.add(product3)

        val product4 = Product(
            R.drawable.placadevideo,
            "GeForce RTX 3090 24GB",
            "Os blocos de construção para a GPU mais rápida e eficiente do mundo, o novo Ampere SM traz 2X a taxa de transferência do FP32 e maior eficiência de energia.",
            "R$ 18.499,00"
        )
        productList.add(product4)

        val product5 = Product(
            R.drawable.teclado,
            "Teclado Mecânico Gamer T-Dagger Corvette",
            "Teclado Mecânico Gamer T-Dagger Corvette, LED Rainbow, Switch Outemu DIY Blue, ABNT2 - T-TGK302 -BL (PT-BLUE).",
            "R\$ 229,00"
        )
        productList.add(product5)

        val product6 = Product(
            R.drawable.gabinete,
            "Gabinete Gamer",
            "A série Carbide SPEC-DELTA RGB é uma caixa ATX de torre média de vidro temperado com estilo angular impressionante, fluxo de ar potente e três ventiladores de refrigeração RGB incluídos.",
            "R\$ 799,00"
        )
        productList.add(product6)

    }
}