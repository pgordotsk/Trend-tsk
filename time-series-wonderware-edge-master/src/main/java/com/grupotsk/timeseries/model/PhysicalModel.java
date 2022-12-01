package com.grupotsk.timeseries.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Grgobject")
public class PhysicalModel {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "gobject_id")
	private long id;
	@Column(name = "hierarchical_name")
	private String hierarchical;
	@Column(name = "hosting_tree_level")
	private String hosting_tree_level;
	@Column(name = "area_gobject_id")
	private int areaid ;
	@Column(name = "hosted_by_gobject_id")
	private int hosted_by_gobject_id ;

	
	public PhysicalModel() {
	}

	public PhysicalModel(long id, String hierarchical_name, String hosting_tree_level, int area_gobject_id,int hosted_by_gobject_id) {

		this.id = id;
		this.hierarchical = hierarchical_name;
		this.hosting_tree_level = hosting_tree_level;
		this.areaid = area_gobject_id;
		this.hosted_by_gobject_id=hosted_by_gobject_id;
	}

	public long getId() {
		return id;
	}

	public String getHierarchical_name() {
		return hierarchical;
	}

	public void setHierarchical_name(String hierarchical_name) {
		this.hierarchical = hierarchical_name;
	}

	public String getHosting_tree_level() {
		return hosting_tree_level;
	}

	public void setHosting_tree_level(String hosting_tree_level) {
		this.hosting_tree_level = hosting_tree_level;
	}

	public int getArea_gobject_id() {
		return areaid;
	}

	public void setArea_gobject_id(int area_gobject_id) {
		this.areaid = area_gobject_id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Gobject [ id=" +id  + ", Name=" + hierarchical + ", hosting_tree_level=" + hosting_tree_level + ", area_object=" + areaid + " ]";
	}
}