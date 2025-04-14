package org.furmannsoft.studykpm

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform