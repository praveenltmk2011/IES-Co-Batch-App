package com.ashokit.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "BATCH_RUN_DTLS")
public class BatchRunDtls {
	
	@Id
	@Column(name = "BATCH_RUN_SEQ")
	private Integer batchRunSeq;
	
	@Column(name = "BATCH_NAME")
	private String batchName;
	
	@Column(name = "BATCH_RUN_STATUS")
	private String batchRunStatus;
	
	@Column(name = "START_DATE")
	private Date startDate;
	
	@Column(name = "END_DATE")
	private Date endDate;
	
	@Column(name = "INSTANCE_NUM")
	private Integer instanceNum;

	public Integer getBatchRunSeq() {
		return batchRunSeq;
	}

	public void setBatchRunSeq(Integer batchRunSeq) {
		this.batchRunSeq = batchRunSeq;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public String getBatchRunStatus() {
		return batchRunStatus;
	}

	public void setBatchRunStatus(String batchRunStatus) {
		this.batchRunStatus = batchRunStatus;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getInstanceNum() {
		return instanceNum;
	}

	public void setInstanceNum(Integer instanceNum) {
		this.instanceNum = instanceNum;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
		result = prime * result + ((batchRunSeq == null) ? 0 : batchRunSeq.hashCode());
		result = prime * result + ((batchRunStatus == null) ? 0 : batchRunStatus.hashCode());
		result = prime * result + ((endDate == null) ? 0 : endDate.hashCode());
		result = prime * result + ((instanceNum == null) ? 0 : instanceNum.hashCode());
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BatchRunDtls))
			return false;
		BatchRunDtls other = (BatchRunDtls) obj;
		if (batchName == null) {
			if (other.batchName != null)
				return false;
		} else if (!batchName.equals(other.batchName))
			return false;
		if (batchRunSeq == null) {
			if (other.batchRunSeq != null)
				return false;
		} else if (!batchRunSeq.equals(other.batchRunSeq))
			return false;
		if (batchRunStatus == null) {
			if (other.batchRunStatus != null)
				return false;
		} else if (!batchRunStatus.equals(other.batchRunStatus))
			return false;
		if (endDate == null) {
			if (other.endDate != null)
				return false;
		} else if (!endDate.equals(other.endDate))
			return false;
		if (instanceNum == null) {
			if (other.instanceNum != null)
				return false;
		} else if (!instanceNum.equals(other.instanceNum))
			return false;
		if (startDate == null) {
			if (other.startDate != null)
				return false;
		} else if (!startDate.equals(other.startDate))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BatchRunDtls [batchRunSeq=" + batchRunSeq + ", batchName=" + batchName + ", batchRunStatus="
				+ batchRunStatus + ", startDate=" + startDate + ", endDate=" + endDate + ", instanceNum=" + instanceNum
				+ "]";
	}
	
	
	
}
