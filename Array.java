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
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai [] = new int[6];
        nilai [0] = 65;
        nilai [1] = 80;
        nilai [2] = 74;
        nilai [3] = 84;
        nilai [4] = 100;
        nilai [5] = 97;
       double ratarata = 0.0;
     for (int i=0; i<nilai.length; i++)ratarata+=nilai [i];
    ratarata/=nilai.length;
     System.out.println("nilai rata-rata = "+ ratarata);
                    
     
    }
}
    
        


