package in.neuw.learning.design.patterns.creational.singelton;

/**
 * Created by Karanbir Singh on 7/2/2017.
 **/
public class StaticBlockSingleton {

    private static StaticBlockSingleton instance;
    
    private StaticBlockSingleton(){
        System.out.println("The Singleton Class's object/instance initialized");
    }
    
    //static block initialization for exception handling
    static{
        System.out.println("The Singleton Class's static block initialized");
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}