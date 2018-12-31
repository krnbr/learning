package in.neuw.learning.design.patterns.creational.factory;

/**
 * Created by Karanbir Singh on 11/25/2018.
 **/
public class Desktop implements Machine {

    private int ram;
    private int disk;
    private String brand;
    private MachineTypes type = MachineTypes.Desktop;
    private OSTypes osType = OSTypes.WINDOWS;

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
        this.brand = brand;
        return this;
    }

    @Override
    public Machine setOS(OSTypes osType) {
        return this;
    }

    @Override
    public String toString() {
        return "Desktop{" +
                "ram=" + ram +
                ", disk=" + disk +
                ", brand='" + brand + '\'' +
                ", type=" + type +
                ", osType=" + osType +
                '}';
    }
}