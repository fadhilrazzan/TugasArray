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
public class Array5 { 
        double telpon [][] = {{0.89697048302},{0.81216287160},{0.82165319310},{0.81553224622},{0.81555858321},{0.82244681109},{0.81333836654},{0.81359418005},{0.82232175005},{0.82210092669}}; 
        String nama [][] = {{"Bashir"},{"Devon"},{"James"},{"Syihab"},{"Lukas"},{"Reza"},{"Kiki"},{"Satrio"},{"Mika"},{"Ahha"}}; 
        String ig [] [] = {{"lethanaxeger"},{"gregoriusdevon"},{"mr.sleepless.owl"},{"_sh3hub"},{"zefta._"},{"rezaalam_04"},{"yeremiarizky"},{"mhsatrioa"},{"antarozora"},{"l_ahha_"}};
        String asal [] [] = {{"Malang"},{"Malang"},{"Malang"},{"Tuban"},{"Kediri"},{"Malang"},{"Malang"},{"Suhat city"},{"Banyuwangi"},{"Kepanjen"}};
        String hobi [] [] = {{"Memancing"},{"Nolep"},{"Basket"},{"Nolep"},{"Ngopi"},{"Ngopi"},{"Mabar"},{"Mabar"},{"Tidur"},{"Mabar"}};
        public void tampil(String n){ 
            System.out.println("Biodata Teman");
        }
        public void namanis (int n) {
            for (int i = 0; i< 1; i++){ 
                for (int j = 0; j < 1; j++){ 
                      System.out.println(nama[2][j]+","+telpon[2][j]+","+ig[2][j]+","+asal[2][j]+","+hobi[2][j]); 
                }
            }
        }
            public static void main (String[]args){ 
            Array5 siswa = new Array5();
            siswa.tampil(null); 
            siswa.namanis(0);
            }
}


