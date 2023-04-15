package com.Bodega.service;
import com.Bodega.entity.Articulos;
import com.Bodega.repository.ArticulosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ArticulosService {
    @Autowired
    ArticulosRepository articulosRepository;

    public Optional<Articulos> getArticulos (Integer id){return articulosRepository.findById(id);}
    public List<Articulos> getArticulos(){return articulosRepository.findAll();}

    public Articulos insertarArticulos(Articulos articulos){
        return articulosRepository.save(articulos);
    }

    public void eliminar(Integer id){
        articulosRepository.deleteById(id);
    }

    public Articulos actualizar(Articulos articulos){
        return articulosRepository.save(articulos);
    }
}
