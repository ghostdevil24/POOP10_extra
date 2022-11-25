/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepcionesPropias;

/**
 *
 * @author poo01alu31
 */
public class MaxDepositoException extends Exception{

    public MaxDepositoException() {
        super("El monto maximo para depositar es de $20,000.0");
    }
    
    
}
