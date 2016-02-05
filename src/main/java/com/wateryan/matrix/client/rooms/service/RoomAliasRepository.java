package com.wateryan.matrix.client.rooms.service;


import com.wateryan.matrix.client.rooms.domain.RoomAlias;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomAliasRepository extends MongoRepository<RoomAlias, String> {
}
