public class Main {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        persona1.setEdad(24);
        persona1.setNombre("Marcos");
        persona1.setTelefono(994568243);

        System.out.println("Nombre: " + persona1.getNombre() + " Edad: "
                + persona1.getEdad() + " Telefono: " + persona1.getTelefono());
    }
}

class Persona {
    private int edad;
    private String nombre;
    private int telefono;

    //set & get edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return edad;
    }
    //set & get nombre
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return nombre;
    }
    //set & get telefono
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono (){
        return telefono;
    }

}