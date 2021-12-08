package com.papaya.plugins

import io.ktor.routing.*
import io.ktor.application.*
import io.ktor.response.*

fun Application.configureRouting() {

    routing {
        get("/") {
                call.respondText("Hello World!!")
        }
        get("/users") {
            call.respondText("meu deus, mentirsss?")
        }
    }
}
