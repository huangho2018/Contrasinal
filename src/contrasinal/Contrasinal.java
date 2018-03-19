/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contrasinal;

/**
 *
 * @author huangho
 */
public class Contrasinal {

/**
 * Lonxitude mínima
 */
    private final static int LONXITUDE_MIN=8;
    
    //Os meus Attributes
    private int lonxitude; //Largo do contrasinal
    private String contrasinal; //o contrasinal

    public int getLonxitude() {
        return lonxitude;
    }

    public String getContrasinal() {
        return contrasinal;
    }

    public void setLonxitude(int lonxitude) {
        this.lonxitude = lonxitude;
    }

    public void setContrasinal(String contrasinal) {
        this.contrasinal = contrasinal;
    }
    
    /**
     * Xerar un contrasinal ó chou
     */
    public String creaContrasinal(){
        String contrasinal="";
        
        for (int i=0;i<lonxitude;i++){
            int e = ((int)Math.floor(Math.random()*3+1));
            
            if (e==1){
                char minusc=(char)((int)Math.floor(Math.random()*(123-97)+97));
                contrasinal += minusc;
            }else{
                if (e==2){
                    char mayusc=(char)((int)Math.floor(Math.random()*(91-65)+65));
                    contrasinal += mayusc;
                }else{
                    char numero = (char) ((int)Math.floor(Math.random()*(58-48)+48));
                    contrasinal += numero;
                }
            }
        }
        return contrasinal;
    }
    
    //Constructores
    public Contrasinal(){
        this(LONXITUDE_MIN);
    }
    
    public Contrasinal(int lonxitude){
        this.lonxitude=lonxitude;
        contrasinal=creaContrasinal();
    }
}
