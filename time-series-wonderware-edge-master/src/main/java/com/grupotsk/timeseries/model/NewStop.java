package com.grupotsk.timeseries.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Stop")
public class NewStop {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="tag_name")
	private String tagName;
	@Column(name="date_time")
	private String dateTime;
	@Column(name="cod_parada")
	private String codParada;
	@Column(name="fecha_prod")
	private String fechaProd;
	@Column(name="cod_maqui")
	private String codMaqui;
	@Column(name="des_maqui")
	private String desMaqui;
	@Column(name="cod_turno")
	private String codTurno;
	@Column(name="fecha_ini")
	private String fechaIni;
	@Column(name="fecha_fin")
	private String fechaFin;
	@Column(name="motivo")
	private String motivo;
	@Column(name="des_motivo")
	private String desMotivo;
	@Column(name="minutos_parada_primera")
	private String minParadaPri;
	@Column(name="motivo_parada_segunda")
	private String motivoParadaSeg;
	
	
	public NewStop() {
		
	}


	public NewStop(String tagName, String dateTime, String codParada, String fechaProd, String codMaqui,
			String desMaqui, String codTurno, String fechaIni, String fechaFin, String motivo, String desMotivo,
			String minParadaPri, String motivoParadaSeg) {
		
		this.tagName = tagName;
		this.dateTime = dateTime;
		this.codParada = codParada;
		this.fechaProd = fechaProd;
		this.codMaqui = codMaqui;
		this.desMaqui = desMaqui;
		this.codTurno = codTurno;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
		this.motivo = motivo;
		this.desMotivo = desMotivo;
		this.minParadaPri = minParadaPri;
		this.motivoParadaSeg = motivoParadaSeg;
	}
	
	


	public NewStop(String tagName, String fechaIni, String fechaFin) {
		
		this.tagName = tagName;
		this.fechaIni = fechaIni;
		this.fechaFin = fechaFin;
	}


	public String getTagName() {
		return tagName;
	}


	public void setTagName(String tagName) {
		this.tagName = tagName;
	}


	public String getDateTime() {
		return dateTime;
	}


	public void setDateTime(String dateTime) {
		this.dateTime = dateTime;
	}


	public String getCodParada() {
		return codParada;
	}


	public void setCodParada(String codParada) {
		this.codParada = codParada;
	}


	public String getFechaProd() {
		return fechaProd;
	}


	public void setFechaProd(String fechaProd) {
		this.fechaProd = fechaProd;
	}


	public String getCodMaqui() {
		return codMaqui;
	}


	public void setCodMaqui(String codMaqui) {
		this.codMaqui = codMaqui;
	}


	public String getDesMaqui() {
		return desMaqui;
	}


	public void setDesMaqui(String desMaqui) {
		this.desMaqui = desMaqui;
	}


	public String getCodTurno() {
		return codTurno;
	}


	public void setCodTurno(String codTurno) {
		this.codTurno = codTurno;
	}


	public String getFechaIni() {
		return fechaIni;
	}


	public void setFechaIni(String fechaIni) {
		this.fechaIni = fechaIni;
	}


	public String getFechaFin() {
		return fechaFin;
	}


	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}


	public String getMotivo() {
		return motivo;
	}


	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}


	public String getDesMotivo() {
		return desMotivo;
	}


	public void setDesMotivo(String desMotivo) {
		this.desMotivo = desMotivo;
	}


	public String getMinParadaPri() {
		return minParadaPri;
	}


	public void setMinParadaPri(String minParadaPri) {
		this.minParadaPri = minParadaPri;
	}


	public String getMotivoParadaSeg() {
		return motivoParadaSeg;
	}


	public void setMotivoParadaSeg(String motivoParadaSeg) {
		this.motivoParadaSeg = motivoParadaSeg;
	}


	@Override
	public String toString() {
		return "NewStop [tagName=" + tagName + ", dateTime=" + dateTime + ", codParada=" + codParada + ", fechaProd="
				+ fechaProd + ", codMaqui=" + codMaqui + ", desMaqui=" + desMaqui + ", codTurno=" + codTurno
				+ ", fechaIni=" + fechaIni + ", fechaFin=" + fechaFin + ", motivo=" + motivo + ", desMotivo="
				+ desMotivo + ", minParadaPri=" + minParadaPri + ", motivoParadaSeg=" + motivoParadaSeg + "]";
	}
	
	
	
}
