/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.latihan5.model;

/**
 *
 * @author Idham Rahadian
 */
public class JajarGenjang implements BangunDatar {

    private int luas;
    private int keliling;
    private final int sisiAb = 50;
    private final int sisiBc = 60;
    private final int sisiCd = 70;
    private final int sisiDa = 80;
    private final int alas = 100;
    private final int tinggi = 120;

    @Override
    public void hitungLuas() {
        luas = alas * tinggi;
        System.out.println("Luas Jajar Genjang = " + luas);

    }

    @Override
    public void hitungKeliling() {
        keliling = sisiAb + sisiBc + sisiCd + sisiDa;
        System.out.println("Keliling Jajar Genjang = " + keliling);

    }

}
