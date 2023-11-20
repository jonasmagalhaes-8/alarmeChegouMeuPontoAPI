package com.jms.alarmeChegouMeuPonto.Service;

import org.springframework.stereotype.Service;
import com.jms.alarmeChegouMeuPonto.Model.AlarmeCoordenadasModel;
import com.jms.alarmeChegouMeuPonto.Repository.AlarmeCoordenadasRepository;

@Service
public class AlarmeCoordenadasService {

	private final AlarmeCoordenadasRepository repository;
	
	public AlarmeCoordenadasService(final AlarmeCoordenadasRepository repository) {
		this.repository = repository;
	}

	public void insert(AlarmeCoordenadasModel coordenadas) {
		repository.save(coordenadas);
	}

}
