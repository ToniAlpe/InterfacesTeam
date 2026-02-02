package org.example;

public class Main {
    static void main() {

        PayPal p = new PayPal();
        TarjetaCredito tc = new TarjetaCredito();
        TransferenciaBancaria tf = new TransferenciaBancaria();

        /*CON Array*/

        //Se puede hacer asi, pero se intenta desarrollar verticalmente
        //iMetodoPago metodos[] = {new PayPal(), new TarjetaCredito(), new TransferenciaBancaria()};

        iMetodoPago metodos[] = {
                new PayPal(),
                new TarjetaCredito(),
                new TransferenciaBancaria()
        };

        for(int i=0; i<metodos.length; i++) {
            metodos[i].procesarPago(100*i);
        }

        ProcesadorPagos.realizarCobro(tc, -1000);


        /*SIN Arraylist / Array*/
        // Instanciando cada clase
//        iMetodoPago pago1 = new TarjetaCredito();
//        iMetodoPago pago2 = new PayPal();
//        iMetodoPago pago3 = new TransferenciaBancaria();
//
//        System.out.println("Primer metodo");
//        pago1.procesarPago(150);
//        pago1.requiereAutenticacion();
//        System.out.println("-----------------------");
//
//        System.out.println("Segundo metodo");
//        pago2.procesarPago(80);
//        pago2.requiereAutenticacion();
//        System.out.println("-----------------------");
//
//        System.out.println("Tercer metodo");
//        pago3.procesarPago(300);
//        pago3.requiereAutenticacion();
//        System.out.println("-----------------------");

//        if (pago1.requiereAutenticacion()) {
//            System.out.println("Este metodo requiero huella o verificación por SMS");
//        } else {
//            System.out.println("No requiere nada");
//        }
    }
}
