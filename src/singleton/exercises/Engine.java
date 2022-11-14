package singleton.exercises;

public class Engine {
    private static Engine Instance = new Engine();

    private boolean isEngineWorking;


    private Engine(){}

    public void turnEngineOn(){
        isEngineWorking = true;
}

public boolean getEngineState(){
        return isEngineWorking;
}

    public static Engine getInstance(){
        return Instance;
    }
}
