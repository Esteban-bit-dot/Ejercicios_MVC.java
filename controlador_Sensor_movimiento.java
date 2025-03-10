public class MotionSensorController {
    private MotionSensor model;
    private MotionSensorView view;

    public MotionSensorController(MotionSensor model, MotionSensorView view) {
        this.model = model;
        this.view = view;
    }

    public void detectMotion(boolean motionDetected) {
        model.setMotionDetected(motionDetected);
        view.updateStatus(model.isMotionDetected());
    }
}
