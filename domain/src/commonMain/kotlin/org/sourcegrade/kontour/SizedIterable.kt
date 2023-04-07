package org.sourcegrade.kontour

expect interface SizedIterable<out T> : Iterable<T> {
    fun limit(n: Int, offset: Long = 0): SizedIterable<T>
    fun count(): Long
    fun empty(): Boolean
    fun copy(): SizedIterable<T>
}
