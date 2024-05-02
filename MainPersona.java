import java.util.Scanner;
public class MainPersona {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        
        Scanner op = new Scanner(System.in);
        System.out.print("Ingresa nombre: ");
        persona1.setNombre(op.nextLine());
        System.out.print("Ingresa el apellido: ");
        persona1.setApellido(op.nextLine());
        System.out.print("Ingresa la edad: ");
        persona1.setEdad(op.nextInt());
        System.out.print("Ingresa la altura: ");
        persona1.setAltura(op.nextDouble());

        persona1.getNombre();
        persona1.getApellido();
        persona1.getEdad();
        persona1.getAltura();
        
        System.out.println(persona1.toString());
    }
}