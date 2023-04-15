package com.Bodega.controller;

import com.Bodega.entity.Articulos;
import com.Bodega.service.ArticulosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("articulos")
public class ArticulosController {
    @Autowired
    ArticulosService articulosService;
    @GetMapping("/articulos/{id}")
    public Optional<Articulos> buscarArticulos(@PathVariable int id){
        return articulosService.getArticulos(id);
    }
    @GetMapping("/personas")
    public List<Articulos> getArticulos(){
        return articulosService.getArticulos();
    }

    @PostMapping("/insertar")
    public Articulos insertarArticulos (@RequestBody Articulos articulos){ return articulosService.insertarArticulos(articulos);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id){
        articulosService.eliminar(id);
    }

    @PutMapping("/modificar")
    public Articulos modificar(@RequestBody Articulos articulos){
        return  articulosService.actualizar(articulos);
    }
}
