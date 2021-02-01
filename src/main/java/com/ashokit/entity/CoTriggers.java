package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CO_TRIGGERS")
public class CoTriggers {

	@Id
	@Column(name = "TRG_ID")
	private Integer trg_id;
	
	@Column(name = "CASE_NUM")
	private Integer case_num;
	
	@Column(name = "CREATE_DT")
	private Date create_dt;
	
	@Column(name = "TRG_STATUS")
	private String trg_status;
	
	@Column(name = "UPDATE_DT")
	private Date update_dt;
	
	public Integer getTrg_id() {
		return trg_id;
	}
	public void setTrg_id(Integer trg_id) {
		this.trg_id = trg_id;
	}
	public Integer getCase_num() {
		return case_num;
	}
	public void setCase_num(Integer case_num) {
		this.case_num = case_num;
	}
	public Date getCreate_dt() {
		return create_dt;
	}
	public void setCreate_dt(Date create_dt) {
		this.create_dt = create_dt;
	}
	public String getTrg_status() {
		return trg_status;
	}
	public void setTrg_status(String trg_status) {
		this.trg_status = trg_status;
	}
	public Date getUpdate_dt() {
		return update_dt;
	}
	public void setUpdate_dt(Date update_dt) {
		this.update_dt = update_dt;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((case_num == null) ? 0 : case_num.hashCode());
		result = prime * result + ((create_dt == null) ? 0 : create_dt.hashCode());
		result = prime * result + ((trg_id == null) ? 0 : trg_id.hashCode());
		result = prime * result + ((trg_status == null) ? 0 : trg_status.hashCode());
		result = prime * result + ((update_dt == null) ? 0 : update_dt.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CoTriggers))
			return false;
		CoTriggers other = (CoTriggers) obj;
		if (case_num == null) {
			if (other.case_num != null)
				return false;
		} else if (!case_num.equals(other.case_num))
			return false;
		if (create_dt == null) {
			if (other.create_dt != null)
				return false;
		} else if (!create_dt.equals(other.create_dt))
			return false;
		if (trg_id == null) {
			if (other.trg_id != null)
				return false;
		} else if (!trg_id.equals(other.trg_id))
			return false;
		if (trg_status == null) {
			if (other.trg_status != null)
				return false;
		} else if (!trg_status.equals(other.trg_status))
			return false;
		if (update_dt == null) {
			if (other.update_dt != null)
				return false;
		} else if (!update_dt.equals(other.update_dt))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Co_Triggers [trg_id=" + trg_id + ", case_num=" + case_num + ", create_dt=" + create_dt + ", trg_status="
				+ trg_status + ", update_dt=" + update_dt + "]";
	}
	
	
}
