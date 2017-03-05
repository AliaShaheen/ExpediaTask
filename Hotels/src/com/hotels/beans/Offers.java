package com.hotels.beans;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author alias
 */
public class Offers implements Serializable {


	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3597081814325053091L;
	
	@JsonProperty("offers")
	private Hotels hotel;


	public Hotels getHotel() {
		return hotel;
	}


	public void setHotel(Hotels hotel) {
		this.hotel = hotel;
	}

}
