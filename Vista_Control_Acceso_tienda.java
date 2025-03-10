import javax.swing.*;

public class VistaAcceso {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    public VistaAcceso() {
        frame = new JFrame("Control de Acceso - Tienda");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);
        loginButton = new JButton("Iniciar Sesión");

        JPanel panel = new JPanel();
        panel.add(new JLabel("Usuario:"));
        panel.add(usernameField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(passwordField);
        panel.add(loginButton);

        frame.add(panel);
        frame.setSize(300, 150);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public String getUsername() {
        return usernameField.getText();
    }

    public char[] getPassword() {
        return passwordField.getPassword();
    }

    public JButton getLoginButton() {
        return loginButton;
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
