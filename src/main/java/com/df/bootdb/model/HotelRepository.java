package com.df.bootdb.model;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
 

@Repository
public interface HotelRepository extends MongoRepository<Hotel, String>{

	
	

	

}

