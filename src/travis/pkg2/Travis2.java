/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travis.pkg2;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Travis2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int a;
	      Operaciones s=new Operaciones();
	        a = Integer.parseInt(JOptionPane.showInputDialog("Elija Opcion "
	                + " \n 1.Sumar"
	                + " \n 2.restar"
	                + " \n 3.multiplicar"
	                +"  \n4.Dividir"));
	        switch(a){
	            case 1:
	               JOptionPane.showMessageDialog(null, s.sumar(3,3));
	            break;
	            case 2:
	                JOptionPane.showMessageDialog(null, s.restar(3,3));
	            break;
	            case 3:
	                JOptionPane.showMessageDialog(null, s.multiplicar(3,3));
	            break;
	            case 4:
	                JOptionPane.showMessageDialog(null, s.dividir(3,3));
	            break;
	        
	        }
    }
    
}
