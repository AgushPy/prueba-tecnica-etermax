package com.facturacion.llamadas;

import java.time.LocalDateTime;

public class Nocturna implements TipoLlamada{
    double precio = 0.02;
    @Override
    public Double determinarTarifaTemporal(int duracion) {
        return precio * duracion;
    }
}
