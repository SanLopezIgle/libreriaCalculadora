package com.sandra.calculadora;
import com.sandra.EntradaSalida.EntradaSalida;
public class Main {
        public static void main(String[] args) {

            Float resultado;
            float numero1 = EntradaSalida.entradaFloat("Dame el primer número de la operación que quieras hacer\n" +
                                                        "(en caso de la raiz el radicando):");
            float numero2 = EntradaSalida.entradaFloat("Dame el segundo número\n" +
                                                        "(en caso de la raiz el indice:");
            int opcion = EntradaSalida.entradaEntero("¿Qué operación quieres hacer?\n1. Suma\n2. Resta\n3. Multiplicación\n4. División\n5. Raiz\n6. Salir");
            if (opcion > 0 && opcion < 6) {
                resultado = Calculadora.calcular(numero1, numero2, opcion);
                if (resultado == null) {
                    EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
                }
                if (Float.isNaN(resultado)) {
                    EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
                }
                else {
                    EntradaSalida.salida(("El resultado de la operación es " + resultado), EntradaSalida.SALIDA_CONSOLA);
                }
            }
        }
}