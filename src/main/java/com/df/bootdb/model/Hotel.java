package com.df.bootdb.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Hotels")
public class Hotel
{
	
	@Id
	private String id;
	private String name;
	@Indexed(direction = IndexDirection.ASCENDING )
	private int pricepernight;
	private Address address;
	private List<Review> reviews;
	protected Hotel() {this.reviews = new ArrayList<>(); }
	public Hotel(String name, int pricepernight, Address address, List<Review> reviews) {
		super();
		this.name = name;
		this.pricepernight = pricepernight;
		this.address = address;
		this.reviews = reviews;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPricepernight() {
		return pricepernight;
	}
	public void setPricepernight(int pricepernight) {
		this.pricepernight = pricepernight;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Review> getReviews() {
		return reviews;
	}
	public void setReviews(List<Review> reviews) {
		this.reviews = reviews;
	}
	
	

}
