package com.example.menu.dataSource.network

import io.ktor.client.*

expect class KtorClientFactory() {
    fun build(): HttpClient
}