package com.facturacion.llamadas;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Data
public class Regular implements TipoLlamada{

    private double precio = 0.05;

    @Override
    public Double determinarTarifaTemporal(int duracion) {
        return precio * duracion;
    }
}
