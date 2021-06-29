import java.util.Scanner;

public class pide_nombre
{
 public static void main(String [] args){
    Scanner add=new Scanner(System.in);
    
    System.out.println("Ingrese un nombre");
    String nombre=add.next();
    
    System.out.println("Ingrese un apellido");
    String apellido=add.next();
    
    System.out.println("Hola mi nombre es: " +nombre);
    System.out.println("Mi apellido es: " +apellido);
    }
}

