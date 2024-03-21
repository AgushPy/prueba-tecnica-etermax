package com.facturacion.llamadas;

import lombok.Data;

@Data
public class Regular implements TipoLlamada{

    private double precio = 0.05;

    @Override
    public Double determinarTarifaTemporal(int duracion) {
        return precio * duracion;
    }
}
