/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */


 package com.pmr.eva3;
 import java.util.Arrays;
 import java.util.Scanner;
 import java.util.concurrent.ThreadLocalRandom;
 import java.util.*;
 /**
  *
  * @author pmr
  */
 public class EVA3 {
 
     /**
      * @param args
      */
          public static void main(String[] args) {
            Scanner keyboard = new Scanner(System.in);
            
             System.out.println("Ingrese Genero: /n 1=Hombre /n 2= Mujer /n 3= Otro");
             System.out.println("Tiene Trabajo?: /n 1=Si  /n 2= No /n ");
             System.out.println("cuanto gana?: min:250 max ");
 
          }// cierre void
 
          /**
         * @return
         */
        public static int[][] datos(){
             int [][] datos = new int [10][3];
             int valor = (int) (Math.random() * 2500);
             int R1 = (int)(Math.random()* 3);
             int R2 = (int)(Math.random()*3+1);
             
             for(int i=0 ; i < datos.length ; i++ ){
                for(int j=0 ; j < datos.length ; j++ ){
                 datos[i][1] = R1;
                 datos[i][2] = R2;
                 datos[i][3] = valor;
                }
                SumaC1
             }
          }
 }//cierre class EVA3
 