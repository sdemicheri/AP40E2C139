/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.ap20jic139;

import com.argentinaprograma.Modelo.Cancion;
import com.argentinaprograma.Modelo.Normal;


/**
 *
 * @author Usuario
 */
public class Principal {
    
    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setPopularidad(new Normal());
        cancion.cambiarPopularidad();
    }
    
}
