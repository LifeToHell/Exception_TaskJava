package Servise;

import Data.Numb;
import View.View;
import iScanner.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class NumbServise implements Scanner {

    private final View view = new View();
    private List<Numb> numbList;

    public NumbServise() {
        this.numbList = new ArrayList<>();
    }

    public Numb createOperation() {
        iScanner.useLocale(Locale.US);
        double a = 0, b = 0;
        String op = null;

        view.printA(a);
        a = iScanner.nextDouble();


        view.printOp(op);
        op = iScanner.next();


        view.printB(b);
        b = iScanner.nextDouble();


        return new Numb(a, b, op);
    }
}


