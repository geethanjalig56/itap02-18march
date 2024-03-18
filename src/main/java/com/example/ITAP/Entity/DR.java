package com.example.ITAP.Entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;


@Entity
@Table(name="DR_DRILL")
public class DR {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String APPLICATION_NAME;
	private String PLANNED;
	private String APPLICATION_DEVELOPER;
	private String APPLICATION_OWNER;
	private String OWNER_DEPARTMENT;
	private String CRITICAL;
	private String INT_APP;
	private String EXT_CUST_APP;
	private String ACTIVITY;
	private String REMARKS;
	private String CUST_IMPACT;
	private String POINT_OF_CONTACT;
	private String NOTIFY_DEPT;
	private String NAME_OF_DEPT;
	private String ADDITIONAL_EMAIL;
	private String TYPE;
	private String REQUESTOR_NAME;
	private String VERIFIED_BY;
	private String STATUS;
	private String CLARIFICATION;
	private String DOWNTIMEAPP;
	private LocalDate START_DATE;
	private LocalDate END_DATE;
	private LocalDate CUST_IMPACT_START_DATE;
	private LocalDate CUST_IMPACT_END_DATE;
	private LocalDate STATUS_UPDATE_DATE;
	private LocalDate SUBMIT_DATE ;
	private LocalTime  CUST_IMPACT_END_TIME;
	private LocalTime CUST_IMPACT_START_TIME;
	private LocalTime START_TIME;
	private LocalTime END_TIME;

