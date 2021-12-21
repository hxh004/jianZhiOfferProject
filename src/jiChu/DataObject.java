package jiChu;

import java.io.Serializable;

public class DataObject implements Serializable {
    private static int i=0;
    private String word=" ";
    public void setWord(String word){
        this.word=word;
    }
    public void setI(int i){
        DataObject.i = i;
    }


    //test-second-machine
}
