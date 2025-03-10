import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class MotionSensorView extends VBox {
    private Label statusLabel;

    public MotionSensorView() {
        statusLabel = new Label("Estado: Sin detección de movimiento");
        this.getChildren().add(statusLabel);
    }

    public void updateStatus(boolean motionDetected) {
        if (motionDetected) {
            statusLabel.setText("Estado: ¡Movimiento detectado!");
        } else {
            statusLabel.setText("Estado: Sin detección de movimiento");
        }
    }
}
