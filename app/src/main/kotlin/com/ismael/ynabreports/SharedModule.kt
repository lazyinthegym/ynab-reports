package com.ismael.ynabreports
import com.ismael.ynabreports.reports_feature.data.remote.RetrofitClient
import com.ismael.ynabreports.reports_feature.data.remote.YnabApi
import com.ismael.ynabreports.reports_feature.data.repository.YnabRepositoryImpl
import com.ismael.ynabreports.reports_feature.domain.repository.YnabRepository
import com.ismael.ynabreports.reports_feature.domain.use_case.GetCategoriesUseCase
import com.ismael.ynabreports.reports_feature.presentation.pie_chart.PieChartViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val sharedModule = module {
    single<YnabApi> { RetrofitClient.ynabAPIService }

    single<YnabRepository> { YnabRepositoryImpl( ynabApi = get()) }

    single<GetCategoriesUseCase> { GetCategoriesUseCase(ynabRepository = get()) }

    viewModel { PieChartViewModel(getCategoriesUseCase = get())}

}