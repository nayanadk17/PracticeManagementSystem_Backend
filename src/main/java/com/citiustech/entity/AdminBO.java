package com.citiustech.entity;

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
import lombok.Builder.Default;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "ADMIN_MASTER")
public class AdminBO {

	@Column(name = "admin_email")
	private String email;
	@Column(name = "password")
	private String password;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id")
	private RoleBO roleBO;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "hospital_id")
	private Integer hospitalId;

}
