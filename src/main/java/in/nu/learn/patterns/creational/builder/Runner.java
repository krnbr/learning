package in.nu.learn.patterns.creational.builder;

public class Runner {

    public static void main(String[] args) {
        Computer apple_computer_laptop = new Computer.ComputerBuilder(OSTypes.OSX)
                .setComputerType(ComputerTypes.LAPTOP)
                .setHdd(1024)
                .setRam(16)
                .build();

        Computer apple_computer_desktop = new Computer.ComputerBuilder(OSTypes.OSX)
                .setComputerType(ComputerTypes.DESKTOP)
                .setHdd(1024)
                .setRam(32)
                .build();

        Computer default_computer_desktop_osx = new Computer.ComputerBuilder(OSTypes.OSX)
                .setComputerType(ComputerTypes.DESKTOP)
                .build();

        Computer default_computer_desktop_windows = new Computer.ComputerBuilder(OSTypes.WINDOWS)
                .setComputerType(ComputerTypes.DESKTOP)
                .build();

        System.out.println(apple_computer_laptop);
        System.out.println(apple_computer_desktop);
        System.out.println(default_computer_desktop_osx);
        System.out.println(default_computer_desktop_windows);
    }

}
