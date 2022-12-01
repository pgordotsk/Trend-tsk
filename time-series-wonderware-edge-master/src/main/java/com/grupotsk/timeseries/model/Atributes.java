package com.grupotsk.timeseries.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Tag")
public class Atributes {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "TagName")
	private String tagname;


	public Atributes() {

	}
	
	public Atributes(String tagname) {
		this.tagname = tagname;
	}

	public String getTagname() {
		return tagname;
	}

	public void setTagname(String tagname) {
		this.tagname = tagname;
	}
	
}
