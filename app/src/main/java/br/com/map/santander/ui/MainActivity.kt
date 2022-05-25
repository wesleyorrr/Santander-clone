package br.com.map.santander.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import br.com.map.santander.R
import br.com.map.santander.data.Conta

class MainActivity : AppCompatActivity() {

    private lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainViewModel =ViewModelProvider(this).get(MainViewModel::class.java)
        buscarContaCliente()
            }
    private fun  buscarContaCliente(){

        mainViewModel.buscaContaCliete().observe(this, Observer { result ->
            bindOnView(result)
        })


    }

    private fun bindOnView(conta : Conta){
        findViewById<TextView>(R.id.tv_agencia).text = conta.agencia
        findViewById<TextView>(R.id.tv_conta_corrente).text = conta.numero
        findViewById<TextView>(R.id.tv_saldo).text=conta.saldo
        findViewById<TextView>(R.id.tv_limite).text=conta.limite
        findViewById<TextView>(R.id.tv_usuario).text=conta.cliente.nome
        findViewById<TextView>(R.id.tv_cartao_final_value).text=conta.cartao.numeroCartao

    }
}