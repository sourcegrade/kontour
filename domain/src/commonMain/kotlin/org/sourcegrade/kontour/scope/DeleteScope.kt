package org.sourcegrade.kontour.scope

import org.sourcegrade.kontour.DomainEntity
import org.sourcegrade.kontour.UUID

interface DeleteScope<E : DomainEntity> {

    suspend fun DomainEntity.Repository<E>.deleteById(id: UUID): Boolean
}
