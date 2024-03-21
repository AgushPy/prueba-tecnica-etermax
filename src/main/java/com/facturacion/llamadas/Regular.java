package com.facturacion.llamadas;

import java.time.LocalDateTime;

public class Regular implements TipoLlamada{

    private double precio = 0.05;

    @Override
    public Double determinarTarifaTemporal(int duracion) {
        return precio * duracion;
    }
}
