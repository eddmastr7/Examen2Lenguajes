package hn.unah.examen2._0.examen2.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hn.unah.examen2._0.examen2.Modelos.Cliente;
import hn.unah.examen2._0.examen2.Modelos.Couta;
import hn.unah.examen2._0.examen2.Modelos.Prestamos;
import hn.unah.examen2._0.examen2.Servicios.PrestamosServicio;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamosController {
    
    @Autowired
    private PrestamosServicio prestamosServicio;

    @PostMapping("/crear")
    public Couta crearPrestamos(@RequestBody Prestamos nvoPrestamos) {
        
        return this.prestamosServicio.crearPrestamos(nvoPrestamos);
    }

    @GetMapping("/obtener/todos")
    public List<Prestamos> obtenerTodos(){
        return this.prestamosServicio.obtenerTodos();
    }

    @GetMapping("/obtener/{codigoPrestamos}")
    public Cliente obtenerPorCodigo(@PathVariable(name = "codigoPrestamos") long codigoPrestamos) {
        return this.prestamosServicio.obtenerPorCodigo(codigoPrestamos);
    }
}
