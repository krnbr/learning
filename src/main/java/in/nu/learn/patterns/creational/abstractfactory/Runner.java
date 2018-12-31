package in.nu.learn.patterns.creational.abstractfactory;

public class Runner {

    public static void main(String[] args) {

        ComputerAbstractFactory defaultLaptopFactory = new LaptopFactory(8, 1024, OSTypes.WINDOWS);
        ComputerAbstractFactory osXLaptopFactory = new LaptopFactory(8, 1024, OSTypes.OSX);
        ComputerAbstractFactory defaultDesktopFactory = new DesktopFactory(8, 1024, OSTypes.WINDOWS);
        ComputerAbstractFactory osXDesktopFactory = new DesktopFactory(8, 512, OSTypes.OSX);

        System.out.println(ComputerFactory.getComputer(defaultLaptopFactory));
        System.out.println(ComputerFactory.getComputer(osXLaptopFactory));
        System.out.println(ComputerFactory.getComputer(defaultDesktopFactory));
        System.out.println(ComputerFactory.getComputer(osXDesktopFactory));

    }

}
