class Persona{
    String nombre, apellido;
    int edad;
    double altura;
    Persona(){
        System.out.println("SE ESTA CONSTRUYENDO LA PERSONA");
    }

    public void MostrarNombreCompleto(){
        System.out.println("Hola me llamo " + this.nombre +" " + this.apellido);
    }
        
    public void MostrarEdad(){
        System.out.println("Tengo " + this.edad + " años");
    }

    public void MostarAltura(){
        System.out.println("Y mido " + this.altura);
    }
        
}