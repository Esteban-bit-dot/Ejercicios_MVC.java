public class modelo {
    private String Temperatura;
    private String Humedad ;
 
    public modelo(){
       //crear los atributos
       this.Temperatura="";
       this.Humedad="";
       
    }
   public String getTemperatura() {
        return Temperatura;
    }

    public void setTemperatura(String Temperatura) {
        this.Temperatura = Temperatura;
    }

    public String getHumedad() {
        return Humedad;
    }

    public void setCedulaCliente(String Humedad) {
        this.Humedad = Humedad;
    }
  public boolean guardar_datos(String datotemperatura, String datohumedad){
        System.out.print("conectando base de datos...");
        System.out.print(objtemperatura);
        System.out.print(objhumedad);
        boolean datoGuardado = true;
        return datoGuardado;
                
    }

