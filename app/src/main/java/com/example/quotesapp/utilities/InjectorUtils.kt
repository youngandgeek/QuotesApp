package com.example.quotesapp.utilities

import com.example.quotesapp.QuoteRepository
import com.example.quotesapp.data.FakeDatabase
import com.example.quotesapp.data.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun proviedeQuotesViewModelFactory():QuotesViewModelFactory{
        val quoteRepository=QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}
