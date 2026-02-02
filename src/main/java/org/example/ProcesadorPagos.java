package org.example;

public class ProcesadorPagos {
    static void realizarCobro (iMetodoPago metodo, double importe) {

            if (importe < 0) throw new IllegalArgumentException("Importe negativo");
            else {
                metodo.procesarPago(importe);
            }
    }
}
