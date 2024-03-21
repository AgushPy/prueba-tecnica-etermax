package com.facturacion.llamadas;

import lombok.Data;

@Data
public class FinSemana implements TipoLlamada{
    double precio = 0.01;
    @Override
    public Double determinarTarifaTemporal(int duracion) {
        return precio * duracion;
    }
}
