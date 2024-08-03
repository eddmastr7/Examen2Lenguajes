package hn.unah.examen2._0.examen2.Modelos;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

public class Couta {
    

@Entity
@Table(name = "Couta")
@Data
public class Reserva {
    
    @Id
    @Column(name="codigoCouta")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idReserva;

    @ManyToOne
    @JoinColumn(name="dni", referencedColumnName = "dni")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "codigoPrestamo", referencedColumnName = "codigoPrestamo")
    private int mes;

    private LocalDate fechaApertura;

    private Integer plazo;

    private double monto;

    private double couta;

}
    //codigoCouta
    //fechaApertura
    //monto
    //Couta
    //plazo
    //dni

}
