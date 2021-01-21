/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bagusbudiwibowo.latihanmvcjdbc.event;

import edu.bagusbudiwibowo.latihanmvcjdbc.entity.Pelanggan;
import edu.bagusbudiwibowo.latihanmvcjdbc.model.PelangganModel;

/**
 *
 * @author Bagus_24
 * NIM          : 10119064 
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 */
public interface PelangganListener {
    
    public void onChange(PelangganModel model);
    
    public void onInsert(Pelanggan pelanggan);
    
    public void onDelete();
    
    public void onUpdate(Pelanggan pelanggan);
    
    
}
