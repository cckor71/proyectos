/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author formacion
 */
public class holaMundo {

    /**
     *
     */
    public static GetWebContent getweb;
    public static void main(String[] args){
        String url, resultado;
        try {
            url = "www.google.com";
            getweb = new GetWebContent(url);
            resultado = getweb.leerWeb();
            
            System.out.println(resultado);
        } catch (IOException ex) {
            Logger.getLogger(holaMundo.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Fichero f = new Fichero("nombre.txt");
        f.escribirFichero();
        f.leerFichero();
        
    }
}
