package com.example.pagos.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.pagos.dao.*;
import com.example.pagos.model.*;

@Service
@Transactional
public class ModuloConsultaEmpresaImpl implements ModuloConsultaEmpresaService{
	
	@Autowired
	private ModuloConsultaEmpresadao dao;
	public List<TransaccionesEmpresa> TraerTransacciones() {
		return dao.TraerTransacciones();		
	}
}


