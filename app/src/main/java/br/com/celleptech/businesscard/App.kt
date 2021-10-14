package br.com.celleptech.businesscard

import android.app.Application
import br.com.celleptech.businesscard.data.AppDatabase
import br.com.celleptech.businesscard.data.BusinessCardRepository


class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { BusinessCardRepository(database.businessDao()) }
}