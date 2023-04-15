package com.Bodega.controller;

import com.Bodega.entity.Persona;
import com.Bodega.responses.Persona400;
import com.Bodega.responses.Persona404;
import com.Bodega.service.PersonaService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("persona")
public class PersonaController {
    @Autowired
    PersonaService personaService;


    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "OK tu solicitud fue exitosa", content = {@Content(mediaType = "aplication/json", schema = @Schema(implementation = Persona.class))}),
            @ApiResponse(responseCode = "400", description = "el clinete tiene el error", content = {@Content(mediaType = "aplication/json", schema = @Schema(implementation = Persona400.class))}),
            @ApiResponse(responseCode = "404", description = "Persona encontrada", content = {@Content(mediaType = "aplication/json", schema = @Schema(implementation = Persona404.class))})
    })
    @GetMapping("/persona/{id}")
    public Optional<Persona> buscarPersona(@PathVariable int id){
        return personaService.getPersona(id);
    }

    @GetMapping("/personas")
    public List<Persona> getPersonas(){
        return personaService.getPersonas();
    }

    @PostMapping("/insertar")
    public Persona insertarPersona(@RequestBody Persona persona){
        return personaService.insertarPersona(persona);
    }

    @DeleteMapping("/borrar/{id}")
    public void eliminar(@PathVariable int id){
        personaService.eliminar(id);
    }

    @PutMapping("/modificar")
    public Persona modificar(@RequestBody Persona persona){
        return  personaService.actualizar(persona);
    }

}
