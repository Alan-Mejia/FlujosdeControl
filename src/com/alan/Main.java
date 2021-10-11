package com.alan;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
        System.out.println("Introduce el primer angulo: ");
        float ang1 = sc.nextFloat();

        System.out.println("Introduce el primer angulo: ");
        float ang2 = sc.nextFloat();

        System.out.println("Introduce el primer angulo: ");
        float ang3 = sc.nextFloat();

        if((ang1+ang2+ang3)!=180){
            System.out.println("No es un tringulo valido");
        }else{
            System.out.println("Es un triangulo valido");
        }
*/
        //int prueba = new Scanner(System.in);
        //System.out.println(typeof());

        /*    EJEMPLO DE COMO TENDRIA QUE SER LA SINTAXIS SI NO SE DECLARA UNA VARIABLE TIPO SCANNER DE MANERA GLOBAL

        System.out.println("Introduce el primer angulo");
        float ang1 = new Scanner(System.in).nextFloat();
        System.out.println(ang1);*/


        //AÑO BISISESTO O NO?
 /*       System.out.println("Introduce un año ");
        int anio = sc.nextInt();
        if(anio%4==0){
            System.out.println("Es un año bisiesto");
        }else{
            System.out.println("No es un año bisisesto");
        }
*/

        //Control de flujo switch
       /* switch(condicion){
            case 1:
                codigo
                break;
            case 2:
                codigo
               break;
            default:
                codigo
                break;
        }*/

        System.out.println("Ingresa un numero: ");
        int num1 = sc.nextInt();
        System.out.println("Ingresa otro numero: ");
        int num2 = sc.nextInt();
        System.out.println("Ingresa la opercacion deseada:  \n 1) Suma \n 2) Resta \n 3) Multiplicacion \n 4) Division");


        int opcion;
            do {
                    opcion = sc.nextInt();


                    switch (opcion) {
                        case 1:
                            System.out.println(num1 + num2);
                            break;
                        case 2:
                            System.out.println(num1 - num2);
                            break;
                        case 3:
                            System.out.println(num1 * num2);
                            break;
                        case 4:
                            System.out.println(num1 / num2);
                            break;
                        default:
                            System.out.println("Por favor introduce una opcion validad");
                    }
            }while(opcion<1 || opcion>4);

        System.out.println("Introduce un numero y te dire el dia de la semana");
        int numerodeUsuario;
        do{
            numerodeUsuario=sc.nextInt();

        switch(numerodeUsuario){
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Introduce un opcion valida");
                    break;
            }
        }while(numerodeUsuario<1 || numerodeUsuario>7);

    }
}
