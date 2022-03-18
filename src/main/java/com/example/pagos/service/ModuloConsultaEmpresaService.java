package com.example.pagos.service;


import java.util.List;

import com.example.pagos.model.*;


public interface ModuloConsultaEmpresaService {
	
	public abstract List<TransaccionesEmpresa> TraerTransacciones();	
	
}
