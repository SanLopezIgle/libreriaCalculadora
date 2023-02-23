package com.sandra.calculadora;
import com.sandra.EntradaSalida.EntradaSalida;
public class Main {
        public static void main(String[] args) {

            Float resultado;
            int opcion = EntradaSalida.entradaEntero("1. Suma\n2. Resta\n3. Hacer multiplicación\n4. División\n5. Salir");
            float numero1 = EntradaSalida.entradaFloat("Teclee o primer número da operación");
            float numero2 = EntradaSalida.entradaFloat("Teclee o segundo número da opecion");
            if (opcion > 0 && opcion < 5) {
                resultado = Calculadora.calcular(numero1, numero2, opcion);
                if (resultado == null) {
                    EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
                }
                if (Float.isNaN(resultado)) {
                    EntradaSalida.salida("Error", EntradaSalida.SALIDA_CONSOLA);
                }
                else {
                    EntradaSalida.salida(("O resultado da operación é " + resultado), EntradaSalida.SALIDA_CONSOLA);
                }
            }
        }
}