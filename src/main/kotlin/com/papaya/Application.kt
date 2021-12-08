package com.papaya

import com.papaya.plugins.*
import io.ktor.application.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    configureHTTP()
    configureSecurity()
    configureRouting()
}