package com.citiustech.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
@Table(name = "HOSPITAL_MASTER")
public class HospitalBO {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "hospital_id")
	private Integer hospitalId;
	@Column(name = "hospital_name")
	private String hospitalName;
}
