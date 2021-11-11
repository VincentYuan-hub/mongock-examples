package com.github.cloudyrock.mongock.client;

import com.github.cloudyrock.mongock.Spring5SpringData2App;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository(Spring5SpringData2App.CLIENTS_COLLECTION_NAME)
public interface ClientRepository extends MongoRepository<Client, String> {

}
