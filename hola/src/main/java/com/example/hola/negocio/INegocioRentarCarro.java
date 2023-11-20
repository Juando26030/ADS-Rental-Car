package com.example.hola.negocio;

import com.example.hola.dominio.Carro;
import com.example.hola.dominio.Item;
import com.example.hola.dominio.Renta;

import java.util.List;

public interface INegocioRentarCarro {
    Carro seleccionarCarro();
    Renta crearRenta();
    void totalizarRenta(Renta rentaAct);
    boolean pagarRenta(Renta rentaAct);
    boolean guardarRenta(Renta rentaAct);//crea un json y después lo guarda en el disco duro
    void listarCarros(List<Carro> carros);
}
