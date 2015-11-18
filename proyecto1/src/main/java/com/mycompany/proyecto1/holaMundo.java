/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

/**
 *
 * @author formacion
 */
public class holaMundo {
    public static void main (String[] args){
        Fichero f = new Fichero("nombre.txt");
        f.escribirFichero();
        f.leerFichero();
        
    }
}
