package com.facturacion.llamadas;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class FinSemana implements TipoLlamada{
    double precio = 0.01;
    @Override
    public Double determinarTarifaTemporal(int duracion) {
        return precio * duracion;
    }
}
