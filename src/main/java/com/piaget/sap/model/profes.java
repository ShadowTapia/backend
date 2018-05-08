package com.piaget.sap.model;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "profesores")
@Access(AccessType.FIELD)
public class profes extends ParentEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "run_profe", nullable = false, length = 12)
	private String run;

	@Column(name = "nom_profe", nullable = false, length = 100)
	private String nomprofe;

	@Column(name = "pater_profe", nullable = false, length = 70)
	private String paterprofe;
	
	@Column(name = "mater_profe", nullable = false, length = 70)
	private String materprofe;
	
	@Column(name = "fono_profe", nullable = true, length = 10)
	private Long fonoprofe;
	
	@Column(name = "address_profe", nullable = true, length = 150)
	private String addressprofe;
	
	@Column(name = "email_profe", nullable = false, length = 150)
	private String emailprofe;

	public String getRun() {
		return run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getNomprofe() {
		return nomprofe;
	}

	public void setNomprofe(String nomprofe) {
		this.nomprofe = nomprofe;
	}

	public String getPaterprofe() {
		return paterprofe;
	}

	public void setPaterprofe(String paterprofe) {
		this.paterprofe = paterprofe;
	}

	public String getMaterprofe() {
		return materprofe;
	}

	public void setMaterprofe(String materprofe) {
		this.materprofe = materprofe;
	}

	public Long getFonoprofe() {
		return fonoprofe;
	}

	public void setFonoprofe(Long fonoprofe) {
		this.fonoprofe = fonoprofe;
	}

	public String getAddressprofe() {
		return addressprofe;
	}

	public void setAddressprofe(String addressprofe) {
		this.addressprofe = addressprofe;
	}

	public String getEmailprofe() {
		return emailprofe;
	}

	public void setEmailprofe(String emailprofe) {
		this.emailprofe = emailprofe;
	}

}
