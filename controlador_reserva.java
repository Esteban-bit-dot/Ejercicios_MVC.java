import java.util.ArrayList;
import java.util.List;

public class CineControlador {
    private List<Asiento> asientos;

    public CineControlador(int numAsientos) {
        asientos = new ArrayList<>();
        for (int i = 1; i <= numAsientos; i++) {
            asientos.add(new Asiento(i));
        }
    }

    public boolean reservarAsiento(int numeroAsiento, Usuario usuario) {
        if (numeroAsiento > 0 && numeroAsiento <= asientos.size()) {
            Asiento asiento = asientos.get(numeroAsiento - 1);
            if (!asiento.isReservado()) {
                asiento.reservar();
                System.out.println("¡El asiento " + numeroAsiento + " ha sido reservado para " + usuario.getNombre() + "!");
                return true;
            } else {
                System.out.println("El asiento ya está reservado.");
            }
        } else {
            System.out.println("Número de asiento no válido.");
        }
        return false;
    }

    public void mostrarAsientos() {
        for (Asiento asiento : asientos) {
            System.out.println("Asiento " + asiento.getNumero() + ": " + (asiento.isReservado() ? "Reservado" : "Disponible"));
        }
    }
}
