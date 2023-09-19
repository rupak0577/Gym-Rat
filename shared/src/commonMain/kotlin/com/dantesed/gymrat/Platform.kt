package com.dantesed.gymrat

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform