package com.salon.AppointmentLibrary.Entity;

import java.util.Date;
import java.util.List;
import com.salon.AppointmentLibrary.Entity.AppointmentDateTime;
import com.salon.CustomerLibrary.Entity.Customer;
import com.salon.SaloonLibrary.Entity.Salon;
import com.salon.SaloonLibrary.Entity.SalonService;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	
	@OneToOne
	private Customer customerId;

//	@OneToOne
//	private Salon salonId;
	@OneToOne
	private AppointmentDateTime appointmentDateTime;
	
	@OneToMany
	private List<SalonService> salonServicesId;
	
	
	
	
	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}

	public List<SalonService> getSalonServicesId() {
		return salonServicesId;
	}

	public void setSalonServicesId(List<SalonService> salonServicesId) {
		this.salonServicesId = salonServicesId;
	}

//	public Salon getSalonId() {
//		return salonId;
//	}
//
//	public void setSalonId(Salon salonId) {
//		this.salonId = salonId;
//	}

	public Long getId() {
		return id;
	}

	public void setAppointmentId(Long appointmentId) {
		this.id = appointmentId;
	}

	


	public void setId(Long id) {
		this.id = id;
	}


	

	

	public AppointmentDateTime getAppointmentDateTime() {
		return appointmentDateTime;
	}

	public void setAppointmentDateTime(AppointmentDateTime appointmentDateTime) {
		this.appointmentDateTime = appointmentDateTime;
	}



	// Constructors, getters, and setters
	
	

}
