/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fanjavaid.swingapp_hibernate.controller;

import com.fanjavaid.swingapp_hibernate.model.MahasiswaModel;
import com.fanjavaid.swingapp_hibernate.view.FormMahasiswa;
import javax.swing.JOptionPane;

/**
 *
 * @author fandiak
 */
public class MahasiswaController {
    private MahasiswaModel model;

    public void setModel(MahasiswaModel model) {
        this.model = model;
    }
    
    public void insert(FormMahasiswa view) {
        String npm = view.getTxtNpm().getText();
        String namaDepan = view.getTxtNamaDepan().getText();
        String namaBlkg = view.getTxtNamaBlkg().getText();
        String jkel = (String) view.getCmbJkel().getSelectedItem();
        String jurusan = (String) view.getCmbJurusan().getSelectedItem();
        String keterangan = view.getTxtKeterangan().getText();
        
        if (npm.equals("")) {
            JOptionPane.showMessageDialog(null, "NPM tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (namaDepan.equals("")) {
            JOptionPane.showMessageDialog(null, "Nama Depan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jkel.equals("")) {
            JOptionPane.showMessageDialog(null, "Jenis Kelamin tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        } else if (jurusan.equals("")) {
            JOptionPane.showMessageDialog(null, "Jurusan tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            model.setNpm(npm);
            model.setNamaDepan(namaDepan);
            model.setNamaBelakang(namaBlkg);
            model.setGender(jkel);
            model.setJurusan(jurusan);
            model.setKeterangan(keterangan);
            
            model.insert();
        }
        
    }
    
    public void reset() {
        model.reset();
    }
}
