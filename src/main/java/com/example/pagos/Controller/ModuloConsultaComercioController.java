package com.example.pagos.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.pagos.model.*;

import com.example.pagos.service.ModuloConsultaComercioService;

@RestController
@RequestMapping(path = "Reportes/")
public class ModuloConsultaComercioController {

	@Autowired(required = true)
	private ModuloConsultaComercioService service;
	
	@RequestMapping(value = "ConsultarPagos",produces = "application/json", method = RequestMethod.GET)
	public @ResponseBody List<Pagos> TraerPagos() {
		return service.TraerPagos();
	}

	@RequestMapping(value = "ConsultarRecargas",produces = "application/json", method = RequestMethod.GET)
	public @ResponseBody List<Recargas> TraerRecargas() {
		return service.TraerRecargas();
	}
	

}
