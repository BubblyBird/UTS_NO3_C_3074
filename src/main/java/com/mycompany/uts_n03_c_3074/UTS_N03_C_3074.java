/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_n03_c_3074;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author LENOVO YOGA
 */
public class UTS_N03_C_3074 {

    public static void main(String[] args) {
        AsistenPraktikum_3074 A = new AsistenPraktikum_3074();
        StudentStaff_3074 S = new StudentStaff_3074();
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            System.out.println("=== Input Data Asisten Praktikum ===");
            System.out.print("NIM                   : ");
            A.nim_3074=br.readLine();
            System.out.print("Nama                  : ");
            A.nama_3074=br.readLine();
            System.out.print("Jurusan               : ");
            A.jurusan_3074=br.readLine();
            System.out.print("IPK                   : ");
            A.ipk_3074=br.readLine();
            System.out.print("MK Asistensi          : ");
            A.mkAsistensi_3074 = br.readLine();
            System.out.print("Jumlah Pertemuan      : ");
            A.jmlPertemuan_3074=Integer.parseInt(br.readLine());
            
            System.out.println();
            
            System.out.println("=== Input Data Asisten Praktikum ===");
            System.out.print("NIM                   : ");
            S.nim_3074=br.readLine();
            System.out.print("Nama                  : ");
            S.nama_3074=br.readLine();
            System.out.print("Jurusan               : ");
            S.jurusan_3074=br.readLine();
            System.out.print("IPK                   : ");
            S.ipk_3074=br.readLine();
            System.out.print("Unit Kerja            : ");
            S.unitKerja_3074 = br.readLine();
            System.out.print("Jam Kerja             : ");
            S.jamKerja_3074=Integer.parseInt(br.readLine());
            
            System.out.println();
            
            System.out.println("=== Data Asisten Praktikum ===");
            A.tampilDataMhs_3074();
            System.out.println();
            
            System.out.println("=== Data Student Staff ===");
            S.tampilDataMhs_3074();
            
            
        } catch(IOException eox){
            System.out.println(eox);
        }
    }
}
