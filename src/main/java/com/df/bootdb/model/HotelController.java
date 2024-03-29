package com.df.bootdb.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/hotels")
public class HotelController
{
	@Autowired
	private HotelRepository hotelRepository;

	public HotelController(HotelRepository hotelRepository) 
	{
		super();
		this.hotelRepository = hotelRepository;
	}

	@GetMapping("/all")
	public List<Hotel> getAll()
	{
		List<Hotel> hotels = this.hotelRepository.findAll();
		return hotels;
	}
//	@PutMapping
//	public void insert(@RequestBody Hotel hotel)
//	{
//		this.hotelRepository.insert(hotel);
//	}
//	
//	@PostMapping
//	public void update(@RequestBody Hotel hotel)
//	{
//		this.hotelRepository.save(hotel);
//	}
//	
//	@DeleteMapping("id")
//	public void delete(@PathVariable("id") String id)
//	{
//		this.hotelRepository.deleteAll();
//	}
//	
}
