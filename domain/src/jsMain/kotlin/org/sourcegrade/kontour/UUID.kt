package org.sourcegrade.kontour

actual typealias UUID = String

@JsName("crypto")
actual external object Crypto {
    actual fun randomUUID(): UUID
}
