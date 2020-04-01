package com.covid19.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.*;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@Component
@Entity
@Table(name = "Patients_List")
@JsonIgnoreProperties(ignoreUnknown =true)
public class Covid19Bean implements Serializable{
	
	@Id
	@Column(name = "Patient_number")
	private String patientnumber;
	
	@Column(name = "Age_group")
	private String agebracket;
	
	@Column(name = "Gender")
	private String gender;
	
	@Column(name = "City")
	private String detectedcity;
	
	@Column(name = "District")
	private String detecteddistrict;
	
	@Column(name = "State")
	private String detectedstate;
	
	@Column(name = "State_Patient_Number")
	private String statepatientnumber;
	
	@Column(name = "Nationality")
	private String nationality;
	
	@Column(name = "Date_Announced")
	private String dateannounced;
	
	@Column(name = "Current_Status")
	private String currentstatus;
	
	@Column(name = "Status_Change_Date")
	private String statuschangedate;
	
	@Column(name = "Contracted_From_Patient")
	private String contractedfromwhichpatientsuspected;
	
	@Column(name = "Details")
	private String notes;
	
	@Column(name = "Additional_Details")
	private String backupnotes;
	
	@Column(name = "Source_1")
	private String source1;
	
//	@Column(name = "Source_2")
//	private String source2;
	
	@Column(name = "Source_3")
	private String source3;
	
	@Column(name = "Transmission_Type")
	private String typeoftransmission;

	public String getPatientnumber() {
		return patientnumber;
	}

	public void setPatientnumber(String patientnumber) {
		this.patientnumber = patientnumber;
	}

	public String getAgebracket() {
		return agebracket;
	}

	public void setAgebracket(String agebracket) {
		this.agebracket = agebracket;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDetectedcity() {
		return detectedcity;
	}

	public void setDetectedcity(String detectedcity) {
		this.detectedcity = detectedcity;
	}

	public String getDetecteddistrict() {
		return detecteddistrict;
	}

	public void setDetecteddistrict(String detecteddistrict) {
		this.detecteddistrict = detecteddistrict;
	}

	public String getDetectedstate() {
		return detectedstate;
	}

	public void setDetectedstate(String detectedstate) {
		this.detectedstate = detectedstate;
	}

	public String getStatepatientnumber() {
		return statepatientnumber;
	}

	public void setStatepatientnumber(String statepatientnumber) {
		this.statepatientnumber = statepatientnumber;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getDateannounced() {
		return dateannounced;
	}

	public void setDateannounced(String dateannounced) {
		this.dateannounced = dateannounced;
	}

	public String getCurrentstatus() {
		return currentstatus;
	}

	public void setCurrentstatus(String currentstatus) {
		this.currentstatus = currentstatus;
	}

	public String getStatuschangedate() {
		return statuschangedate;
	}

	public void setStatuschangedate(String statuschangedate) {
		this.statuschangedate = statuschangedate;
	}

	public String getContractedfromwhichpatientsuspected() {
		return contractedfromwhichpatientsuspected;
	}

	public void setContractedfromwhichpatientsuspected(String contractedfromwhichpatientsuspected) {
		this.contractedfromwhichpatientsuspected = contractedfromwhichpatientsuspected;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public String getBackupnotes() {
		return backupnotes;
	}

	public void setBackupnotes(String backupnotes) {
		this.backupnotes = backupnotes;
	}

	public String getSource1() {
		return source1;
	}

	public void setSource1(String source1) {
		this.source1 = source1;
	}

//	public String getSource2() {
//		return source2;
//	}
//
//	public void setSource2(String source2) {
//		this.source2 = source2;
//	}

	public String getSource3() {
		return source3;
	}

	public void setSource3(String source3) {
		this.source3 = source3;
	}

	public String getTypeoftransmission() {
		return typeoftransmission;
	}

	public void setTypeoftransmission(String typeoftransmission) {
		this.typeoftransmission = typeoftransmission;
	}

	public Covid19Bean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Covid19Bean(String patientnumber, String agebracket, String gender, String detectedcity,
			String detecteddistrict, String detectedstate, String statepatientnumber, String nationality,
			String dateannounced, String currentstatus, String statuschangedate,
			String contractedfromwhichpatientsuspected, String notes, String backupnotes, String source1,
			String source3, String typeoftransmission) {
		super();
		this.patientnumber = patientnumber;
		this.agebracket = agebracket;
		this.gender = gender;
		this.detectedcity = detectedcity;
		this.detecteddistrict = detecteddistrict;
		this.detectedstate = detectedstate;
		this.statepatientnumber = statepatientnumber;
		this.nationality = nationality;
		this.dateannounced = dateannounced;
		this.currentstatus = currentstatus;
		this.statuschangedate = statuschangedate;
		this.contractedfromwhichpatientsuspected = contractedfromwhichpatientsuspected;
		this.notes = notes;
		this.backupnotes = backupnotes;
		this.source1 = source1;
		this.source3 = source3;
		this.typeoftransmission = typeoftransmission;
	}
	
	
	
}