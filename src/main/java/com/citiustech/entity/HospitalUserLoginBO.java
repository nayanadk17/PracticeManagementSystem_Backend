package com.citiustech.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "HOSPITAL_USER_LOGIN_MANAGER")
public class HospitalUserLoginBO {

	@Column(name = "current_password", nullable = false)
	private String currentPassword;
	@Column(name = "previous_password")
	private String previousPassword;
	@Column(name = "password_changed_time")
	private Date passwordChangedTime;
	@Column(name = "lock_time")
	private Date lockTime;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "emp_id")
	private HospitalUserRegisterBO hospitalUserRegisterBO;

}
