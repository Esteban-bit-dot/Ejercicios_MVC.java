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
