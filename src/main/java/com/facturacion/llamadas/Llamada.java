package com.facturacion.llamadas;

import lombok.*;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Llamada {
    private long id;
    private TipoLlamada tipoLlamada;
    private LocalDateTime fechaHora;
    private int duracion;

    public Llamada(int duracion, LocalDateTime fechaHora){
        this.duracion = duracion;
        this.fechaHora = fechaHora;
        this.tipoLlamada = TipoLlamadaFactory.crearTipoLlamada(fechaHora);
    }

    public Double calcularCosto(){
        return tipoLlamada.determinarTarifaTemporal(duracion);
    }

}
