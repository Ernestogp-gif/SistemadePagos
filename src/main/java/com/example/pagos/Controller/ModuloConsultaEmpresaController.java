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

import com.example.pagos.service.*;

@RestController
@RequestMapping(path = "ReporteEmpresa/")
public class ModuloConsultaEmpresaController {

	@Autowired(required = true)
	private ModuloConsultaEmpresaService service;
	
	@RequestMapping(value = "ConsultarTransacciones",produces = "application/json", method = RequestMethod.GET)
	public @ResponseBody List<TransaccionesEmpresa> TraerTransacciones() {
		return service.TraerTransacciones();
	}
	
	
}









