import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControladorAcceso {
    private Usuario usuario;
    private VistaAcceso vista;

    public ControladorAcceso(Usuario usuario, VistaAcceso vista) {
        this.usuario = usuario;
        this.vista = vista;

        this.vista.getLoginButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                autenticar();
            }
        });
    }

    private void autenticar() {
        String inputUsername = vista.getUsername();
        String inputPassword = String.valueOf(vista.getPassword());

        if (inputUsername.equals(usuario.getUsername()) && inputPassword.equals(usuario.getPassword())) {
            JOptionPane.showMessageDialog(null, "Acceso concedido");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
        }
    }

    public static void main(String[] args) {
        Usuario usuario = new Usuario("admin", "1234");
        VistaAcceso vista = new VistaAcceso();
        new ControladorAcceso(usuario, vista);
    }
}
public class ControlDeAcceso {
    public static void main(String[] args) {
        Tienda tienda = new Tienda(LocalTime.of(9, 0), LocalTime.of(18, 0));
        
        Usuario cliente = new Usuario(true, false);
        Usuario empleado = new Usuario(false, true);

        System.out.println("Permitir acceso al cliente: " + tienda.permitirAcceso(cliente));
        System.out.println("Permitir acceso al empleado: " + tienda.permitirAcceso(empleado));
    }
}
