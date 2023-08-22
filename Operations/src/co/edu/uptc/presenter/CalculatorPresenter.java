package co.edu.uptc.presenter;

import co.edu.uptc.model.ExpressionEvaluator;
import co.edu.uptc.view.CalculatorView;
import co.edu.uptc.view.ConsoleCalculatorView;

public class CalculatorPresenter {

    private final CalculatorView view;

    public CalculatorPresenter(CalculatorView view) {
        this.view = view;
    }

    public void start() {
        String expression = view.getInput();
        try {
            double result = ExpressionEvaluator.evaluateExpression(expression);
            view.displayResult(Double.toString(result));
        } catch (Exception e) {
            view.displayError("Error evaluating expression.");
        }
    }

    public static void main(String[] args) {
        CalculatorPresenter presenter = new CalculatorPresenter(new ConsoleCalculatorView());
        presenter.start();
    }
}
