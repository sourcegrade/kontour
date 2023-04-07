package org.sourcegrade.kontour

expect class UUID

expect object Crypto {
    fun randomUUID(): UUID
}
