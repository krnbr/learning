package in.neuw.learning.design.patterns.creational.factory;

/**
 * Created by Karanbir Singh on 11/25/2018.
 **/
public class MachineFactory {

    private static Machine DEFAULT_LAPTOP = new Laptop().setBrand("Dell").setHDD(1024).setRAM(8).setOS(OSTypes.WINDOWS);

    private static Machine DEFAULT_DESKTOP = new Desktop().setBrand("HP").setHDD(1024).setRAM(8).setOS(OSTypes.WINDOWS);

    public static Machine getMachine(MachineTypes machineTypes, int ram, int disk, OSTypes osType){

        if(machineTypes == MachineTypes.Laptop){
            return DEFAULT_LAPTOP.setHDD(disk).setRAM(ram).setOS(osType);
        }else if(machineTypes == MachineTypes.Desktop){
            return DEFAULT_DESKTOP.setHDD(disk).setRAM(ram).setOS(osType);
        }else {
            return null;
        }

    }

    public static Machine getMachine(MachineTypes machineTypes){

        if(machineTypes == MachineTypes.Laptop){
            return DEFAULT_LAPTOP;
        }else if(machineTypes == MachineTypes.Desktop){
            return DEFAULT_DESKTOP;
        }else {
            return null;
        }

    }

}
