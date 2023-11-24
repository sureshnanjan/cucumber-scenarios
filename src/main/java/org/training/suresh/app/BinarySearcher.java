package org.training.suresh.app;
import java.util.Arrays;
public class BinarySearcher {
    private int[] _input;
    private int _key;
    public BinarySearcher(int[] inputArray, int searchKey) {
        _input = inputArray;
        _key = searchKey;
        Arrays.sort(this._input);
    }

    public int doSearch(){
        int result =  Arrays.binarySearch(this._input,this._key) + 1;
        System.out.println("Key: ["+ this._key + " ] was found at position: [ " +result +" ]" );
        return result;
    }

    public int[] getInputItems(){
        System.out.println("The input elements are " + this._input);
        return this._input;
    }
    public void setInputItems(int[] items){
        this._input = items;
        Arrays.sort(this._input);
    }

    public int getSearchKey(){
        return this._key;
    }

    public void setSearchKey(int key){
        this._key = key;
    }

    public static void main(String[] args){
        BinarySearcher src = new BinarySearcher(new int[]{12,0,13,11},12);
        System.out.println(src.doSearch());

    }

}
