package in.nu.learn.patterns.creational.factory;

public class Runner {

    public static void main(String[] args) {
        System.out.println(ComputerFactory.getComputer(ComputerTypes.LAPTOP, OSTypes.WINDOWS));
        System.out.println(ComputerFactory.getComputer(ComputerTypes.DESKTOP, OSTypes.WINDOWS));
        System.out.println(ComputerFactory.getComputer(ComputerTypes.LAPTOP, OSTypes.OSX));
        System.out.println(ComputerFactory.getComputer(ComputerTypes.DESKTOP, OSTypes.OSX));
    }

}
