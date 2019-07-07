package com.api.ApiSpring.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PCPEDC")
public class Pedido implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Integer numped;
	private Integer codfunsep;
	private Date datainicialsep;
	private String possicao;
	
	public Pedido() {
		
	}

	public Pedido(Integer numped, Integer codfunsep, Date datainicialsep, String possicao) {
		super();
		this.numped = numped;
		this.codfunsep = codfunsep;
		this.datainicialsep = datainicialsep;
		this.possicao = possicao;
	}

	public Integer getNumped() {
		return numped;
	}

	public void setNumped(Integer numped) {
		this.numped = numped;
	}

	public Integer getCodfunsep() {
		return codfunsep;
	}

	public void setCodfunsep(Integer codfunsep) {
		this.codfunsep = codfunsep;
	}

	public Date getDatainicialsep() {
		return datainicialsep;
	}

	public void setDatainicialsep(Date datainicialsep) {
		this.datainicialsep = datainicialsep;
	}

	public String getPossicao() {
		return possicao;
	}

	public void setPossicao(String possicao) {
		this.possicao = possicao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numped == null) ? 0 : numped.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (numped == null) {
			if (other.numped != null)
				return false;
		} else if (!numped.equals(other.numped))
			return false;
		return true;
	}
	
	
	
	
}
