package com.citiustech.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "PATIENT_USER_LOGIN_MANAGER")
public class PatientLoginBO {

	@Column(name = "current_password")
	private String currentPassword;
	@Column(name = "previous_password")
	private String previousPassword;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "patient_id")
	private PatientRegisterBO patientRegisterBO;
	@Column(name = "password_changed_time")
	private Date passwordChangedTime;
	@Column(name = "lock_time")
	private Date lockTime;

}
