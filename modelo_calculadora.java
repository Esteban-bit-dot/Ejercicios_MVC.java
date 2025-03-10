public class modelo {
    private int num1;
    private int num2 ;
 
    public modelo(){
       //crear los atributos
       this.num1="";
       this.num2="";
       
    }
   public int getnum1() {
        return num1;
    }

    public void setnum1(int num1) {
        this.num1 = num1;
    }

    public int getnum2() {
        return num2;
    }

    public void setnum2(int num2) {
        this.num2 = num2;
    }
  public boolean guardar_datos(int datonum1, int datonum2){
        System.out.print("conectando base de datos...");
        System.out.print(objnum1);
        System.out.print(objnum2);
        boolean datoGuardado = true;
        return datoGuardado;
                
    }
