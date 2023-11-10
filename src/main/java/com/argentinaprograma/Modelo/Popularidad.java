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
public interface Popularidad {
    public abstract String getIcono();
    public abstract String getLeyenda(Cancion cancion);
    public abstract void cambiarEstado(Cancion cancion);
}
