/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.proyecto1;

import java.io.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author formacion
 */
public class GetWebContent {
    private final String cadena;
    URL url;

    /**
     *
     * @param c
     * @throws MalformedURLException
     */
    public GetWebContent(String c){
        cadena = c;
        try {
            url = new URL(cadena);
        } catch (MalformedURLException ex) {
            Logger.getLogger(GetWebContent.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     *
     * @return
     * @throws IOException
     */
    public String leerWeb() throws IOException{
        String resultado = "--ERROR--";
        try{
            URLConnection urlConnection = url.openConnection();
            InputStream is = urlConnection.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            
            int numCaracteres;
	    char[] charArray = new char[1024];
            StringBuilder sb = new StringBuilder();
            while ((numCaracteres = isr.read(charArray)) > 0) {
            	sb.append(charArray, 0, numCaracteres);
            }
            resultado = sb.toString();
            
        }
        catch (MalformedURLException e){
        }
        catch (IOException e){
        }
        
        return resultado;
    }
}
