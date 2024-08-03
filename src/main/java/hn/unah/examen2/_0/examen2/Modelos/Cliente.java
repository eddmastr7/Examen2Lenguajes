package hn.unah.examen2._0.examen2.Modelos;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;


@Entity
@Table(name="cliente")
@Data
public class Cliente {
    
    @Id
    @OneToMany(mappedBy = "prestamos", cascade = CascadeType.ALL)
    private List<Prestamos>prestamos;
    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="dni")
    private String dni;

    private String nombre;

    private String apellido;

    private int telefono;

}
