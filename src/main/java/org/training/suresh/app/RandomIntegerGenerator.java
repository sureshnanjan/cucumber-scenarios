package org.training.suresh.app;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomIntegerGenerator {
    private Random _factory;
    private long _seed;
    private IntStream _generated_values;

    public RandomIntegerGenerator() {
        this._factory = new Random();
    }
    public RandomIntegerGenerator(long _seed) {
        this._seed = _seed;
        this._factory = new Random(this._seed);
    }
    //IntStream	ints(long streamSize)
    //IntStream	ints(long streamSize, int randomNumberOrigin, int randomNumberBound)

    //Returns an Integer Array of the given size pseudorandom int values
    public int[] generateNumbers(int size){
        return this._factory.ints(size).toArray();
    }
    //Returns an Integer Array of the given size pseudorandom int values,
    // each conforming to the given origin (inclusive) and bound (exclusive).
    public int[] generateNumbers(int size, int randomNumberOrigin, int randomNumberBound){
        return this._factory.ints(size,randomNumberOrigin,randomNumberBound).toArray();
    }
    // Returns the next pseudorandom integer value
    public int getSingleValue(){
        return this._factory.nextInt();
    }

    public static void main(String[] args){
        RandomIntegerGenerator gen = new RandomIntegerGenerator();
        System.out.println(gen.getSingleValue());
        Arrays.stream(gen.generateNumbers(10,100,200)).forEach(System.out::println);

    }
}
