package llamadas;

import java.time.LocalDateTime;

import com.facturacion.llamadas.*;
import org.junit.Assert;
import org.junit.Assert.*;
import org.junit.Test;

public class LlamadaTest {

    @Test
    public void calcularCosto_ConLlamadaRegular_RetornaDouble(){
        LocalDateTime fechaHora = LocalDateTime.of(2024,03,20,15,55);
        Llamada llamada = new Llamada(20,fechaHora);
        double costoEsperado = 1.0;

        double costoLlamada = llamada.calcularCosto();

        Assert.assertEquals(costoLlamada,costoEsperado,0.0);

    }

    @Test
    public void calcularCosto_ConLlamadaNocturna_RetornaDouble(){
        LocalDateTime fechaHora = LocalDateTime.of(2024,03,20,00,20);
        Llamada llamada = new Llamada(20,fechaHora);
        double costoEsperado = 0.4;

        double costoLlamada = llamada.calcularCosto();

        Assert.assertEquals(costoLlamada,costoEsperado,0.0);

    }

    @Test
    public void calcularCosto_ConLlamadaFinSemanaConHorarioNocturno_RetornaDouble(){
        LocalDateTime fechaHora = LocalDateTime.of(2024,03,23,23,20);
        Llamada llamada = new Llamada(20, fechaHora);
        double costoEsperado = 0.2;

        double costoLlamada = llamada.calcularCosto();

        Assert.assertEquals(costoLlamada,costoEsperado,0.0);

    }

    @Test
    public void calcularCosto_ConLlamadaFinSemanaConHorarioDiurno_RetornaDouble(){
        LocalDateTime fechaHora = LocalDateTime.of(2024,03,23,13,20);
        Llamada llamada = new Llamada(20, fechaHora);
        double costoEsperado = 0.2;

        double costoLlamada = llamada.calcularCosto();

        Assert.assertEquals(costoLlamada,costoEsperado,0.0);

    }
}
