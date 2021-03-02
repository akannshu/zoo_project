package com.zoo.dao;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "emergency_record")
@Entity
public class Emergency implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer emergencyId;
	private String type;
	private String em_case;
	private String progress_so_far;

	public Emergency() {

	}

	public Emergency(String type, String em_case, String progress_so_far) {

		this.type = type;
		this.em_case = em_case;
		this.progress_so_far = progress_so_far;
	}

	public Emergency(Integer emergencyId, String type, String em_case, String progress_so_far) {

		this.emergencyId = emergencyId;
		this.type = type;
		this.em_case = em_case;
		this.progress_so_far = progress_so_far;
	}

	public Integer getEmergencyId() {
		return emergencyId;
	}

	public void setEmergencyId(Integer emergencyId) {
		this.emergencyId = emergencyId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEm_case() {
		return em_case;
	}

	public void setEm_case(String em_case) {
		this.em_case = em_case;
	}

	public String getProgress_so_far() {
		return progress_so_far;
	}

	public void setProgress_so_far(String progress_so_far) {
		this.progress_so_far = progress_so_far;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Emergency [emergencyId=" + emergencyId + ", type=" + type + ", em_case=" + em_case
				+ ", progress_so_far=" + progress_so_far + "]";
	}

}