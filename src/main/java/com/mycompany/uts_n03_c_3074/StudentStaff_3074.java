/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_n03_c_3074;

/**
 *
 * @author LENOVO YOGA
 */
public class StudentStaff_3074 extends Mahasiswa_3074 implements iPendapatan_3074{

    String unitKerja_3074;
    int jamKerja_3074;
   
    @Override
    public double totalPendapatan_3074() {
        return (int) jamKerja_3074 * 30000;
    }
    void tampilDataMhs_3074(){
        System.out.println("NIM                    : "+nim_3074);
        System.out.println("Nama                   : "+nama_3074);
        System.out.println("Jurusan                : "+jurusan_3074);
        System.out.println("IPK                    : "+ipk_3074);
        System.out.println("Unit Kerja             : "+unitKerja_3074);
        System.out.println("Jam Kerja              : "+jamKerja_3074);
        System.out.println("---------------------------------");
        System.out.println("Total Pendapatan       : Rp "+totalPendapatan_3074());
    }
}
