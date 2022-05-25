package br.com.map.santander.local

import br.com.map.santander.data.Cartao
import br.com.map.santander.data.Cliente
import br.com.map.santander.data.Conta

class FakeData{
    fun getLocalData():Conta{
        val cliente = Cliente("Wesley")
        val cartao = Cartao("125125456")

        return Conta("444456-4",
            "6554-8",
            "2.000",
            "5.000",
            cliente,
            cartao);
    }

}