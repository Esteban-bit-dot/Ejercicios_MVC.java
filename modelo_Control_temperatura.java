public  class  modelo {
  private  String  temperatura;
  private String Sensor;
  
  public void Control(String datoTemperatura, String datoSensor){
    this.temperatura = datoTemperatura;
    this.Sensor = datoSensor;
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
