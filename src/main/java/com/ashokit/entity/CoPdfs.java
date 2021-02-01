package com.ashokit.entity;

import java.sql.Blob;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.data.annotation.TypeAlias;

import lombok.Data;

@Data
@Entity
@Table(name = "CO_PDFS")
public class CoPdfs {

	@Id
	@Column(name = "CO_PDF_ID")
	private Integer copdfId;
	
	@Column(name = "CASE_NUMBER")
	private Integer caseNo;
	
	@Column(name = "PLAN_NAME")
	private String planName;
	
	@Column(name = "PLAN_STATUS")
	private String planStatus;
	
	@Column(name = "PDF_DOCUMENT")
	private Blob pdfDocument;

	public Integer getCopdfId() {
		return copdfId;
	}

	public void setCopdfId(Integer copdfId) {
		this.copdfId = copdfId;
	}

	public Integer getCaseNo() {
		return caseNo;
	}

	public void setCaseNo(Integer caseNo) {
		this.caseNo = caseNo;
	}

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanStatus() {
		return planStatus;
	}

	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}

	public Blob getPdfDocument() {
		return pdfDocument;
	}

	public void setPdfDocument(Blob pdfDocument) {
		this.pdfDocument = pdfDocument;
	}

	@Override
	public String toString() {
		return "CoPdfs [copdfId=" + copdfId + ", caseNo=" + caseNo + ", planName=" + planName + ", planStatus="
				+ planStatus + ", pdfDocument=" + pdfDocument + "]";
	}
	
	
}
