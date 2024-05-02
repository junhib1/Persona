class Persona{
    private String nombre, apellido;
    private int edad;
    private double altura;
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
    }
    Persona(){}
    Persona(String nom, String ap, int ed, double alt){ //Metodo constructor  con atributos pasados por parametro
        System.out.println("titulo: " +nom+" autor: " +ap+ "isbn " +ed+ "numpag " +alt);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad>0) {
           this.edad = edad; 
        } else {
            System.out.println("edad invalida");
        }
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        if (altura>0) {
            this.altura = altura;  
        } else {
            System.out.println("altura invalidad");
        }
    }
}