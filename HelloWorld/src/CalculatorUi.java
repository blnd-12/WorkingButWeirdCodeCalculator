import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorUi {


    public int firstNumber;
    public int secondNumber;
    public String symbol;

    private final Scanner scan = new Scanner(System.in);


    public CalculatorUi() {




            try {
                firstInput();
                firstNumber = scan.nextInt();


                symbol();
                symbol = scan.next();

                secondNumber();
                secondNumber = scan.nextInt();

            } catch (InputMismatchException a) {
                System.out.println("INVALID INPUT");
                return;
            }



            CalculatorService call = new CalculatorService();
            call.calculate(firstNumber, symbol, secondNumber);
            System.out.println(call.result);

        }


    private void firstInput(){
        System.out.print("Enter first number: ");
    }
    private void secondNumber(){
        System.out.print("Enter second number: ");
    }

    private void symbol(){
        System.out.print("Enter operator: ");
    }
}