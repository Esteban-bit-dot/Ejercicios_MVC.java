import java.util.Arraylist;
public class LightModel {
    private boolean isLightOn;
    private List<luces> luces;
    
    public boolean isLightOn() {
        luces = new ArrayList<>();
        return isLightOn;
    }

    public void setLightState(boolean state) {
        this.isLightOn = state;
    }
}
