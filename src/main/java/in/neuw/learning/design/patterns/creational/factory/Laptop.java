package in.neuw.learning.design.patterns.creational.factory;

/**
 * Created by Karanbir Singh on 11/25/2018.
 **/
public class Laptop implements Machine {

    private int ram;
    private int disk;
    private String brand;
    private MachineTypes type = MachineTypes.Laptop;
    private OSTypes osType = OSTypes.WINDOWS;

    /*public Laptop(int ram, int disk, String brand) {
        this.ram = ram;
        this.disk = disk;
        this.brand = brand;
    }*/

    @Override
    public Machine setRAM(int ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public Machine setHDD(int disk) {
        this.disk = disk;
        return this;
    }

    @Override
    public Machine setBrand(String brand) {
        if(brand.equalsIgnoreCase("Apple")){
            this.osType = OSTypes.OSX;
        }
        this.brand = brand;
        return this;
    }

    @Override
    public Machine setOS(OSTypes osType) {
        if (osType == OSTypes.OSX){
            this.setBrand("Apple");
        }
        this.osType = osType;
        return this;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "ram=" + ram +
                ", disk=" + disk +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                ", osType=" + osType +
                '}';
    }
}
