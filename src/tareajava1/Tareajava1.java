/*
el siguiente programa da a elegir el tipo de helado y sabor que desea el cliente
ademas de que se pueden ingresar multiples opciones, y este calculara el precio
total
 */
package tareajava1;

import java.util.Scanner;

/**
 *
 * @author Matías
 */
public class Tareajava1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);//instancia de clase escaner y se crea un objeto
        Scanner entrada2 =new Scanner(System.in);//instancia de clase escaner y se crea un objeto
        String sabor;//declaramos una variable string
        int precio=0;//declaramos una variable entera
        String opcion;//variable simple
        
        do{//inicio de ciclo de repeticion
       //las siguientes lineas de salida muestran las opciones del menu 
     System.out.println("Tipos de helados");//salida estandar
     System.out.println("1. helado simple");//salida estandar
     System.out.println("2. helado doble");//salida estandar
     System.out.println("3. vaso de helado");//salida estandar
     System.out.println("ingrese eleccion : ");//salida estandar
     int eleccion = entrada.nextInt();//se captura la opcion ingresada por el usuario
     
    switch(eleccion){//se leen las opciones ingresadas
        case 1://inicio de caso
                 System.out.println("¿chocolate, vainilla o mixto?");//salida estandar
                 System.out.println("ingrese sabor: ");//salida estandar
                 sabor = entrada2.nextLine();//captura un dato
                 if(sabor.equals("chocolate"))//compara el dato ingresado y determina si es verdadero o falso
                 {
                 precio=precio+590;//acumulador    
                 }
                 else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     if(sabor.equals("vainilla"))//compara el dato ingresado y determina si es verdadero o falso
                     {
                     precio=precio+550;//acumulador 
                     } else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     if(sabor.equals("mixto"))//compara el dato ingresado y determina si es verdadero o falso
                     {
                     precio=precio+570;//acumulador 
                     } else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     System.out.println("sabor no existe" );//salida estandar
                 }
                 }
                 }
        break;//cierra el caso
        
        case 2://inicio de caso
                 System.out.println("¿chocolate, vainilla o mixto?");//salida estandar
                 System.out.println("ingrese sabor: ");//salida estandar
                 sabor = entrada2.nextLine();//captura un dato
                 if(sabor.equals("chocolate"))//compara el dato ingresado y determina si es verdadero o falso
                 {
                 precio=precio+890;//acumulador     
                 }
                 else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     if(sabor.equals("vainilla"))//compara el dato ingresado y determina si es verdadero o falso
                     {
                     precio=precio+850;//acumulador 
                     } else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     if(sabor.equals("mixto"))//compara el dato ingresado y determina si es verdadero o falso
                     {
                     precio=precio+870;//acumulador 
                     } else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     System.out.println("sabor no existe" );//salida estandar
                         }
                 }
                 }
        break;//cierra el caso
            
             case 3://inicio de caso
                 System.out.println("¿chocolate, vainilla o mixto?");//salida estandar
                 System.out.println("ingrese sabor: ");//salida estandar
                 sabor = entrada2.nextLine();//captura un dato
                 if(sabor.equals("chocolate"))//compara el dato ingresado y determina si es verdadero o falso
                 {
                 precio=precio+500;//acumulador     
                 }
                 else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     if(sabor.equals("vainilla"))//compara el dato ingresado y determina si es verdadero o falso
                     {
                     precio=precio+450;//acumulador 
                     } else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     if(sabor.equals("mixto"))//compara el dato ingresado y determina si es verdadero o falso
                     {
                     precio=precio+470;//acumulador 
                     } else{//en caso que la condicion anterior no se cumpla se realizan los siguientes procesos
                     System.out.println("sabor no existe" );//salida estandar
                         }
                 }
                 }
        break;//cierra el caso
             default : System.out.println("Opcion no valida");// en caso que la opcion no este definida
                 
             
            
    }
    System.out.println("¿desea otro helado?(si/no): ");//salida estandar
    opcion = entrada2.nextLine();//se captura la opcion ingresada por el usuario
    }while(opcion.equals("si"));//se compara la exprecion para finalizar o no el ciclo
    System.out.println("El precio total a pagar es: $"+precio+" pesos");//salida estandar    
    }
}
  /* integrantes: Miguel Concha, Guillermo González A.
seccion: 70
*/

