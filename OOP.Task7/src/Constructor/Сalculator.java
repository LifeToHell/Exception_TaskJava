package Constructor;


import Data.Numb;
import Logger.Logger;
import Servise.NumbServise;
import View.View;


import java.util.logging.Level;




public class Сalculator {

    private final View view = new View();
    private final NumbServise numbServise = new NumbServise();

    public void createCalculator() {
        Numb numb = numbServise.createOperation();
        double a = numb.getA();
        double b = numb.getB();
        String op = numb.getOp();

        switch (op) {
            case "*":
                double c = a * b;
                view.printResult(c);
                Logger.ii.log(Level.INFO, a + op + b + "=" + c);
                Logger.ii.log(Level.WARNING, "logger off");
                break;
            case "/":
                c = a / b;
                view.printResult(c);
                Logger.ii.log(Level.INFO, a + op + b + "=" + c);
                Logger.ii.log(Level.WARNING, "logger off");
                break;
            case "+":
                c = a + b;
                view.printResult(c);
                Logger.ii.log(Level.INFO, a + op + b + "=" + c);
                Logger.ii.log(Level.WARNING, "logger off");
                break;
            case "-":
                c = a - b;
                view.printResult(c);
                Logger.ii.log(Level.INFO, a + op + b + "=" + c);
                Logger.ii.log(Level.WARNING, "logger off");
                break;
            default:
                System.out.println("Данные не верны, попробуйте еще раз");
                Logger.ii.log(Level.INFO, a + op + b + "Данные не верны, попробуйте еще раз");
                Logger.ii.log(Level.WARNING, "logger off");
                break;
        }
    }
}




