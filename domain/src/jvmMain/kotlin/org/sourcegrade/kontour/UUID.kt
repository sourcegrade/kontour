package org.sourcegrade.kontour

actual typealias UUID = java.util.UUID

actual object Crypto {
    actual fun randomUUID(): UUID = UUID.randomUUID()
}


