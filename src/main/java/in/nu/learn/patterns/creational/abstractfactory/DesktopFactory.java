package in.nu.learn.patterns.creational.abstractfactory;

public class DesktopFactory implements ComputerAbstractFactory {

    private int ram;
    private int hdd;
    private OSTypes osType = OSTypes.WINDOWS;

    public DesktopFactory(int ram, int hdd, OSTypes osType){
        this.ram=ram;
        this.hdd=hdd;
        this.osType=osType;
    }

    @Override
    public Computer setupComputer() {
        return new Desktop(this.hdd, this.ram, this.osType);
    }
}