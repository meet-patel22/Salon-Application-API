package com.salon.AppointmentLibrary.Entity;

import com.salon.SaloonLibrary.Entity.Salon;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class AppointmentDateTime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	
	private int dateValue ;
	private String monthValue ;
	private int yearValue ;
	private String timeValue ;
	private String customerName ;
	
	@ManyToOne
	private Salon salonId;
		
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Long getId() {
		return id;
	}
	public Salon getSalonId() {
		return salonId;
	}
	public void setSalonId(Salon salonId) {
		this.salonId = salonId;
	}
	public String getTimeValue() {
		return timeValue;
	}
	public void setTimeValue(String timeValue) {
		this.timeValue = timeValue;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getDateValue() {
		return dateValue;
	}
	public void setDateValue(int dateValue) {
		this.dateValue = dateValue;
	}
	public String getMonthValue() {
		return monthValue;
	}
	public void setMonthValue(String monthValue) {
		this.monthValue = monthValue;
	}
	public int getYearValue() {
		return yearValue;
	}
	public void setYearValue(int yearValue) {
		this.yearValue = yearValue;
	}
	
}
