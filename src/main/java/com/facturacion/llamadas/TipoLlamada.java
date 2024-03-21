package com.facturacion.llamadas;

import java.time.LocalDateTime;

public interface TipoLlamada {
    double precio = 0;

    public Double determinarTarifaTemporal(int duracion);

}
