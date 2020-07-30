package com.david.mviarchitecture.framework.datasource.network.mapper

import com.david.mviarchitecture.domain.models.CharacterModel
import com.david.mviarchitecture.domain.utils.EntityMapper
import com.david.mviarchitecture.framework.datasource.network.models.CharacterNetworkModel

class CharacterNetworkMapper : EntityMapper<CharacterNetworkModel, CharacterModel> {

    override fun mapToEntity(domainModel: CharacterModel): CharacterNetworkModel {
        return CharacterNetworkModel(
            domainModel.betterCallSaulAppearance,
            domainModel.birthday,
            domainModel.category,
            domainModel.charId,
            domainModel.img,
            domainModel.name,
            domainModel.nickname,
            domainModel.occupation,
            domainModel.portrayed,
            domainModel.status
        )
    }

    override fun mapToDomain(entity: CharacterNetworkModel): CharacterModel {
        return CharacterModel(
            entity.betterCallSaulAppearance,
            entity.birthday,
            entity.category,
            entity.charId,
            entity.img,
            entity.name,
            entity.nickname,
            entity.occupation,
            entity.portrayed,
            entity.status
        )
    }

    fun mapToDomainList(entitiesList: List<CharacterNetworkModel>) : List<CharacterModel> {
        return entitiesList.map { mapToDomain(it) }
    }

    fun mapToEntityList(domainList: List<CharacterModel>) : List<CharacterNetworkModel> {
        return domainList.map { mapToEntity(it) }
    }
}