package com.example.hola.negocio;

import com.example.hola.dominio.Carro;
import com.example.hola.dominio.Renta;
import com.example.hola.dominio.Servicio;

import java.util.List;

public interface INegocioItems {
    void listarItems(Renta rentaAct);
    void añadirItem(Renta rentaAct);
    void eliminarItem(Renta rentaAct);
    void modificarItem(Renta rentaAct);
    void listarServicios(List<Servicio> servicios);
}
