package com.hotelservice.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "micro_hotel")
public class Hotel {

	@Id
	@Column(name = "ID")
	private String hotelId;
	@Column (name = "Name")
	private String hotelName;
	@Column(name = "Location")
	private String hotelLocation;
	@Column(name = "About")
	private String hotelAbout;
}