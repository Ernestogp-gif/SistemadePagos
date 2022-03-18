package com.example.pagos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
/*
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String Home() {
		return "index";
	}
	
	@RequestMapping(value = "prueba", method = RequestMethod.GET)
	public String Hello() {
		return "prueba";
	}
	
	@GetMapping("prueba.html")
	  public String method() {
	    return "prueba"; //extension depends on view resolver.
	}
	
	
	@RequestMapping(value = "prueba3", method = RequestMethod.GET)
	public String Hello1() {
		return "prueba3";
	}
	*/
	@RequestMapping(value = "Menu", method = RequestMethod.GET)
	public String Menu() {
		return "Menu";
	}
	
	@RequestMapping(value = "Pago", method = RequestMethod.GET)
	public String Pago() {
		return "Pago";
	}
	
	@RequestMapping(value = "Consulta", method = RequestMethod.GET)
	public String Consulta() {
		return "Consulta";
	}
	
	@RequestMapping(value = "Recarga", method = RequestMethod.GET)
	public String Recarga() {
		return "Recarga";
	}
	
	@RequestMapping(value = "Login", method = RequestMethod.GET)
	public String Login() {
		return "Login";
	}
	
	@RequestMapping(value = "ConsultaEmpresa", method = RequestMethod.GET)
	public String ConsultaEmpresa() {
		return "ConsultaEmpresa";
	}
	
	@RequestMapping(value = "ConsultaComercioPagos", method = RequestMethod.GET)
	public String ConsultaComercioPagos() {
		return "ConsultaComercioPagos";
	}
	
	
	@RequestMapping(value = "ConsultaComercioRecargas", method = RequestMethod.GET)
	public String ConsultaComercioRecargas() {
		return "ConsultaComercioRecargas";
	}	
	
}


