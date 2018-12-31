package in.nu.learn.patterns.creational.factory;

public class ComputerFactory {

    public static Computer getComputer(ComputerTypes computerTypes, OSTypes osType){
        Computer computer;

        switch (computerTypes){
            case LAPTOP:
                computer = new Laptop(1024,8, osType);
                break;
            case DESKTOP:
                computer = new Desktop(1024,8, osType);
                break;
            default:
                computer = new Desktop(1024,8, osType);
                break;
        }

        return computer;
    }

}
