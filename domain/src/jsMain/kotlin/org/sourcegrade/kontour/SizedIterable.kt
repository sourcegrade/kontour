package org.sourcegrade.kontour

actual interface SizedIterable<out T> : Iterable<T> {
    actual fun limit(n: Int, offset: Long): SizedIterable<T>
    actual fun count(): Long
    actual fun empty(): Boolean
    actual fun copy(): SizedIterable<T>
}
