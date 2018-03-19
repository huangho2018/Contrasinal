/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrasinal;

import javax.swing.JOptionPane;
/**
 *
 * @author huangho
 */
public class Main {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // tamaño do vector e lonxitude
        String texto = JOptionPane.showInputDialog("Introduce o tamaño do vector");
        int tam = Integer.parseInt(texto);
        
        texto = JOptionPane.showInputDialog("Introduce a lonxitude do contrasinal");
        int lonxitude = Integer.parseInt(texto);
        
        //Creamos obxecto
        Contrasinal lstContrasinal[] = new Contrasinal[tam];
        
        for (int i=0;i < lstContrasinal.length;i++){
            lstContrasinal[i] = new Contrasinal(lonxitude);
            System.out.println(lstContrasinal[i].getContrasinal());
        }
    }
    
}
