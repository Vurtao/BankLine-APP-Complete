package me.dio.bankline.data.remote

import me.dio.bankline.domain.Movimentacao
import retrofit2.http.GET
import retrofit2.http.Path


interface BanklineAPI {

    @GET("movimentacoes/{id}")
    suspend fun findBankStatement(@Path("id") accountHolder: Int): List<Movimentacao>
}