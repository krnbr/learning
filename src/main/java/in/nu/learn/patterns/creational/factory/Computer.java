package in.nu.learn.patterns.creational.factory;

public abstract class Computer {

    public abstract Brands getBrand();
    public abstract int getHDD();
    public abstract int getRAM();
    public abstract OSTypes getOsType();
    public abstract ComputerTypes getComputerType();

    @Override
    public String toString() {
        return "Computer{" +
                "computerType=" + this.getComputerType() +
                ", brand=" + this.getBrand() +
                ", hdd=" + this.getHDD() +
                ", ram=" + this.getRAM() +
                ", osType=" + this.getOsType() +
                '}';
    }

}
