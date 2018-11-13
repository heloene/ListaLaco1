/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab01_215
 */
public class Gremio {
    public static void main(String[] args) {
        int voto=0, contA=0,contB=0;
        while (voto!= 3) {
            voto=Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para votar na Chapa A"+"\nDigite 2 para votar na ChapaB \n Digite 3 para terminar a votação"));
            if (voto==1){
                contA=contA+1;
                
            }
            
            
            else if (voto==2) {
                contB=contB+1;
            }
            else if(voto==3){
            
            
            }
            else{
            
            JOptionPane.showMessageDialog(null, "Por favor digite apenas 1 ou 2");
            }
            
        }
        
        
        if ((contA>contB)) {
            JOptionPane.showMessageDialog(null, "A ChapaA ganhou com:"+Integer.toString(contA)+ " votos.");
        }
    
        
        else if ((contB>contA)) {
          JOptionPane.showMessageDialog(null, "A ChapaB ganhou com:"+Integer.toString(contB)+" votos.");
        }
        else{
                  
                  JOptionPane.showMessageDialog(null, "A ChapaB e a ChapaA empataram com:"+Integer.toString(contB)+" votos.");
                  
                  }
          
     
          
}
        
    
    }
    
    
