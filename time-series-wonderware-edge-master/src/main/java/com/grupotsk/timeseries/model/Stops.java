package com.grupotsk.timeseries.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VPRPS_INCID")
public class Stops {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "CodMaqui")
	private String CodMaqui;
	@Column(name = "DesIncGr")
	private String DesIncGr;
	@Column(name = "CodIncGr")
	private String CodIncGr;
	@Column(name = "DesIncid")
	private String DesIncid;
	@Column(name = "CodIncid")
	private String CodIncid;
	@Column(name = "NUMORDERN")
	private int NUMORDERM;
	@Column(name = "CodMaqZona")
	private String CodMaqZona;
	@Column(name = "DesMaqZona")
	private String DesMaqZona;
	@Column(name = "CodTipIn")
	private String CodTipln;

	

	
	public Stops() {
		
	}




	public Stops(String codMaqui, String desIncid, String codIncid, String desIncGr, 
			String codIncGr, int nUMORDERM,
			String codMaqZona, String desMaqZona, String codTipln) {
		super();
		CodMaqui = codMaqui;
		DesIncGr = desIncGr;
		CodIncGr = codIncGr;
		DesIncid = desIncid;
		CodIncid = codIncid;
		NUMORDERM = nUMORDERM;
		CodMaqZona = codMaqZona;
		DesMaqZona = desMaqZona;
		CodTipln = codTipln;
	}




	public String getCodMaqui() {
		return CodMaqui;
	}




	public void setCodMaqui(String codMaqui) {
		CodMaqui = codMaqui;
	}




	public String getDesIncGr() {
		return DesIncGr;
	}




	public void setDesIncGr(String desIncGr) {
		DesIncGr = desIncGr;
	}




	public String getCodIncGr() {
		return CodIncGr;
	}




	public void setCodIncGr(String codIncGr) {
		CodIncGr = codIncGr;
	}




	public String getDesIncid() {
		return DesIncid;
	}




	public void setDesIncid(String desIncid) {
		DesIncid = desIncid;
	}




	public String getCodIncid() {
		return CodIncid;
	}




	public void setCodIncid(String codIncid) {
		CodIncid = codIncid;
	}




	public int getNUMORDERM() {
		return NUMORDERM;
	}




	public void setNUMORDERM(int nUMORDERM) {
		NUMORDERM = nUMORDERM;
	}




	public String getCodMaqZona() {
		return CodMaqZona;
	}




	public void setCodMaqZona(String codMaqZona) {
		CodMaqZona = codMaqZona;
	}




	public String getDesMaqZona() {
		return DesMaqZona;
	}




	public void setDesMaqZona(String desMaqZona) {
		DesMaqZona = desMaqZona;
	}




	public String getCodTipln() {
		return CodTipln;
	}




	public void setCodTipln(String codTipln) {
		CodTipln = codTipln;
	}




	@Override
	public String toString() {
		return "Stops [CodMaqui=" + CodMaqui + ", DesIncGr=" + DesIncGr + ", CodIncGr=" + CodIncGr + ", DesIncid="
				+ DesIncid + ", CodIncid=" + CodIncid + ", NUMORDERM=" + NUMORDERM + ", CodMaqZona=" + CodMaqZona
				+ ", DesMaqZona=" + DesMaqZona + ", CodTipln=" + CodTipln + "]";
	}
	
	

}
