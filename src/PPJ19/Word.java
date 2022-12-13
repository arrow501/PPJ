package PPJ19;

import java.util.Arrays;

public class Word {
    private char[] word;

    public Word(){
        this.word = new char[100];
        Arrays.fill(this.word, (char) 0);
    }
    public void addChar(char letter){
        int index = length();
        if( index < this.word.length)
            this.word[index] = letter;

    }
    public void show(){
        int index = 0;
        while(this.word[index] != (char) 0)
            System.out.print(this.word[index++]);
        System.out.println();
    }
    public int length(){
        int count = 0;
        for (char letter: this.word) {
            if(letter != (char) 0 ) count++;
            else break;
        }
        return count;
    }
}
