package com.example.pagos.service;

import java.util.Date;
import java.util.List;

import com.example.pagos.model.*;


public interface ModuloConsultaComercioService {
	
	public abstract List<Pagos> TraerPagos();
	public abstract Pagos TraerPagosxFechas(Date fecini, Date fecfin);
	public abstract Pagos TraerPagosxServicios(String servicio);
	
	public abstract List<Recargas> TraerRecargas();
	
}
