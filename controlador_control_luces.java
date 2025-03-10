public class LightController {
    private LightModel model;
    private LightView view;

    public LightController(LightModel model, LightView view) {
        this.model = model;
        this.view = view;
    }

    public void updateLightState(boolean motionDetected) {
        model.setLightState(motionDetected); // Cambia el estado de las luces según el sensor
        view.displayLightState(model.isLightOn()); // Actualiza la vista
    }
}
    import java.util.Scanner;

public class MotionLightApp {
    public static void main(String[] args) {
        LightModel model = new LightModel();
        LightView view = new LightView();
        LightController controller = new LightController(model, view);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Simulación de sensor de movimiento. Ingresa '1' si hay movimiento, '0' si no lo hay (Ctrl+C para salir):");
        while (true) {
            int motion = scanner.nextInt();
            boolean motionDetected = motion == 1;
            controller.updateLightState(motionDetected);
        }
    }
 }

