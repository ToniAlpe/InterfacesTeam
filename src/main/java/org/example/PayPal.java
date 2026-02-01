package org.example;

public class PayPal implements iMetodoPago {

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procensando el pago via " + obtenerTipo() + " de: " + importe + "€");
    }

    @Override
    public String obtenerTipo() {
        return "PayPal";
    }

    @Override
    public boolean requiereAutenticacion() {
        return true;
    }
}
