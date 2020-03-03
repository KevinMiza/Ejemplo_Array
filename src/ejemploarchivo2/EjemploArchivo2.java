/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarchivo2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JFileChooser;

/**
 *
 * @author KEVIN MIZA
 */
public class EjemploArchivo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Escribir un archivo
        JFileChooser jf = new JFileChooser();
        jf.showOpenDialog(jf);
        FileWriter fw;
        PrintWriter pw;
        
        
        try {
            //aperturarlo
            fw = new FileWriter ("C:\\Users\\KEVIN MIZA\\Documents\\ExamenGit\\EjemploArrayList\\src\\ejemploarraylist\\nuevo.txt");
            //Escribir en ello
            pw = new PrintWriter (fw);
            //Texto escrito
            pw.println("Hola Como estas");
            

            //cerrar el archivo
            fw.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        File archivo;
        FileReader fr;
        BufferedReader br;
        try {

        archivo = new File("C:\\Users\\KEVIN MIZA\\Documents\\ExamenGit\\EjemploArrayList\\src\\ejemploarraylist\\nuevo.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);

        String texto ="";            
        while((texto = br.readLine())!=null){

            System.out.println(texto);
        }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
