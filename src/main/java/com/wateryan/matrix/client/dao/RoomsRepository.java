package com.wateryan.matrix.client.dao;

import com.wateryan.matrix.client.domain.rooms.Room;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomsRepository extends MongoRepository<Room, String> {

}
