package in.neuw.learning.java8.lambda;

/**
 * Created by Karanbir Singh on 11/23/2018.
 **/
public class RunnerExampleOne {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private void getMessage(){
        InterfaceOne i = (s)-> s+" "+this.getName();
        System.out.println(i.test("Hi"));
        System.out.println(i.test("Hello"));
    }

    public static void main(String[] args) {

        RunnerExampleOne runnerExampleOne = new RunnerExampleOne();
        runnerExampleOne.setName("Karan");
        runnerExampleOne.getMessage();

        runnerExampleOne.setName("Karanbir");
        runnerExampleOne.getMessage();

    }

}

interface InterfaceOne{

    String test(String s);

}
