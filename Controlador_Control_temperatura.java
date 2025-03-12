public class Controlador {
    private modelo model;
    private vista view;

  public  controlador(modelo model, vista, view){
   this modelo = model
   this vista = view 
  }
  public void ejecutartemperatura(number){
      String resutado = model.getTemperatura(number);
    view.displayTemperatura(resultado);
}
