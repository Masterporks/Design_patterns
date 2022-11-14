import builder.Weapon;
import builder.WeaponBuilder;
import singleton.CountEnum;
import singleton.Counter;
import singleton.Database;
import singleton.exercises.Computer;
import singleton.exercises.Engine;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /* Class based eager singleton*/

        // Counter counter = Counter.getInstance();

        /*Enum based eager singleton*/
  /*      CountEnum counter = CountEnum.INSTANCE;
        System.out.println(counter.getCount());
        counter.increment();
        counter.increment();
        System.out.println(counter.getCount()); */
  /*  Database database = Database.getInstance();
    database.addNumber(1);
    database.addNumber(2);
    database.addNumber(3);
        System.out.println(Database.getInstance().getNumbers().size());// should return 3
*/
        /*
        Engine engine = new Engine();
        engine.turnEngineOn();
         */
/*
    Engine engine = Engine.getInstance();
    engine.turnEngineOn();
        System.out.println(engine.getEngineState());
*/
 //   Computer computer = ;
        Computer computer = Computer.getInstance();
        System.out.println(computer.getComputerState());

        StringBuilder stringBuilder = new StringBuilder().append("Hello").append(" world");
        System.out.println(stringBuilder);


        Weapon ak47 = new WeaponBuilder()
                .withType("Gun")
                .withName("ak-47")
                .withPerks(new ArrayList<>())
                .withDamage(10)
                .withDurability(10000)
                .build();

        System.out.println(ak47.getDamage());



    }

    //30 mins
    //Exercise : Create an eager singleton class called Engine
    // It should have the boolean field called engine


    // Exercise: Create a lazy double checked singleton called Computer
    // It should have the boolean field called startUp;

}

