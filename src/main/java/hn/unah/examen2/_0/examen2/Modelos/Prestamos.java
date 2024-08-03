package hn.unah.examen2._0.examen2.Modelos;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Prestamos")
@Data
public class Prestamos {
    
    @ManyToOne
    @JoinColumn(name = "dni")

    @OneToMany
    @JoinColumn(name = "codigoPrestamo", referencedColumnName = "codigoPrestamo")

    private Integer plazo;

    private double monto;

    private double couta;
}
