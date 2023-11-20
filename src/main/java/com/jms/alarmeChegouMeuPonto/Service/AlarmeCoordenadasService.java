package com.jms.alarmeChegouMeuPonto.Service;

import java.util.Date;
import java.util.TimeZone;

import org.springframework.stereotype.Service;

import com.jms.alarmeChegouMeuPonto.Model.AlarmeCoordenadasModel;
import com.jms.alarmeChegouMeuPonto.Repository.AlarmeCoordenadasRepository;

@Service
public class AlarmeCoordenadasService {

	private final AlarmeCoordenadasRepository repository;
	
	public AlarmeCoordenadasService(final AlarmeCoordenadasRepository repository) {
		TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));
		this.repository = repository;
	}

	public void insert(AlarmeCoordenadasModel coordenadas) {
		coordenadas.setDataCoordenada(new Date());
		repository.save(coordenadas);
	}

}
