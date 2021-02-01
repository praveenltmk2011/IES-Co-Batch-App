package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "ELIGIBILITY_DETAILS")
public class Eligibility_Details {

	@Id
	@Column(name = "ED_TRACE_ID")
	private Integer ed_trace_id;
	
	@Column(name = "BENEFIT_AMT")
    private String benefit_amt;
	
	@Column(name = "CASE_NUM")
    private Integer case_num;
	
	@Column(name = "CREATE_DT")
    private Date create_dt;
	
	@Column(name = "DENIAL_REASON")
    private String denial_reason;
	
	@Column(name = "PLAN_END_DT")
    private String plan_end_dt;
	
	@Column(name = "PLAN_NAME")
    private String plan_name;
	
	@Column(name = "PLAN_START_DT")
    private String plan_start_dt;
	
	@Column(name = "PLAN_STATUS")
    private String plan_status;
	
	@Column(name = "UPDATE_DT")
    private Date update_dt;

	public Integer getEd_trace_id() {
		return ed_trace_id;
	}

	public void setEd_trace_id(Integer ed_trace_id) {
		this.ed_trace_id = ed_trace_id;
	}

	public String getBenefit_amt() {
		return benefit_amt;
	}

	public void setBenefit_amt(String benefit_amt) {
		this.benefit_amt = benefit_amt;
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

	public String getDenial_reason() {
		return denial_reason;
	}

	public void setDenial_reason(String denial_reason) {
		this.denial_reason = denial_reason;
	}

	public String getPlan_end_dt() {
		return plan_end_dt;
	}

	public void setPlan_end_dt(String plan_end_dt) {
		this.plan_end_dt = plan_end_dt;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public String getPlan_start_dt() {
		return plan_start_dt;
	}

	public void setPlan_start_dt(String plan_start_dt) {
		this.plan_start_dt = plan_start_dt;
	}

	public String getPlan_status() {
		return plan_status;
	}

	public void setPlan_status(String plan_status) {
		this.plan_status = plan_status;
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
		result = prime * result + ((benefit_amt == null) ? 0 : benefit_amt.hashCode());
		result = prime * result + ((case_num == null) ? 0 : case_num.hashCode());
		result = prime * result + ((create_dt == null) ? 0 : create_dt.hashCode());
		result = prime * result + ((denial_reason == null) ? 0 : denial_reason.hashCode());
		result = prime * result + ((ed_trace_id == null) ? 0 : ed_trace_id.hashCode());
		result = prime * result + ((plan_end_dt == null) ? 0 : plan_end_dt.hashCode());
		result = prime * result + ((plan_name == null) ? 0 : plan_name.hashCode());
		result = prime * result + ((plan_start_dt == null) ? 0 : plan_start_dt.hashCode());
		result = prime * result + ((plan_status == null) ? 0 : plan_status.hashCode());
		result = prime * result + ((update_dt == null) ? 0 : update_dt.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Eligibility_Details))
			return false;
		Eligibility_Details other = (Eligibility_Details) obj;
		if (benefit_amt == null) {
			if (other.benefit_amt != null)
				return false;
		} else if (!benefit_amt.equals(other.benefit_amt))
			return false;
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
		if (denial_reason == null) {
			if (other.denial_reason != null)
				return false;
		} else if (!denial_reason.equals(other.denial_reason))
			return false;
		if (ed_trace_id == null) {
			if (other.ed_trace_id != null)
				return false;
		} else if (!ed_trace_id.equals(other.ed_trace_id))
			return false;
		if (plan_end_dt == null) {
			if (other.plan_end_dt != null)
				return false;
		} else if (!plan_end_dt.equals(other.plan_end_dt))
			return false;
		if (plan_name == null) {
			if (other.plan_name != null)
				return false;
		} else if (!plan_name.equals(other.plan_name))
			return false;
		if (plan_start_dt == null) {
			if (other.plan_start_dt != null)
				return false;
		} else if (!plan_start_dt.equals(other.plan_start_dt))
			return false;
		if (plan_status == null) {
			if (other.plan_status != null)
				return false;
		} else if (!plan_status.equals(other.plan_status))
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
		return "Eligibility_Details [ed_trace_id=" + ed_trace_id + ", benefit_amt=" + benefit_amt + ", case_num="
				+ case_num + ", create_dt=" + create_dt + ", denial_reason=" + denial_reason + ", plan_end_dt="
				+ plan_end_dt + ", plan_name=" + plan_name + ", plan_start_dt=" + plan_start_dt + ", plan_status="
				+ plan_status + ", update_dt=" + update_dt + "]";
	}
	
	
}
