/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bagusbudiwibowo.latihanmvcjdbc.controller;

import edu.bagusbudiwibowo.latihanmvcjdbc.model.PelangganModel;
import edu.bagusbudiwibowo.latihanmvcjdbc.view.pelangganView;
import javax.swing.JOptionPane;

/**
 *
 * @author Bagus_24
 * NIM          : 10119064 
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 */
public class PelangganController {
    
    private PelangganModel model;

    public void setModel(PelangganModel model) {
        this.model = model;
    }
    
    public void resetPelanggan(pelangganView view){
        model.resetPelanggan();
    }
    
    public void insertPelanggan(pelangganView view){
        
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();
        
        if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        }else if(nama.trim().length()>255){
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 255 karakter");
        }else if(telepon.trim().length()>12){
            JOptionPane.showMessageDialog(view, "Nomor Telepon tidak boleh lebih dari 12 digit");
        }else if(!email.contains("@")||!email.contains(".")){
            JOptionPane.showMessageDialog(view, "Email tidak valid");
        }else{
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);
            
            try {
                model.insertPelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan berhasil ditambahkan");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
        
    }
    
    public void updatePelanggan(pelangganView view){
        
        if(view.getTablePelanggan().getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan diubah");
            return;
        }
        
        Integer id = Integer.parseInt(view.getTxtId().getText());
        
        String nama = view.getTxtNama().getText();
        String alamat = view.getTxtAlamat().getText();
        String telepon = view.getTxtTelepon().getText();
        String email = view.getTxtEmail().getText();
        
        if(nama.trim().length()>255){
            JOptionPane.showMessageDialog(view, "Nama tidak boleh kosong");
        }else if(nama.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nama tidak boleh lebih dari 255 karakter");
        }else if(telepon.trim().equals("")){
            JOptionPane.showMessageDialog(view, "Nomor Telepon tidak boleh lebih dari 12 digit");
        }else if(!email.contains("@")||!email.contains(".")){
            JOptionPane.showMessageDialog(view, "Email tidak valid");
        }else{
            model.setId(id);
            model.setNama(nama);
            model.setAlamat(alamat);
            model.setTelepon(telepon);
            model.setEmail(email);
            
            try {
                model.updatePelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan berhasil Di Ubah");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
    
    public void deletePelanggan(pelangganView view){
        
        if(view.getTablePelanggan().getSelectedRowCount()==0){
            JOptionPane.showMessageDialog(view, "Silahkan seleksi baris data yang akan dihapus");
            return;
        } 
       
        if(JOptionPane.showConfirmDialog(view, "Anda yakin akan menghapus?")==JOptionPane.OK_OPTION){
            Integer id = Integer.parseInt(view.getTxtId().getText());
            model.setId(id);
            
            try {
                model.deletePelanggan();
                JOptionPane.showMessageDialog(view, "Pelanggan berhasil Di Hapus");
                model.resetPelanggan();
            } catch (Throwable throwable) {
                JOptionPane.showMessageDialog(view, new Object[]{"Terjadi Error di database dengan pesan ", throwable.getMessage()});
            }
        }
    }
    
}
