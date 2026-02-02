package org.example;

public class TransferenciaBancaria implements iMetodoPago{
    @Override
    public void procesarPago(double importe) {
        System.out.println("Operacion realizada por " + obtenerTipo()+ " de: " + importe + "€");
    }

    @Override
    public String obtenerTipo() {
        return "Tranferencia bancaria";
    }

    @Override
    public boolean requiereAutenticacion() {
        return false;
    }
}
