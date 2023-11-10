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
public class Normal implements Popularidad{

    @Override
    public String getIcono() {
        return "MUSICAL NOTE";
    }

    @Override
    public String getLeyenda(Cancion cancion) {
        return cancion.getArtista()+"-"+cancion.getAlbum()+"-"+cancion.getTitulo();
    }

    @Override
    public void cambiarEstado(Cancion cancion) {
        if (cancion.getReproduccion()>1000){
            cancion.setPopularidad(new EnAuge());
        }
    }
    
}
