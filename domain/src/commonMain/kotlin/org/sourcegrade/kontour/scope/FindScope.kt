package org.sourcegrade.kontour.scope

import org.sourcegrade.kontour.DomainEntity
import org.sourcegrade.kontour.UUID

interface FindScope<E : DomainEntity> {

    suspend fun DomainEntity.Repository<E>.findById(id: UUID): E?
}
