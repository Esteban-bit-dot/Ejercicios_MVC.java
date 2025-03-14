public class Controlador {
     private List<Numero> numeros;
    private modelo model;
    private vista view;

  public  controlador(modelo model, vista, view){
   this modelo = model
   this vista = view 
  }
  public void ejecutartemperatura(number){
      String resutado = model.getTemperatura(number);
      Numeros = new ArrayList<>();
     view.displayTemperatura(resultado);
}
