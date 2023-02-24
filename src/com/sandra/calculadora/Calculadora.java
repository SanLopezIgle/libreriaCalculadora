package com.sandra.calculadora;

import java.sql.SQLOutput;

public class Calculadora {
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;
    //public static final int RAIZ_CUADRADA = 5;
    //public static final int RAIZ_CUBICA = 6;
    public static final int RAIZ = 5;

    public static final int SALIR = 8;
    public static Float resultado = null;

    /**
     * Programa para realizar operaciones basicas
     * @param numero1 para realizar la operacion deseada
     * @param numero2 para realizr la operacion deseada
     * @param operacion (SUMA, RESTA, MULTIPLICACION, DIVISION)PROGR
     * @return resultado de la operacion
     */
    public static Float calcular(float numero1, float numero2, int operacion){

        switch(operacion){
            case SUMA:
                try {
                    resultado = numero1 + numero2;
                }catch(Exception e){
                    System.out.println("Error");
                }
                break;
            case RESTA:
                try {
                    resultado = numero1 - numero2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case MULTIPLICACION:
                try {
                    resultado = numero1 * numero2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case DIVISION:
                try {
                    resultado = numero1 / numero2;
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case RAIZ:
                try {
                    resultado = (float) Math.pow(numero1, (double) (1/numero2));
                }catch (Exception e){
                    System.out.println("Error");
                }
                break;
            case SALIR:
                break;
            default:
                System.out.println("Error");
                break;
        }
        return resultado;
    }
}
