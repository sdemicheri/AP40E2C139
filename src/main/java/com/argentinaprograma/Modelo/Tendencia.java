/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.Modelo;

/**
 *
 * @author Usuario
 */
public class Tendencia implements Popularidad{

    @Override
    public String getIcono() {
        return "fuego";
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return cancion.getTitulo()+"-"+cancion.getArtista()+"("+cancion.getAlbum()+")";
    }

    @Override
    public void cambiarEstado(Cancion cancion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}