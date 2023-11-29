package View;

import Data.Numb;

public class View {
    public void printA(double a){
        System.out.println("Введите первое число: ");
    }
    public void printB(double b){
        System.out.println("Введите второе число: ");
    }
    public void printOp(String op){
        System.out.println("Введите операцию: ");
    }
    public void printResult(double res){
        System.out.printf("Результат операции: %.2f", res);
    }

}
