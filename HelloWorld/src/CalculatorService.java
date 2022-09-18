public class CalculatorService {


    int result;


    public void calculate(int firstNum, String symbol, int secondNum) {

        switch (symbol) {
            case "+" -> result = firstNum + secondNum;
            case "-" -> result = firstNum - secondNum;
        }

    }
}