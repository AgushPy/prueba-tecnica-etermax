package clientes;

import com.facturacion.clientes.Cliente;
import com.facturacion.clientes.ClienteNuevo;
import com.facturacion.llamadas.Llamada;
import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class ClienteTest {

    @Test
    public void calcularCargo_ConClienteExistenteYUnHistorialDeLlamadaRegularNocturnaFinSemana_RetornaPrecioValido(){
        LocalDateTime fechaHoraRegular = LocalDateTime.of(2024, 03,21,15,22);
        LocalDateTime fechaHoraNocturna = LocalDateTime.of(2024, 03,21,03,22);
        LocalDateTime fechaHoraFinSemana = LocalDateTime.of(2024, 03,16,03,22);
        Llamada llamada1 = new Llamada(10,fechaHoraRegular);
        Llamada llamada2 = new Llamada(5,fechaHoraNocturna);
        Llamada llamada3 = new Llamada(20, fechaHoraFinSemana);
        ArrayList<Llamada> historiaLlamadas = new ArrayList<Llamada>();
        historiaLlamadas.add(llamada1);
        historiaLlamadas.add(llamada2);
        historiaLlamadas.add(llamada3);
        Cliente cliente = new Cliente("Juan",historiaLlamadas);
        double precioFacturaEsperado = 0.8;

        double precioFactura = cliente.calcularCargo();

        Assert.assertEquals(precioFactura,precioFacturaEsperado,0.0);

    }

    @Test
    public void calcularCargo_ConClienteNuevoUnHistorialDeLlamadaRegularNocturnaFinSemana_RetornaPrecioValido(){
        LocalDateTime fechaHoraRegular = LocalDateTime.of(2024, 03,21,15,22);
        LocalDateTime fechaHoraNocturna = LocalDateTime.of(2024, 03,21,03,22);
        LocalDateTime fechaHoraFinSemana = LocalDateTime.of(2024, 03,16,03,22);
        Llamada llamada1 = new Llamada(10,fechaHoraRegular);
        Llamada llamada2 = new Llamada(5,fechaHoraNocturna);
        Llamada llamada3 = new Llamada(20, fechaHoraFinSemana);
        ArrayList<Llamada> historiaLlamadas = new ArrayList<Llamada>();
        historiaLlamadas.add(llamada1);
        historiaLlamadas.add(llamada2);
        historiaLlamadas.add(llamada3);
        Cliente cliente = new ClienteNuevo("Juan",historiaLlamadas);
        double precioFacturaEsperado = 0.5;

        double precioFactura = cliente.calcularCargo();

        Assert.assertEquals(precioFactura,precioFacturaEsperado,0.0);
    }
}
