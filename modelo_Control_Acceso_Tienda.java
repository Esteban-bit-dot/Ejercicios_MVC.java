public class Usuario {
    private String username;
    private String password;

    public Usuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }    
   private boolean tieneMembresia;
    private boolean esEmpleado;

    public Usuario(boolean tieneMembresia, boolean esEmpleado) {
        this.tieneMembresia = tieneMembresia;
        this.esEmpleado = esEmpleado;
    }

    public boolean tieneMembresia() {
       tieneMembresia = objTienwMembresia.nextInt();
        return tieneMembresia;
    }

    public boolean esEmpleado() {
      esEmpleado = objesEmpleado.nextInt();
      return esEmpleado;
    }
}

}
