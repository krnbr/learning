package in.nu.learn.patterns.creational.abstractfactory;

public class ComputerFactory {

    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.setupComputer();
    }

}
