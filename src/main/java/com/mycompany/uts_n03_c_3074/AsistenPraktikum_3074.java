/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_n03_c_3074;

/**
 *
 * @author LENOVO YOGA
 */
public class AsistenPraktikum_3074 extends Mahasiswa_3074 implements iPendapatan_3074{
    String mkAsistensi_3074;
    int jmlPertemuan_3074;
    
    @Override
    public double totalPendapatan_3074(){        
        return (int) jmlPertemuan_3074 * 50000;
    }
    @Override
    void tampilDataMhs_3074(){
        System.out.println("NIM                 : "+nim_3074);
        System.out.println("Nama                : "+nama_3074);
        System.out.println("Jurusan             : "+jurusan_3074);
        System.out.println("IPK                 : "+ipk_3074);
        System.out.println("MK Asistensi        : "+mkAsistensi_3074);
        System.out.println("Jumlah Pertemuan    : "+jmlPertemuan_3074);
        System.out.println("---------------------------------");
        System.out.println("Total Pendapatan    : Rp "+totalPendapatan_3074());
    }
}
