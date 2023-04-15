package com.Bodega.service;

import com.Bodega.entity.Departamento;
import com.Bodega.entity.Persona;
import com.Bodega.repository.DepartamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class DepartamentoService {
    @Autowired
    DepartamentoRepository departamentoRepository;

    public Optional<Departamento> getDepartamento (Integer id){return departamentoRepository.findById(id);}
    public List<Departamento> getDepartamento(){return departamentoRepository.findAll();}

    public Departamento insertarDepartamento(Departamento departamento){
        return departamentoRepository.save(departamento);
    }

    public void eliminar(Integer id){
       departamentoRepository.deleteById(id);
    }

    public Departamento actualizar(Departamento departamento){
        return departamentoRepository.save(departamento);
    }
}
