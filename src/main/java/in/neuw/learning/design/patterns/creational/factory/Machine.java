package in.neuw.learning.design.patterns.creational.factory;

/**
 * Created by Karanbir Singh on 11/25/2018.
 **/
public interface Machine {

    Machine setRAM(int ram);
    Machine setHDD(int disk);
    Machine setBrand(String brand);
    Machine setOS(OSTypes osType);

}
