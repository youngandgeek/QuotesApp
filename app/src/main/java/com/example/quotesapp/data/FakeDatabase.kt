package com.example.quotesapp.data

import java.util.concurrent.locks.Lock

class FakeDatabase private constructor(){
var quoteDao=FakeQuoteDao()
    private set

    companion object{
        @Volatile private var instance:FakeDatabase?=null
        fun getInstance()= instance?: synchronized(this){
            instance?:FakeDatabase().also { instance=it }
        }

    }

}