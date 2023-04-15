package com.Bodega.controller;

import com.Bodega.entity.Departamento;
import com.Bodega.entity.Persona;
import com.Bodega.service.DepartamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("departamento")
public class DepartamentoCotroller {
    @Autowired
    DepartamentoService departamentoService;
    @GetMapping("/departamento/{id}")
    public Optional<Departamento> buscarDepartamento(@PathVariable int id){
        return departamentoService.getDepartamento(id);
    }
    @GetMapping("/departamento")
    public List<Departamento> getDepartamento(){
        return departamentoService.getDepartamento();
    }

    @PostMapping("/insertar")
    public Departamento insertarDepartamento(@RequestBody Departamento departamento){
        return departamentoService.insertarDepartamento(departamento);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id){
        departamentoService.eliminar(id);
    }

    @PutMapping("/modificar")
    public Departamento modificar(@RequestBody Departamento departamento){
        return  departamentoService.actualizar(departamento);
    }


}
