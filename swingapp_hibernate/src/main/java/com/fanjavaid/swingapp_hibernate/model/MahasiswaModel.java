/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fanjavaid.swingapp_hibernate.model;

import com.fanjavaid.swingapp_hibernate.listener.MahasiswaListener;
import com.fanjavaid.swingapp_hibernate.service.MahasiswaService;

/**
 *
 * @author fandiak
 */

public class MahasiswaModel extends Mahasiswa {
    
    private MahasiswaListener listener;

    @Override
    public void setNpm(String npm) {
        super.setNpm(npm); //To change body of generated methods, choose Tools | Templates.
        fireOnChange();
    }

    @Override
    public void setNamaDepan(String namaDepan) {
        super.setNamaDepan(namaDepan); //To change body of generated methods, choose Tools | Templates.
        fireOnChange();
    }

    @Override
    public void setNamaBelakang(String namaBelakang) {
        super.setNamaBelakang(namaBelakang); //To change body of generated methods, choose Tools | Templates.
        fireOnChange();
    }

    @Override
    public void setGender(String gender) {
        super.setGender(gender); //To change body of generated methods, choose Tools | Templates.
        fireOnChange();
    }

    @Override
    public void setJurusan(String jurusan) {
        super.setJurusan(jurusan); //To change body of generated methods, choose Tools | Templates.
        fireOnChange();
    }

    @Override
    public void setKeterangan(String keterangan) {
        super.setKeterangan(keterangan); //To change body of generated methods, choose Tools | Templates.
        fireOnChange();
    }
    
    
    
    public void setListener(MahasiswaListener listener) {
        this.listener = listener;
    }
    
    public void insert() {
        MahasiswaService service = new MahasiswaService();
        
        Mahasiswa mhs = new Mahasiswa();
        mhs.setNpm(getNpm());
        mhs.setNamaDepan(getNamaDepan());
        mhs.setNamaBelakang(getNamaBelakang());
        mhs.setGender(getGender());
        mhs.setJurusan(getJurusan());
        mhs.setKeterangan(getKeterangan());
        
        service.insert(mhs);
    }
    
    public void reset() {
        setNpm("");
        setNamaDepan("");
        setNamaBelakang("");
        setGender("Pilih");
        setJurusan("Pilih Jurusan");
    }
    
    private void fireOnChange() {
        if (listener != null) {
            listener.onChange(this);
        }
    }
    
}
