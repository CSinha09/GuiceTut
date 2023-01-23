package org.example;

import GuiceModule.AppModule;
import RequestSquare.SquareRequest;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {

    private static final String req = "SQUARE";

    private static void fullfil(String req){
        if(req == "SQUARE"){
//            DrawShape d = new DrawSquare();
            Injector injector = Guice.createInjector(new AppModule());
//            DrawShape d = injector.getInstance(DrawShape.class);
//            SquareRequest r = new SquareRequest(d);
            SquareRequest r = injector.getInstance(SquareRequest.class);
            r.makeRequest();
            SquareRequest r1 = injector.getInstance(SquareRequest.class);
            r.makeRequest();
            if(r.getSquare() == r1.getSquare()) System.out.println("Same");
            else System.out.println("Not Same");
        }
    }
    public static void main(String[] args) {
        fullfil(req);
    }
}