	public DR(Long id, String aPPLICATION_NAME, String pLANNED, String aPPLICATION_DEVELOPER, String aPPLICATION_OWNER,
			String oWNER_DEPARTMENT, String cRITICAL, String iNT_APP, String eXT_CUST_APP, String aCTIVITY,
			String rEMARKS, String cUST_IMPACT, String pOINT_OF_CONTACT, String nOTIFY_DEPT, String nAME_OF_DEPT,
			String aDDITIONAL_EMAIL, String tYPE, String rEQUESTOR_NAME, String vERIFIED_BY, String sTATUS,
			String cLARIFICATION, String dOWNTIMEAPP, LocalDate sTART_DATE, LocalDate eND_DATE,
			LocalDate cUST_IMPACT_START_DATE, LocalDate cUST_IMPACT_END_DATE, LocalDate sTATUS_UPDATE_DATE,
			LocalDate sUBMIT_DATE, LocalTime cUST_IMPACT_END_TIME, LocalTime cUST_IMPACT_START_TIME,
			LocalTime sTART_TIME, LocalTime eND_TIME) 
	{
		super();
		this.id = id;
		APPLICATION_NAME = aPPLICATION_NAME;
		PLANNED = pLANNED;
		APPLICATION_DEVELOPER = aPPLICATION_DEVELOPER;
		APPLICATION_OWNER = aPPLICATION_OWNER;
		OWNER_DEPARTMENT = oWNER_DEPARTMENT;
		CRITICAL = cRITICAL;
		INT_APP = iNT_APP;
		EXT_CUST_APP = eXT_CUST_APP;
		ACTIVITY = aCTIVITY;
		REMARKS = rEMARKS;
		CUST_IMPACT = cUST_IMPACT;
		POINT_OF_CONTACT = pOINT_OF_CONTACT;
		NOTIFY_DEPT = nOTIFY_DEPT;
		NAME_OF_DEPT = nAME_OF_DEPT;
		ADDITIONAL_EMAIL = aDDITIONAL_EMAIL;
		TYPE = tYPE;
		REQUESTOR_NAME = rEQUESTOR_NAME;
		VERIFIED_BY = vERIFIED_BY;
		STATUS = sTATUS;
		CLARIFICATION = cLARIFICATION;
		DOWNTIMEAPP = dOWNTIMEAPP;
		START_DATE = sTART_DATE;
		END_DATE = eND_DATE;
		CUST_IMPACT_START_DATE = cUST_IMPACT_START_DATE;
		CUST_IMPACT_END_DATE = cUST_IMPACT_END_DATE;
		STATUS_UPDATE_DATE = sTATUS_UPDATE_DATE;
		SUBMIT_DATE = sUBMIT_DATE;
		CUST_IMPACT_END_TIME = cUST_IMPACT_END_TIME;
		CUST_IMPACT_START_TIME = cUST_IMPACT_START_TIME;
		START_TIME = sTART_TIME;
		END_TIME = eND_TIME;
	}
	public DR()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAPPLICATION_NAME() {
		return APPLICATION_NAME;
	}
	public void setAPPLICATION_NAME(String aPPLICATION_NAME) {
		APPLICATION_NAME = aPPLICATION_NAME;
	}
	public String getPLANNED() {
		return PLANNED;
	}
	public void setPLANNED(String pLANNED) {
		PLANNED = pLANNED;
	}
	public String getAPPLICATION_DEVELOPER() {
		return APPLICATION_DEVELOPER;
	}
	public void setAPPLICATION_DEVELOPER(String aPPLICATION_DEVELOPER) {
		APPLICATION_DEVELOPER = aPPLICATION_DEVELOPER;
	}
	public String getAPPLICATION_OWNER() {
		return APPLICATION_OWNER;
	}
	public void setAPPLICATION_OWNER(String aPPLICATION_OWNER) {
		APPLICATION_OWNER = aPPLICATION_OWNER;
	}
	public String getOWNER_DEPARTMENT() {
		return OWNER_DEPARTMENT;
	}
	public void setOWNER_DEPARTMENT(String oWNER_DEPARTMENT) {
		OWNER_DEPARTMENT = oWNER_DEPARTMENT;
	}
	public String getCRITICAL() {
		return CRITICAL;
	}
	public void setCRITICAL(String cRITICAL) {
		CRITICAL = cRITICAL;
	}
	public String getINT_APP() {
		return INT_APP;
	}
	public void setINT_APP(String iNT_APP) {
		INT_APP = iNT_APP;
	}
	public String getEXT_CUST_APP() {
		return EXT_CUST_APP;
	}
	public void setEXT_CUST_APP(String eXT_CUST_APP) {
		EXT_CUST_APP = eXT_CUST_APP;
	}
	public String getACTIVITY() {
		return ACTIVITY;
	}
	public void setACTIVITY(String aCTIVITY) {
		ACTIVITY = aCTIVITY;
	}
	public String getREMARKS() {
		return REMARKS;
	}
	public void setREMARKS(String rEMARKS) {
		REMARKS = rEMARKS;
	}
	public String getCUST_IMPACT() {
		return CUST_IMPACT;
	}
	public void setCUST_IMPACT(String cUST_IMPACT) {
		CUST_IMPACT = cUST_IMPACT;
	}
	public String getPOINT_OF_CONTACT() {
		return POINT_OF_CONTACT;
	}
	public void setPOINT_OF_CONTACT(String pOINT_OF_CONTACT) {
		POINT_OF_CONTACT = pOINT_OF_CONTACT;
	}
	public String getNOTIFY_DEPT() {
		return NOTIFY_DEPT;
	}
	public void setNOTIFY_DEPT(String nOTIFY_DEPT) {
		NOTIFY_DEPT = nOTIFY_DEPT;
	}
	public String getNAME_OF_DEPT() {
		return NAME_OF_DEPT;
	}
	public void setNAME_OF_DEPT(String nAME_OF_DEPT) {
		NAME_OF_DEPT = nAME_OF_DEPT;
	}
	public String getADDITIONAL_EMAIL() {
		return ADDITIONAL_EMAIL;
	}
	public void setADDITIONAL_EMAIL(String aDDITIONAL_EMAIL) {
		ADDITIONAL_EMAIL = aDDITIONAL_EMAIL;
	}
	public String getTYPE() {
		return TYPE;
	}
	public void setTYPE(String tYPE) {
		TYPE = tYPE;
	}
	public String getREQUESTOR_NAME() {
		return REQUESTOR_NAME;
	}
	public void setREQUESTOR_NAME(String rEQUESTOR_NAME) {
		REQUESTOR_NAME = rEQUESTOR_NAME;
	}
	public String getVERIFIED_BY() {
		return VERIFIED_BY;
	}
	public void setVERIFIED_BY(String vERIFIED_BY) {
		VERIFIED_BY = vERIFIED_BY;
	}
	public String getSTATUS() {
		return STATUS;
	}
	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}
	public String getCLARIFICATION() {
		return CLARIFICATION;
	}
	public void setCLARIFICATION(String cLARIFICATION) {
		CLARIFICATION = cLARIFICATION;
	}
	public String getDOWNTIMEAPP() {
		return DOWNTIMEAPP;
	}
	public void setDOWNTIMEAPP(String dOWNTIMEAPP) {
		DOWNTIMEAPP = dOWNTIMEAPP;
	}
	public LocalDate getSTART_DATE() {
		return START_DATE;
	}
	public void setSTART_DATE(LocalDate sTART_DATE) {
		START_DATE = sTART_DATE;
	}
	public LocalDate getEND_DATE() {
		return END_DATE;
	}
	public void setEND_DATE(LocalDate eND_DATE) {
		END_DATE = eND_DATE;
	}
	public LocalDate getCUST_IMPACT_START_DATE() {
		return CUST_IMPACT_START_DATE;
	}
	public void setCUST_IMPACT_START_DATE(LocalDate cUST_IMPACT_START_DATE) {
		CUST_IMPACT_START_DATE = cUST_IMPACT_START_DATE;
	}
	public LocalDate getCUST_IMPACT_END_DATE() {
		return CUST_IMPACT_END_DATE;
	}
	public void setCUST_IMPACT_END_DATE(LocalDate cUST_IMPACT_END_DATE) {
		CUST_IMPACT_END_DATE = cUST_IMPACT_END_DATE;
	}
	public LocalDate getSTATUS_UPDATE_DATE() {
		return STATUS_UPDATE_DATE;
	}
	public void setSTATUS_UPDATE_DATE(LocalDate sTATUS_UPDATE_DATE) {
		STATUS_UPDATE_DATE = sTATUS_UPDATE_DATE;
	}
	public LocalDate getSUBMIT_DATE() {
		return SUBMIT_DATE;
	}
	public void setSUBMIT_DATE(LocalDate sUBMIT_DATE) {
		SUBMIT_DATE = sUBMIT_DATE;
	}
	public LocalTime getCUST_IMPACT_END_TIME() {
		return CUST_IMPACT_END_TIME;
	}
	public void setCUST_IMPACT_END_TIME(LocalTime cUST_IMPACT_END_TIME) {
		CUST_IMPACT_END_TIME = cUST_IMPACT_END_TIME;
	}
	public LocalTime getCUST_IMPACT_START_TIME() {
		return CUST_IMPACT_START_TIME;
	}
	public void setCUST_IMPACT_START_TIME(LocalTime cUST_IMPACT_START_TIME) {
		CUST_IMPACT_START_TIME = cUST_IMPACT_START_TIME;
	}
	public LocalTime getSTART_TIME() {
		return START_TIME;
	}
	public void setSTART_TIME(LocalTime sTART_TIME) {
		START_TIME = sTART_TIME;
	}
	public LocalTime getEND_TIME() {
		return END_TIME;
	}
	public void setEND_TIME(LocalTime eND_TIME) {
		END_TIME = eND_TIME;
	} 
	
	
	
	
}
