package hn.unah.examen2._0.examen2.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hn.unah.examen2._0.examen2.Modelos.Couta;

@Repository
public interface RepositorioCoutas extends JpaRepository<Couta, Long> {
    
}
