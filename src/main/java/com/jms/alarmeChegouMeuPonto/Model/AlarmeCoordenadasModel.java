package com.jms.alarmeChegouMeuPonto.Model;

import java.io.Serializable;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_coordenadas_alarme")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class AlarmeCoordenadasModel implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "coordenadas_alarme_generator")
	@SequenceGenerator(name = "coordenadas_alarme_generator", sequenceName = "public.tb_coordenadas_alarme_seq", allocationSize = 1)
	Long id;
	String latitude, longitude;
	Date dataCoordenada;
	
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public Date getDataCoordenada() {
		return dataCoordenada;
	}
	public void setDataCoordenada(Date dataCoordenada) {
		this.dataCoordenada = dataCoordenada;
	}
}
