package com.ismael.ynabreports.reports_feature.di

import android.content.Context
import com.ismael.ynabreports.reports_feature.data.remote.RetrofitClient
import com.ismael.ynabreports.reports_feature.data.remote.YnabApi
import com.ismael.ynabreports.reports_feature.data.repository.YnabRepositoryImpl
import com.ismael.ynabreports.reports_feature.domain.repository.YnabRepository

interface AppModule {
    val ynabApi: YnabApi
    val ynabRepository: YnabRepository
}
class AppModuleImpl (
    private val appContext: Context
): AppModule {
    override val ynabApi: YnabApi by lazy {
        RetrofitClient.ynabAPIService
    }

    override val ynabRepository: YnabRepository by lazy {
        YnabRepositoryImpl(ynabApi)
    }
}