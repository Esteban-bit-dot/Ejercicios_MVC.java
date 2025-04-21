import java.util.Arraylist;

public class VistaAcceso {
    private List<usuario> usuario;

    public VistaAcceso() {
        while (continuar) {
            System.out.println("Ingrese el username: ");
            string username = Tomardatos.nextint();
            System.out.println("Ingrese la password: ");
            int password = Tomardatos.nextint();
           usuario = new ArrayList<>();
        }
    }

    public String getUsername() {
        return username.getText();
    }

    public char[] getPassword() {
        return password.getPassword();
    }

}

public class Tienda {
    private LocalTime horaApertura;
    private LocalTime horaCierre;

    public Tienda(LocalTime horaApertura, LocalTime horaCierre) {
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
    }

    public boolean estaAbierta() {
        LocalTime ahora = LocalTime.now();
        return !ahora.isBefore(horaApertura) && !ahora.isAfter(horaCierre);
    }

    public boolean permitirAcceso(Usuario usuario) {
        if (usuario.esEmpleado()) {
            return true;
        } else if (usuario.tieneMembresia() && estaAbierta()) {
            return true;
        } else {
            return false;
        }
    }
}    
