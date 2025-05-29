/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaprueba1;

import javax.swing.JOptionPane;

/**
 *
 * @author sebss
 */
public class JavaPrueba1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       String salario = "";
        salario = JOptionPane.showInputDialog(null, "Digite su salario");
        /*Preguntar por el Salario*/

        double salarioNum = Double.parseDouble(salario);

        /* SEM y IVM */
        double IVM = 0.0508;
        double SEM = 0.0925;

        float salarioSEM = (float) (salarioNum * SEM);
        double salarioIVM = salarioNum * IVM;

        int SalarioF = (int) (salarioNum - salarioIVM - salarioSEM);
        int SalarioA = (int) (SalarioF * 0.025);
        
        JOptionPane.showMessageDialog(null, "La empresa debera abonar el monto de "+ SalarioF +" por concepto de SEM y IVM");
        JOptionPane.showMessageDialog(null,"Para la asociacion de la empresa se le asigna un valor de " + SalarioA);
                }

           
    
    
}
