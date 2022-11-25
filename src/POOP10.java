
import excepcionesPropias.MaxDepositoException;
import excepcionesPropias.MaxRetiros;
import excepcionesPropias.SaldoInsuficienteException;

/**
 *
 * @author poo01alu31
 */
public class POOP10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Excepciones no marcadas
        try{
            String mensajes[] = {"Mensajes 1","Mensajes 2","Mensajes 3"};
            System.out.println(mensajes[1]);
            for(int i=0; i<=mensajes.length;i++){
                System.out.println(mensajes[i]);
            }
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Apuntador fuera de los limites");
            e.printStackTrace();
        }
        
        System.out.println("#########Finally########");
        try{
            float x=10/0;
            System.out.println("X= "+x );
        }catch(ArithmeticException e){
            System.out.println("Error, no se puede dividir entre 0");
        }finally{
            System.out.println("Cualquier cosa que suceda entra al finally");
        }
        
        System.out.println("\n#######Catch anidado##########");
        try{
            float x=10/0;
            System.out.println("X= "+x );
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Apuntador fuera de los limites");
            //e.printStackTrace();
        }catch(ArithmeticException e){
            System.out.println("Error, no se puede dividir entre 0");
        }
        
        System.out.println("#############Propagacion de excepciones##############");
        try{
            float division = metodoDivision(4,0);
            System.out.println("Division = "+division);
        }catch(ArithmeticException e){
            System.out.println("Excepcion que sucede en el metodo");
        }
        
        System.out.println("@@@@@@@@@@@@@@Excepciones Marcadas@@@@@@@@@@@@@@@@@");
        try{
            float div = metodoDivisionMarcada(5,0);
        }catch(ArithmeticException e){
            System.out.println("Excepcion de division entre 0 marcada");
        }
        
        System.out.println("##################Creacion de excepciones#############");
        Cuenta cuenta = new Cuenta();
        try{
            cuenta.depositar(20_000);
            System.out.println("Saldo de cuenta: "+"$"+cuenta.getSaldo());
            cuenta.retirar(1_000);
            System.out.println("Saldo de cuenta: "+"$"+cuenta.getSaldo());
            cuenta.retirar(1_000);
            System.out.println("Saldo de cuenta: "+"$"+cuenta.getSaldo());
            cuenta.retirar(1_000);
            System.out.println("Saldo de cuenta: "+"$"+cuenta.getSaldo());
            cuenta.retirar(1_000);
            System.out.println("Saldo de cuenta: "+"$"+cuenta.getSaldo());
        }catch(MaxDepositoException ex){
            System.out.println(ex.getMessage());
        }catch(MaxRetiros ex){
            System.out.println(ex.getMessage());
        }catch(SaldoInsuficienteException ex){
            System.out.println(ex.getMessage());        
        }
    }

    private static float metodoDivision(int a, int b){
        return a/b;
    }

    private static float metodoDivisionMarcada(int a, int b) throws ArithmeticException{
        return a/b;
    }
}
