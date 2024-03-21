package com.facturacion.clientes;

import com.facturacion.llamadas.Llamada;
import lombok.*;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private Long id;
    private String nombre;
    private ArrayList<Llamada> historialLlamadas;

    public Cliente(String nombre,ArrayList<Llamada> historialLlamadas){
        this.nombre = nombre;
        this.historialLlamadas = historialLlamadas;
    }

    public double calcularCargo(){
        double valorFactura = 0.0;
        for (Llamada llamada : getHistorialLlamadas()) {
            valorFactura += llamada.calcularCosto();
        }
        return valorFactura;
    }
}
