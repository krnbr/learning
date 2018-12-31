package in.nu.learn.patterns.creational.abstractfactory;

public class Laptop extends Computer {

    private ComputerTypes computerType = ComputerTypes.LAPTOP;
    private Brands brand = Brands.HP;
    private int hdd;
    private int ram;
    private OSTypes osType = OSTypes.WINDOWS;

    public Laptop(int hdd, int ram, OSTypes osType) {
        this.hdd = hdd;
        this.ram = ram;
        this.osType = osType;
        if(this.osType == OSTypes.OSX){
            this.brand = Brands.APPLE;
        }
    }

    @Override
    public Brands getBrand() {
        return this.brand;
    }

    @Override
    public int getHDD() {
        return this.hdd;
    }

    @Override
    public int getRAM() {
        return this.ram;
    }

    @Override
    public OSTypes getOsType() {
        return this.osType;
    }

    @Override
    public ComputerTypes getComputerType() {
        return this.computerType;
    }

}