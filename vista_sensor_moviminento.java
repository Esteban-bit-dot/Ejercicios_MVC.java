import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import java.util.Arraylist;

public class MotionSensorView extends VBox {
    private Label statusLabel;
   private List<movimientos> movimientos;


    public MotionSensorView() {
        statusLabel = new Label("Estado: Sin detección de movimiento");
        this.getChildren().add(statusLabel);
        movimientos = new ArrayList<>();
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
