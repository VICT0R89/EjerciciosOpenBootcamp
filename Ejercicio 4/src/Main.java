public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNombre("Ricardo");
        cliente.setEdad(33);
        cliente.settelefono(5498652);
        cliente.setCredito(24500.685);
        System.out.println(
                "Nombre: " + cliente.getNombre() +
                "\nEdad: " + cliente.getEdad() +
                "\nTelefono: " + cliente.getTelefono() +
                "\nCredito: " + cliente.getCredito()
        );

        Trabajador trabajador = new Trabajador();
        trabajador.setNombre("María");
        trabajador.setEdad(23);
        trabajador.settelefono(5424212);
        trabajador.setSalario(34200.65);
        System.out.println(
                "\nNombre: " + trabajador.getNombre() +
                        "\nEdad: " + trabajador.getEdad() +
                        "\nTelefono: " + trabajador.getTelefono() +
                        "\nSalario: " + trabajador.getSalario()
        );

    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;

    public void setEdad (int edad){
        this.edad = edad;
    }
    public int getEdad () {
        return edad;
    }
    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre () {
        return nombre;
    }
    public void settelefono (int telefono){
        this.telefono = telefono;
    }
    public int getTelefono () {
        return telefono;
    }

}

class Cliente extends Persona {
    double credito;

    public void setCredito (double credito){
        this.credito = credito;
    }
    public double getCredito () {
        return credito;
    }
}

class Trabajador extends Persona {
    double salario;

    public void setSalario (double salario){
        this.salario = salario;
    }
    public double getSalario () {
        return salario;
    }
}