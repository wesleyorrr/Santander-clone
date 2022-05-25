package br.com.map.santander.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import br.com.map.santander.data.Conta
import br.com.map.santander.local.FakeData

class MainViewModel : ViewModel(){
    private val mutableLiveData:MutableLiveData<Conta> = MutableLiveData()

    fun buscaContaCliete(): LiveData<Conta>{
        mutableLiveData.value = FakeData().getLocalData()

        return mutableLiveData
    }

}