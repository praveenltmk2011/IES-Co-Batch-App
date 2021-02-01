package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.TypeAlias;

import lombok.Data;

@Data
@Entity
@Table(name = "BATCH_SUMMARY")
public class BatchSummary {

	@Id
	@Column(name = "SUMMARY_ID")
	private Integer summaryId;
	
	@Column(name = "BATCH_NAME")
	private String batchName;
	
	@Column(name = "FAILURE_TRIGGER_COUNT")
	private Integer failureTriggerCount;
	
	@Column(name = "SUCCESS_TRIGGER_COUNT")
	private Integer successTriggerCount;
	
	@Column(name = "TOTAL_TRIGGER_PROCESSED")
	private Integer totalTriggerProcessed;

	public Integer getSummaryId() {
		return summaryId;
	}

	public void setSummaryId(Integer summaryId) {
		this.summaryId = summaryId;
	}

	public String getBatchName() {
		return batchName;
	}

	public void setBatchName(String batchName) {
		this.batchName = batchName;
	}

	public Integer getFailureTriggerCount() {
		return failureTriggerCount;
	}

	public void setFailureTriggerCount(Integer failureTriggerCount) {
		this.failureTriggerCount = failureTriggerCount;
	}

	public Integer getSuccessTriggerCount() {
		return successTriggerCount;
	}

	public void setSuccessTriggerCount(Integer successTriggerCount) {
		this.successTriggerCount = successTriggerCount;
	}

	public Integer getTotalTriggerProcessed() {
		return totalTriggerProcessed;
	}

	public void setTotalTriggerProcessed(Integer totalTriggerProcessed) {
		this.totalTriggerProcessed = totalTriggerProcessed;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((batchName == null) ? 0 : batchName.hashCode());
		result = prime * result + ((failureTriggerCount == null) ? 0 : failureTriggerCount.hashCode());
		result = prime * result + ((successTriggerCount == null) ? 0 : successTriggerCount.hashCode());
		result = prime * result + ((summaryId == null) ? 0 : summaryId.hashCode());
		result = prime * result + ((totalTriggerProcessed == null) ? 0 : totalTriggerProcessed.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof BatchSummary))
			return false;
		BatchSummary other = (BatchSummary) obj;
		if (batchName == null) {
			if (other.batchName != null)
				return false;
		} else if (!batchName.equals(other.batchName))
			return false;
		if (failureTriggerCount == null) {
			if (other.failureTriggerCount != null)
				return false;
		} else if (!failureTriggerCount.equals(other.failureTriggerCount))
			return false;
		if (successTriggerCount == null) {
			if (other.successTriggerCount != null)
				return false;
		} else if (!successTriggerCount.equals(other.successTriggerCount))
			return false;
		if (summaryId == null) {
			if (other.summaryId != null)
				return false;
		} else if (!summaryId.equals(other.summaryId))
			return false;
		if (totalTriggerProcessed == null) {
			if (other.totalTriggerProcessed != null)
				return false;
		} else if (!totalTriggerProcessed.equals(other.totalTriggerProcessed))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "BatchSummary [summaryId=" + summaryId + ", batchName=" + batchName + ", failureTriggerCount="
				+ failureTriggerCount + ", successTriggerCount=" + successTriggerCount + ", totalTriggerProcessed="
				+ totalTriggerProcessed + "]";
	}
	
	
	
}
