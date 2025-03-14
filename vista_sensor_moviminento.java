import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MotionSensorView extends VBox {
    private Label statusLabel;

    public MotionSensorView() {
        statusLabel = new Label("Estado: Sin detección de movimiento");
        this.getChildren().add(statusLabel);
    }

    public void menu(boolean motionDetected) {
        Menu objMenu = new Menu();
        objSensor movimiento = new movimiento.nextInt();
        sensor();
        while (true){
        if (motionDetected) {
            System.out.println("Estado: ¡Movimiento detectado!");
        } else {
            System.out.println("Estado: Sin detección de movimiento");
        }
    }
}
