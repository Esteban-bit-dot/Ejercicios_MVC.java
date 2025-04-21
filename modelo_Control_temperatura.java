import java.util.Arraylist;
public  class  modelo {
  private  String  temperatura;
  private String Sensor;
  private List<Numeros> numeros;

  
  public void Control(String datoTemperatura, String datoSensor){
    this.temperatura = datoTemperatura;
    this.Sensor = datoSensor;
    numeros = new ArrayList<>();
  }
  public void getTemperatura(){
   return Temperatura; 
  }
  public void setTemperatura(String datoTemperatura){
   this.temperatura = new Temperatura();
  }
  public void getSensor(){
   return Sensor;
  }
  public void setSensor(String datoSensor){
  this.Sensor = new Sensor();
  }
}
