package com.citiustech.entity;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
@Table(name = "HOSPITAL_USER_REGISTRATION_MASTER")
public class HospitalUserRegisterBO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id ")
	private Integer empId;
	@Check(constraints = "title in ('Mr', 'Ms', 'Mrs','Dr'")
	@Column(name = "title", nullable = false)
	private String title;
	@Column(name = "first_name", nullable = false)
	@NotEmpty(message = "Please provide your first name")
	private String firstName;
	@Column(name = "last_name", nullable = false)
	@NotEmpty(message = "Please provide your last name")
	private String lastName;
	@Column(name = "email", nullable = false, unique = true)
	@Email(message = "Please provide a valid e-mail")
	@NotEmpty(message = "Please provide an e-mail")
	private String email;
	@Column(name = "dob", nullable = false)
	@PastOrPresent(message = "date of birth cannot be future date")
	private Date dateOfBirth;
	@Column(name = "doj", nullable = false)
	@PastOrPresent(message = "date of joining cannot be future date")
	private Date dateOfJoining;
	@Column(name = "country_code", nullable = false)
	private String countryCode;
	@Column(name = "contact_number", nullable = false)
	private String contactNumber;
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "role_id", referencedColumnName = "emp_id")
	private RoleBO roleBO;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hospital_id")
	private Integer hospitalId;

	// add account status
}
