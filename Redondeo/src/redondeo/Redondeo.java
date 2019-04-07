/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redondeo;

/**
 * Ejemplo de redondeo de números decimales.
 * @author Ingeniero en computación Ricardo Presilla.
 */
public class Redondeo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double numero=8.5252719;
        System.out.print("El numero 8.5252719 con 2 decimales queda "+ redondearDecimales(numero, 2));
        System.out.println(". Con 4 decimales queda "+redondearDecimales(numero, 4)+
 " y con 6 decimales queda "+redondearDecimales(numero, 6));
        numero=12.5552917;
        System.out.print("El numero 12.5552917 con 2 decimales queda "+ redondearDecimales(numero, 2));
        System.out.println(". Con 4 decimales queda "+redondearDecimales(numero, 4)+
 " y con 6 decimales queda "+redondearDecimales(numero, 6));
        numero= -12.5566112345;
        System.out.print("El numero -12.5566112345 con 2 decimales queda "+ redondearDecimales(numero, 2));
        System.out.println(". Con 4 decimales queda "+redondearDecimales(numero, 4)+
 " y con 6 decimales queda "+redondearDecimales(numero, 6));
    }
/**Método para redondear los decimales.
 * @param valorInicial  Tipo double, contiene el número con todos los decimales.
 * @param numeroDecimales   Tipo int, contiene la cantidad de numeros decimales 
 *                          ha mostrar.
 * @return Regresa el número formateado, a la cantidad de decimales indicados.
 */
    public static double redondearDecimales(double valorInicial, int numeroDecimales) {
        double parteEntera=0, resultado=0;
        resultado = valorInicial;
        parteEntera = Math.floor(resultado);
        resultado=(resultado-parteEntera)*Math.pow(10, numeroDecimales);
        resultado=Math.round(resultado);
        resultado=(resultado/Math.pow(10, numeroDecimales))+parteEntera;
        return resultado;
    }
    
}
