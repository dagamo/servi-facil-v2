package org.dagamo.servifacil

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform