/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.argentinaprograma.Modelo;

import lombok.Data;

/**
 *
 * @author Usuario
 */
@Data
public class Cancion {
    private Popularidad popularidad;
    private int estado;
    private String artista;
    private String album;
    private String titulo;
    private int reproduccion;
    
    public String toString(){
        return popularidad.getIcono()+" "+popularidad.getLeyenda(this);
        /*if(estado==0)
            System.err.println("leyenda 1");
        if(estado==1)
            System.err.println("leyenda 2");
*/
    }

    public void cambiarPopularidad() {
        this.getPopularidad().cambiarEstado(this);
    }

    
}
