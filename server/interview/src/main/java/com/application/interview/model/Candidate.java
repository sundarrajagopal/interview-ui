package com.application.interview.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "candidates")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Candidate implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long candidateId;
	
	@Column(name ="recruiterName")
	private String recruiterName;
	
	@Column(name = "candidateName")
	private String candidateName;
		
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@Column(name = "emailAddress")
	private String emailAddress;
	
	@Column(name = "skypeId")
	private String skypeId;
	
	@Column(name = "technicalStack")
	private String technicalStack;
	
	@Column(name = "interviewer")
	private String interviewer;
	
	//@JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	@Column(name = "interviewScheduleDate")
	private String interviewScheduleDate;
	
	@Column(name = "yearsOfExperience")
	private Long yearsOfExperience;

	public Long getCandidateId() {
		return candidateId;
	}

	public void setCandidateId(Long candidateId) {
		this.candidateId = candidateId;
	}

	public String getRecruiterName() {
		return recruiterName;
	}

	public void setRecruiterName(String recruiterName) {
		this.recruiterName = recruiterName;
	}

	public String getCandidateName() {
		return candidateName;
	}

	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getSkypeId() {
		return skypeId;
	}

	public void setSkypeId(String skypeId) {
		this.skypeId = skypeId;
	}

	public String getTechnicalStack() {
		return technicalStack;
	}

	public void setTechnicalStack(String technicalStack) {
		this.technicalStack = technicalStack;
	}

	public String getInterviewer() {
		return interviewer;
	}

	public void setInterviewer(String interviewer) {
		this.interviewer = interviewer;
	}

	public String getInterviewScheduleDate() {
		return interviewScheduleDate;
	}

	public void setInterviewScheduleDate(String interviewScheduleDate) {
		this.interviewScheduleDate = interviewScheduleDate;
	}

	public Long getYearsOfExperience() {
		return yearsOfExperience;
	}

	public void setYearsOfExperience(Long yearsOfExperience) {
		this.yearsOfExperience = yearsOfExperience;
	}
	
	
	
	}
