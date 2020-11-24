package com.praktikum7

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

// digunakan untuk membuat class
class CommunicationViewModel : ViewModel(){
    // membuat variabel string
    private val mName = MutableLiveData<String>()
    val name : LiveData<String>
        //method untuk mengambil nama
        get() = mName
    //method untuk setName yang dimasukkan ke mName
    fun setName(name:String){
        mName.value = name
    }
}

