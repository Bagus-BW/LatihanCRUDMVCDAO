/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.bagusbudiwibowo.latihanmvcjdbc.view;

import edu.bagusbudiwibowo.latihanmvcjdbc.error.PelangganException;
import java.sql.SQLException;

/**
 *
 * @author Bagus_24
 * NIM          : 10119064 
 * NAMA         : Bagus Budi Wibowo
 * KELAS        : PBOIF2 
 */
public class MainViewPelanggan extends javax.swing.JFrame {

    /**
     * Creates new form MainPelangganView
     */
    public MainViewPelanggan() {
        initComponents();
    }

    public void loadDatabase() throws SQLException, PelangganException {
        pelangganView1.loadDatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pelangganView1 = new edu.bagusbudiwibowo.latihanmvcjdbc.view.pelangganView();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().add(pelangganView1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
        * @param args the command line arguments
        */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private edu.bagusbudiwibowo.latihanmvcjdbc.view.pelangganView pelangganView1;
    // End of variables declaration//GEN-END:variables
}