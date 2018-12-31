package in.neuw.learning.design.patterns.creational.factory;

/**
 * Created by Karanbir Singh on 11/25/2018.
 **/
public class Runner {

    public static void main(String[] args) {
        System.out.println(MachineFactory.getMachine(MachineTypes.Laptop));
        System.out.println(MachineFactory.getMachine(MachineTypes.Laptop).setOS(OSTypes.OSX));
        System.out.println(MachineFactory.getMachine(MachineTypes.Laptop).setRAM(32).setHDD(1024).setOS(OSTypes.OSX));
        System.out.println(MachineFactory.getMachine(MachineTypes.Laptop).setRAM(32).setHDD(1024).setBrand("apple"));
        System.out.println(MachineFactory.getMachine(MachineTypes.Desktop));
        System.out.println(MachineFactory.getMachine(MachineTypes.Desktop).setOS(OSTypes.UBUNTU).setRAM(16));
    }

}
