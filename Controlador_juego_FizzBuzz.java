import java.util.Arraylist
public class FizzBuzzController {
    private List<Numero> numeros;
    private FizzBuzzModel model;
    private FizzBuzzView view;

    public FizzBuzzController(FizzBuzzModel model, FizzBuzzView view) {
        this.model = model;
        this.view = view;
    }

    public void executeFizzBuzz(int number) {
        String result = model.getFizzBuzzValue(number);
        Numeros = new ArrayList<>();
        view.displayFizzBuzz(result);
    }
}
