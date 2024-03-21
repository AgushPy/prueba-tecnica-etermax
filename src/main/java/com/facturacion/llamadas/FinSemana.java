package com.facturacion.llamadas;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

@Data
public class FinSemana implements TipoLlamada{
    double precio = 0.01;
    @Override
    public Double determinarTarifaTemporal(int duracion) {
        return precio * duracion;
    }
}
