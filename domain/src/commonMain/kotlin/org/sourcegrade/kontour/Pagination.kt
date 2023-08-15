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

import kotlin.reflect.KProperty1

interface Pagination<E : DomainEntity> {
    fun limit(n: Int, offset: Long = 0): Pagination<E>
    fun sortBy(field: KProperty1<E, Comparable<*>>, direction: SortDirection = SortDirection.ASCENDING): Pagination<E>
    fun build(): List<E>
}

enum class SortDirection {
    ASCENDING,
    DESCENDING,
}
