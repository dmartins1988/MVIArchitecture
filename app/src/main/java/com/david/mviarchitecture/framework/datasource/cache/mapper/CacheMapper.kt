package com.david.mviarchitecture.framework.datasource.cache.mapper

import com.david.mviarchitecture.domain.models.CharacterModel
import com.david.mviarchitecture.domain.utils.EntityMapper
import com.david.mviarchitecture.framework.datasource.cache.models.CharacterEntity

class CacheMapper : EntityMapper<CharacterEntity, CharacterModel> {
    override fun mapToEntity(domainModel: CharacterModel): CharacterEntity {
        return CharacterEntity(
            domainModel.charId,
            domainModel.name,
            domainModel.nickname
        )
    }

    override fun mapToDomain(entity: CharacterEntity): CharacterModel {
        return CharacterModel(
            charId = entity.id,
            name = entity.name,
            nickname = entity.nickname
        )
    }

    fun mapToDomainList(entitiesList: List<CharacterEntity>) : List<CharacterModel> {
        return entitiesList.map { mapToDomain(it) }
    }

    fun mapToEntityList(domainList: List<CharacterModel>) : List<CharacterEntity> {
        return domainList.map { mapToEntity(it) }
    }
}