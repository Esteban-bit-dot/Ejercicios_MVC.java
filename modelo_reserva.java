import java.util.Arraylist;
public class Usuario {
    private String nombre;
    private String email;
    private int contraseña;
    private List<datos> datos;
    public Usuario(String nombre, String email, int contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
        datos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public int getcontraseña(){
        return contraseña
    }
}

// Clase Asiento
public class Asiento {
    private int numero;
    private boolean reservado;

    public Asiento(int numero) {
        this.numero = numero;
        this.reservado = false;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isReservado() {
        return reservado;
    }

    public void reservar() {
        this.reservado = true;
    }
}
