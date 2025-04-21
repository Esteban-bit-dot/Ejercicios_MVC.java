import java.util.Arraylist;
public class Juego_FizzBuzz {
    private List<Numeros> numeros;
    public class FizzBuzz {
    
    public String calcular(int numero) {
        if (numero % 3 == 0 && numero % 5 == 0) {
            return "FizzBuzz";
        } else if (numero % 3 == 0) {
            return "Fizz";
        } else if (numero % 5 == 0) {
            return "Buzz";
        } else {
            return Integer.toString(numero);
        }
    }
}
