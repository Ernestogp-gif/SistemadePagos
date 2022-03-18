package com.example.pagos.dao;


import java.util.List;

import com.example.pagos.model.*;

public interface ModuloConsultaEmpresadao {
	
	public abstract List<TransaccionesEmpresa> TraerTransacciones();

}

