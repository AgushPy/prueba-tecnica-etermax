package com.facturacion.llamadas;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class TipoLlamadaFactory {

    public static TipoLlamada createTipoLlamada(LocalDateTime horarioDia) {
        if (horarioDia.getDayOfWeek() == DayOfWeek.SATURDAY || horarioDia.getDayOfWeek() == DayOfWeek.SUNDAY) {
            return new FinSemana();
        } else if (horarioDia.getHour() >= 22 || horarioDia.getHour() <= 04) {
            return new Nocturna();
        } else {
            return new Regular();
        }
    }
}
