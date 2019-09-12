/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author Lenovo
 */
public class Array2 {
    public static void main(String[] args) {
        int nilai [][]=new int [2][3]; 
         nilai [0][0]=60;
         nilai [0][1]=93;
         nilai [0][2]=74; 
         nilai [1][0]=87;
          nilai [1][1]=62;   
          nilai [1][2]=75; 
         
          String MP [] = {"RPL","TKJ"};
          double ratarataMP[]= new double[nilai.length]; 
          for (int i=0; i<nilai.length; i++){
              for (int j=0; j<nilai[0].length; j++){ 
                   ratarataMP[i]+=nilai [i][j]; 
              }
               ratarataMP[i]/=nilai[0].length;
          }
          System.out.println("Nilai mata pelajaran/n");
          System.out.println("MK\tMinggu1\tMinggu2\tMinggu3\tRataRata");
          for (int i=0; i<nilai.length; i++){  
            System.out.print(MP [i]+"\t");
            for (int j =0;j<nilai[0].length; j++) {
             }
            System.out.print(ratarataMP[i] + "\n");
    }
    }
}
