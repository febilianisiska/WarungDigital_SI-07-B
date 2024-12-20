/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kelas;

import java.util.Date;
import java.util.List;

/**
 *
 * @author SISKA FEBILIANI-2311103072-07-B
 */
public class Transaksi {
    private String idTransaksi;
    private User user;
    private List<Produk> listProduk;
    private double totalHarga;
    private Date waktuPembelian;

    public Transaksi(String idTransaksi, User user) {
        this.idTransaksi = idTransaksi;
        this.user = user;
    }
    
    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
    }
}
