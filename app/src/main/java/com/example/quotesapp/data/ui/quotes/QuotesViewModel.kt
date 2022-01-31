package com.example.quotesapp.data.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.quotesapp.QuoteRepository
import com.example.quotesapp.data.Quotes

class QuotesViewModel (private val quoteRepository: QuoteRepository):ViewModel() {

fun getQuotes()=quoteRepository.getQuotes()

fun addQuote(quotes: Quotes)=quoteRepository.addQuote(quotes)

}