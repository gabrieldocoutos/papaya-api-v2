package com.example

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.example.plugins.*
import io.ktor.application.*


//fun main() {
//    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
//        configureHTTP()
//        configureSecurity()
//        configureRouting()
//    }.start(wait = true)
//}

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module() {
    configureHTTP()
    configureSecurity()
    configureRouting()
}

//fun main(args: Array<String>) {
//    configureHTTP()
//    configureSecurity()
//    configureRouting()
//    EngineMain.main(args)
//}
