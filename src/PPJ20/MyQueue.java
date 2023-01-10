package PPJ20;

import java.util.Arrays;

public class MyQueue {
    private String[] data;
    private int lastItem;
    public MyQueue(int initialSize){
        this.data = new String[initialSize];
        this.lastItem = -1;
    }
    public MyQueue(){
        this(10);
    }
    public void put(String clubName) {
        if(this.lastItem + 1 >= data.length) grow();
        this.lastItem++;
        this.data[this.lastItem] = clubName;
    }
    public String get(){
        // returns first element or null if empty
        if(this.lastItem == -1) return null;
        
        String element = data[0];

        // shift array left by one
        for (int i = 0; i < this.data.length - 1; i++) {
            this.data[i] = this.data[i+1];
        }
        data[lastItem] = null;
        lastItem --;

        return element;
    }
    private void grow(){
        this.data = Arrays.copyOf(this.data, data.length * 2);
    }
}
