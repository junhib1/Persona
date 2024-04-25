import java.util.Scanner;
public class MainPersona {
    public static void main(String[] args) {
            Persona persona1 = new Persona();
        String a,e;
        int i;
        double o;
        
    
        Scanner op = new Scanner(System.in);
        System.out.print("Ingresa nombre: ");
        a = op.next();
        System.out.print("Ingresa el apellido: ");
        e = op.next();
        System.out.print("Ingresa la edad: ");
        i = op.nextInt();
        System.out.print("Ingresa la altura: ");
        o = op.nextDouble();

        persona1.nombre = a;
        persona1.apellido = e;
        persona1.edad = i;
        persona1.altura = o;

        persona1.MostrarNombreCompleto();
        persona1.MostrarEdad();
        persona1.MostarAltura();


    }
}