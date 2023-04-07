package org.sourcegrade.kontour.scope

import org.sourcegrade.kontour.Creates
import org.sourcegrade.kontour.DomainEntity

interface CreateScope<E : DomainEntity, D : Creates<E>> {

    suspend fun DomainEntity.Repository<E>.create(item: D): E
}
