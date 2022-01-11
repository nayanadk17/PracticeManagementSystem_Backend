package com.citiustech.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PastOrPresent;

import org.hibernate.annotations.Check;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "PATIENT_USER_REGISTRATION_MASTER")
public class PatientRegisterBO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "patient_id")
	private Integer patientId;
	@Check(constraints = "title in ('Mr', 'Ms', 'Mrs'")
	private String title;
	@Column(name = "first_name")
	@NotEmpty(message = "Please provide your first name")
	private String firstName;
	@Column(name = "last_name")
	@NotEmpty(message = "Please provide your last name")
	private String lastName;
	@Column(name = "email", nullable = false, unique = true)
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide an e-mail")
	private String email;
	@Column(name = "dob")
	@PastOrPresent(message = "date of birth cannot be future date")
	private Date dateOfBirth;
	@Column(name = "country_code",nullable = false)
	private String countryCode;
	@Column(name = "contact_number", nullable = false)
	private String contactNumber;

	// add account status

}
