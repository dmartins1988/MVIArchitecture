package com.david.mviarchitecture.domain.utils

interface EntityMapper<Entity, DomainModel> {

    fun mapToEntity(domainModel: DomainModel) : Entity

    fun ampToDomain(entity: Entity) : DomainModel
}