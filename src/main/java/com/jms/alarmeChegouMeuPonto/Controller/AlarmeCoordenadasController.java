package com.jms.alarmeChegouMeuPonto.Controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jms.alarmeChegouMeuPonto.Model.AlarmeCoordenadasModel;
import com.jms.alarmeChegouMeuPonto.Service.AlarmeCoordenadasService;

@RestController
@CrossOrigin
@RequestMapping(value = "/alarmecoordenadas")
public class AlarmeCoordenadasController {

	private final AlarmeCoordenadasService service;
					
	public AlarmeCoordenadasController(final AlarmeCoordenadasService service) {
		this.service = service;
	}

	@PostMapping
	public void insert(@RequestBody AlarmeCoordenadasModel coordenadas) {
		service.insert(coordenadas);
	}
}