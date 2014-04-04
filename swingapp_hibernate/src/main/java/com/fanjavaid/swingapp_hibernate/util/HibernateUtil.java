/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fanjavaid.swingapp_hibernate.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author fandiak
 */
public class HibernateUtil {
    private static final SessionFactory SESSION_FACTORY = buildSessionFactoryy();

    private static SessionFactory buildSessionFactoryy() {
        try {
            return new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("initialization failed : " + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return SESSION_FACTORY;
    }
    
    public static void shutDown() {
        getSessionFactory().close();
    }
}
