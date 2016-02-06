package com.wateryan.matrix.client.rooms.dao;

import com.wateryan.matrix.client.rooms.domain.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends MongoRepository<Room, String> {

}
