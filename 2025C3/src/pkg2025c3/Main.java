/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2025c3;

import javax.swing.JOptionPane;

/**
 *
 * @author viti
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String resultado = "";
        /*
        for (int i = 0; i < 5; i++) {
            resultado+= "Valor i: "+ i +"\n";
            //resultado= resultado + "Valor i: "+ i +"\n";
        }*/

 /*
        for (int i = 10; i >= 0; i--) {
            resultado+= "Valor i: "+ i +"\n";
        }*/
 /*
        for (int i = 0; i < 5; i=i+2) {
            resultado+= "Valor i: "+ i +"\n";
            //resultado= resultado + "Valor i: "+ i +"\n";
        }*/
        // JOptionPane.showMessageDialog(null, resultado );
        //esto es un ciclo infinito no usar
//        while (true) {            
//            System.out.println("pkg2025c3.Main.main()");
//        }
        /* int i =0;
        while (i <=10) {            
            resultado+= "Valor i: "+ i +"\n";
            i++;
        }
       
        JOptionPane.showMessageDialog(null, resultado );
         */
        String salida = "";/*
        while (salida.compareTo("Si")!=0 ) {   
            salida=JOptionPane.showInputDialog("Vamos salir del ciclo while");
            System.out.println("El resultado del compareTo "+salida.compareTo("Si"));
            System.out.println("El resultado del compareTo "+salida.compareTo("si"));
            System.out.println("El resultado del compareTo "+salida.compareTo("SI"));
        }*/

        boolean finWhile = true;
        while (finWhile) {
            salida = JOptionPane.showInputDialog("Vamos salir del ciclo while");
            if (salida.compareTo("Si") == 0 || salida.compareTo("si") == 0 || salida.compareTo("SI") == 0) {
                finWhile = false;
            }
            System.out.println("El resultado del compareTo " + salida.compareTo("Si"));
            System.out.println("El resultado del compareTo " + salida.compareTo("si"));
            System.out.println("El resultado del compareTo " + salida.compareTo("SI"));
        }

    }

}
