/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
1-Crear una clase Persona con las siguientes variables:
-La edad
-El nombre
-El teléfono
2-Una vez creada la clase, crear una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
3-Crear ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
4-Una vez hecho esto, hacer lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
 */
public class ProgOBJavaEjTema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente clienteUno = new Cliente();
        clienteUno.setNombre("Gabriela Esuncliente");
        clienteUno.setEdad(52);
        clienteUno.setTelefono("0351-445788");
        clienteUno.setCredito(2584152.45);
        System.out.println("Los datos del cliente 001 son: " +  "Nombre: " + clienteUno.getNombre() + "; Edad: " + clienteUno.getEdad() + "; Telefono: " + clienteUno.getTelefono() + "; Credito en $: " + clienteUno.getCredito());
    }
    
}

class Persona {
    private int edad;
    private String nombre;
    private String telefono;

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
}

class Cliente extends Persona {
    private Double credito;

    public Double getCredito() {
        return credito;
    }

    public void setCredito(Double credito) {
        this.credito = credito;
    }
    
}

class Trabajador extends Persona {
    double salario;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
}
