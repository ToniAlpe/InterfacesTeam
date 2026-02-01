package org.example;

public class Main {
    static void main() {

        iMetodoPago pago1 = new TarjetaCredito();
        iMetodoPago pago2 = new PayPal();
        iMetodoPago pago3 = new TransferenciaBancaria();

        System.out.println("Primer metodo");
        pago1.procesarPago(150);
        pago1.requiereAutenticacion();
        System.out.println("-----------------------");

        System.out.println("Segundo metodo");
        pago2.procesarPago(80);
        pago2.requiereAutenticacion();
        System.out.println("-----------------------");

        System.out.println("Tercer metodo");
        pago3.procesarPago(300);
        pago3.requiereAutenticacion();
        System.out.println("-----------------------");

//        if (pago1.requiereAutenticacion()) {
//            System.out.println("Este metodo requiero huella o verificación por SMS");
//        } else {
//            System.out.println("No requierre nada");
//        }
    }
}
