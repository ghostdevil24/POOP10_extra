
import excepcionesPropias.MaxDepositoException;
import excepcionesPropias.MaxRetiros;
import excepcionesPropias.SaldoInsuficienteException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author poo01alu31
 */
class Cuenta {
    private double saldo;
    public int contador;
    
    public Cuenta(){
    }
    
    public void retirar(double monto) throws SaldoInsuficienteException, MaxRetiros{
        contador++;
        System.out.println("Retirando ... $"+monto);
        if(contador>3)
            throw new MaxRetiros();
        if(saldo < monto)
            throw new SaldoInsuficienteException();
        else
            this.saldo -= monto;
    }
    
    public void depositar(double monto) throws MaxDepositoException{
        System.out.println("Depositando ... $"+monto);
        if(monto >20_000)
            throw new MaxDepositoException();
        this.saldo += monto;
    }
    
    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + '}';
    }
    
    
    
    
    
    
}
