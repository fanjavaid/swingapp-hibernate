/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fanjavaid.swingapp_hibernate.service;

import com.fanjavaid.swingapp_hibernate.model.Mahasiswa;
import com.fanjavaid.swingapp_hibernate.util.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author fandiak
 */
public class MahasiswaService {
    public void insert(Mahasiswa mhs) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
        session.save(mhs);
        
        session.getTransaction().commit();        
    }
    
    // Other service...
}
