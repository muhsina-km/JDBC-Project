package com.ty.hospitalapp.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eid;
	private String reason;
	private long dateOfJoin;
	private String discharge;
	
	@OneToMany(mappedBy = "encounters")
	private List<Observation> observations;
	
	@ManyToOne
	@JoinColumn
	private Person person;
	
	@ManyToOne
	@JoinColumn
	private Branch branchs;
	
	@OneToMany(mappedBy = "encounters ")
	private List<MedOrder> medOrders;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public long getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(long dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public String getDischarge() {
		return discharge;
	}

	public void setDischarge(String discharge) {
		this.discharge = discharge;
	}

	public List<Observation> getObservations() {
		return observations;
	}

	public void setObservations(List<Observation> observations) {
		this.observations = observations;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Branch getBranchs() {
		return branchs;
	}

	public void setBranchs(Branch branchs) {
		this.branchs = branchs;
	}

	public List<MedOrder> getMedOrders() {
		return medOrders;
	}

	public void setMedOrders(List<MedOrder> medOrders) {
		this.medOrders = medOrders;
	}

}
