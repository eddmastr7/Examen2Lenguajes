package hn.unah.examen2._0.examen2.Servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hn.unah.examen2._0.examen2.Modelos.Cliente;
import hn.unah.examen2._0.examen2.Repositorios.RepositorioCliente;

@Service
public class ClienteServicio {
    
    @Autowired
    private RepositorioCliente repositorioCliente;

    public List<Cliente> obtenerTodos(){
        return this.repositorioCliente.findAll();
    }

    public Cliente obtenerPorDniCliente(long dni){
        return this.repositorioCliente.findById(dni).get();
    }
}
