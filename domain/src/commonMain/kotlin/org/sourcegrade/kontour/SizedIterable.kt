/*
 *   Kontour - SourceGrade.org
 *   Copyright (C) 2023 Alexander Städing
 *   Copyright (C) 2023 Contributors
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package org.sourcegrade.kontour

expect interface SizedIterable<out T> : Iterable<T> {
    fun limit(n: Int, offset: Long): SizedIterable<T>
    fun count(): Long
    fun empty(): Boolean
    fun copy(): SizedIterable<T>
}
