package com.facturacion.llamadas;

import lombok.Data;

@Data
public class Nocturna implements TipoLlamada{
    double precio = 0.02;
    @Override
    public Double determinarTarifaTemporal(int duracion) {
        return precio * duracion;
    }
}
