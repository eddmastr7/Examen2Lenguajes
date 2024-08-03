package hn.unah.examen2._0.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examen2._0.examen2.Modelos.Prestamos;
@Repository
public interface RepositorioPrestamos extends JpaRepository<Prestamos, Long> {
    
}
