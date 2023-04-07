package org.sourcegrade.kontour

interface DomainEntity {
    val id: UUID
    // TODO: createdUtc, updatedUtc

    /**
     * A [Repository] for [DomainEntity]s.
     */
    interface Repository<E : DomainEntity>
}

interface Creates<E : DomainEntity>
