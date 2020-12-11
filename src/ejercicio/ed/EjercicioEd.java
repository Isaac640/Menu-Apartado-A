/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.ed;

import java.util.Scanner;

/**
 *
 * @author DAM107
 */
public class EjercicioEd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        int menu;
        do{
        System.out.println("Escribe un numero para acceder a estas opciones: ");
        System.out.println("1- Pasar horas a segundos");
        System.out.println("2- Pasar kilometros a metros");
        System.out.println("3- Pasar Km/H a m/s");
        System.out.println("4- Salir");
        menu=teclado.nextInt();
        switch(menu){
            case 1:
                    int seg;
                    int h;
                    System.out.println("introduce las horas");
                    h=teclado.nextInt();
                    seg=3600*h;
                    System.out.println(h+" horas son: "+seg+" segundos");
            break;
            case 2:
                    double m;
                    double km;
                    System.out.println("introduce las horas");
                    km=teclado.nextDouble();
                    m=1000*km;
                    System.out.println(km+" kilometros son: "+m+" metros");
            break;
            case 3:
                    double kmh;
                    double ms;
                    System.out.println("introduce las horas");
                    kmh=teclado.nextDouble();
                    ms=kmh/3.6;
                    System.out.println(kmh+" kilometros por hora son: "+ms+" metros por segundo");
        }
        }while(menu != 4);
    }
    
}
