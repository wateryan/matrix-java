package com.wateryan.matrix.client.dao;

import com.wateryan.matrix.client.domain.rooms.RoomAlias;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomAliasRepository extends MongoRepository<RoomAlias, String> {

}
