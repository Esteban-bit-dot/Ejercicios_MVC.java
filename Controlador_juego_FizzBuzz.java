public class FizzBuzzController {
    private FizzBuzzModel model;
    private FizzBuzzView view;

    public FizzBuzzController(FizzBuzzModel model, FizzBuzzView view) {
        this.model = model;
        this.view = view;
    }

    public void executeFizzBuzz(int number) {
        String result = model.getFizzBuzzValue(number);
        view.displayFizzBuzz(result);
    }
}
