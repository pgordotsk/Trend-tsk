package com.grupotsk.timeseries.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "History")
public class Values {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TagName")
	private String tagname;
	@Column(name = "Value")
	private float value;
	@Column(name = "DateTime")
	private String datetime;
	@Column(name = "wwRetrievalMode")
	private String retrievalModel;
	@Column(name = "wwResolution")
	private int resolution;
	@Column(name = "StateTime")
	private int stateTime;
	@Column(name = "vValue")
	private String vValue;
	

	public Values() {};


	public Values(String tagname, float value, String datetime, String retrievalModel, int resolution, int stateTime, String vValue) {
		
		this.tagname = tagname;
		this.value = value;
		this.datetime = datetime;
		this.retrievalModel = retrievalModel;
		this.resolution = resolution;
		this.stateTime = stateTime;
		this.vValue = vValue;
	}

	public int getStateTime() {
		return stateTime;
	}


	public void setStateTime(int stateTime) {
		this.stateTime = stateTime;
	}


	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public float getValue() {
		return value;
	}

	public void setValue(float value) {
		this.value = value;
	}

	public String getRetrievalModel() {
		return retrievalModel;
	}

	public void setRetrievalModel(String retrievalModel) {
		this.retrievalModel = retrievalModel;
	}

	public String getDatetime() {
		return datetime;
	}

	public void setDatetime(String datetime) {
		this.datetime = datetime;
	}

	public void setTagname(String tagname) {
		this.tagname = tagname;
	}

	public String getTagname() {
		return tagname;
	}


	public String getvValue() {
		return vValue;
	}


	public void setvValue(String vValue) {
		this.vValue = vValue;
	}


	@Override
	public String toString() {
		return "Values [tagname=" + tagname + ", value=" + value + ", datetime=" + datetime + ", retrievalModel="
				+ retrievalModel + ", resolution=" + resolution + ", stateTime=" + stateTime + ", vValue=" + vValue
				+ "]";
	}


	



		

}
