package singleton.exercises;

import java.util.ArrayList;
import java.util.List;

public class Computer {

    private static Computer instance;

 private static boolean startUp = false;

 private Computer(){}

    public boolean getComputerState(){
        return startUp;

    }
    public static Computer getInstance(){
     if (instance == null){
         synchronized (Computer.class){
             if(instance == null){
                 instance = new Computer();
             }
         }
     }
     return instance;
    }
}
