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
public class Tabuada {
    public static void main(String[] args) {
        int cont=0, nmr1=0, nmr2=0, divisão=0, resultado;
        nmr1=Integer.parseInt(JOptionPane.showInputDialog("Digete o número:"));
        while (cont<=10) {
        
        
             
        resultado=nmr1*cont;
        JOptionPane.showMessageDialog(null,nmr1+" x "+cont+" = "+resultado);
        cont=cont+1;
      }   
    }
        
 }
