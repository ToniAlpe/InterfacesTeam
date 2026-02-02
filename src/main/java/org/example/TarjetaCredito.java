package org.example;

public class TarjetaCredito implements iMetodoPago {

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago con " + obtenerTipo() + " de: " + importe + "€");
    }

    @Override
    public String obtenerTipo() {
        return "Tarjeta de credito";
    }

    @Override
    public boolean requiereAutenticacion() {
        return true;
    }
}
