package org.example;

public interface iMetodoPago {

    void procesarPago(double importe);
    String obtenerTipo();
    boolean requiereAutenticacion();
}
