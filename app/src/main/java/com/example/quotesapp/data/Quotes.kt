package com.example.quotesapp.data

data class Quotes (val quoteText:String,val author:String ){

    override fun toString(): String {
        return "$quoteText- $author"
    }

}
