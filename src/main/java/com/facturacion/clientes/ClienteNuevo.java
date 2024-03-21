package com.facturacion.clientes;

import com.facturacion.llamadas.Llamada;
import com.facturacion.llamadas.Nocturna;
import com.facturacion.llamadas.Regular;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Data
public class ClienteNuevo extends Cliente{
    public ClienteNuevo(String nombre, ArrayList<Llamada> historialLlamadas){
        super(nombre,historialLlamadas);
    }

    @Override
    public double calcularCargo(){
        double valorFactura = 0.0;
        for (Llamada llamada : getHistorialLlamadas()) {
            valorFactura += calcularOfertaComercial(llamada);
        }
        return valorFactura;
    }

    private double calcularOfertaComercial(Llamada llamada){
        if(llamada.getTipoLlamada() instanceof Regular){
            return new Nocturna().getPrecio() * llamada.getDuracion();
        }else{
            return llamada.calcularCosto();
        }
    }
}
