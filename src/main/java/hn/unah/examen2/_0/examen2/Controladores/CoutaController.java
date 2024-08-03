package hn.unah.examen2._0.examen2.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2._0.examen2.Modelos.Couta;
import hn.unah.examen2._0.examen2.Servicios.CoutaServicio;


@RestController
@RequestMapping("/api/couta")
public class CoutaController {
    
    @Autowired
    private CoutaServicio coutaServicio;

    @PostMapping("/crear")
    public Couta crearCouta(@RequestBody Couta nvaCouta) {
        
        return this.coutaServicio.crearCouta(nvaCouta);
    }

    @GetMapping("/obtener/todos")
    public List<Couta> obtenerTodos(){
        return this.coutaServicio.obtenerTodos();
    }

    @GetMapping("/obtener/{codigoCouta}")
    public Couta obtenerPorNumero(@PathVariable(name = "codigoCouta") long codigoCouta) {
        return this.coutaServicio.obtenerPorNumero(codigoCouta);
    }

}
