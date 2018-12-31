package in.nu.learn.patterns.creational.abstractfactory;

public class LaptopFactory implements ComputerAbstractFactory {

    private int ram;
    private int hdd;
    private OSTypes osType = OSTypes.WINDOWS;

    public LaptopFactory(int ram, int hdd, OSTypes osType){
        this.ram=ram;
        this.hdd=hdd;
        this.osType=osType;
    }

    @Override
    public Computer setupComputer() {
        return new Laptop(this.hdd, this.ram, this.osType);
    }
}
