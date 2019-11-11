package com.df.bootdb.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;



@Component
public class DbSeeder implements CommandLineRunner {
	private HotelRepository hotelRepository;
	
	
	
	public DbSeeder(HotelRepository hotelRepository) {
		super();
		this.hotelRepository = hotelRepository;
	}



	@Override
	public void run(String... strings) throws Exception {
		Hotel marriot = new Hotel("marriot", 130, new Address("paris", "france"), Arrays.asList(
				new Review("john", 8, false)));
		Hotel ibis = new Hotel("ibis", 90, new Address("Bucharest", "Romania"), Arrays.asList(
				new Review("Teddy", 9, true)));
		Hotel softitel= new Hotel("softitel", 200, new Address("Rome", "Italy"),new ArrayList<>() );
		

				
		
	
	
	//drop all hotels
	this.hotelRepository.deleteAll();
	
	//add our hotels to the database
	List<Hotel> hotels = Arrays.asList(marriot,ibis,softitel);
	this.hotelRepository.saveAll(hotels);

	}
}
