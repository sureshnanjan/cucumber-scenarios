package org.training.suresh.app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleTextScanner {
    private Scanner _factory;
    private String _input;
    private String _delimiter;
    private String _pattern;

    public SimpleTextScanner(String input, String delimiter, String pattern) {
        this._input = input;
        this._delimiter = delimiter;
        this._pattern = pattern;
        initialiseFactory();
    }

    public String get_input() {
        return _input;
    }

    public String get_delimiter() {
        return _delimiter;
    }

    public String get_pattern() {
        return _pattern;
    }


    private void initialiseFactory() {
        try {
            this._factory.close();
        } catch (NullPointerException ex){}
        this._factory = new Scanner(this.get_input()).useDelimiter(this.get_delimiter());
    }

    public void set_input(String _input) {
        this._input = _input;
        initialiseFactory();
    }

    public void set_delimiter(String _delimiter) {
        this._delimiter = _delimiter;
        initialiseFactory();
    }

    public void set_pattern(String _pattern) {
        this._pattern = _pattern;
        initialiseFactory();
    }

    public int getNextInteger() {
        return this._factory.nextInt();
    }

    public Float getNextFloat() {
        if(this._factory.hasNextFloat())
            return this._factory.nextFloat();
        else{
            return Float.NaN;
        }


    }


    public static void main(String[] args){
     String input = "1 2 4.2 blue fish";
     Scanner s = new Scanner(input).useDelimiter("\\s*");

     while (s.hasNext()){
         System.out.println(s.next());
     }
     s.close();

    }
}
