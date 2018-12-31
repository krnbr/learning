package in.nu.learn.patterns.creational.builder;

public class Computer {

    private int hdd;
    private int ram;
    private Brands brand;
    private ComputerTypes computerType;
    private OSTypes osType;

    private Computer(ComputerBuilder builder){
        this.brand = builder.brand;
        this.computerType = builder.computerType;
        this.hdd = builder.hdd;
        this.osType = builder.osType;
        this.ram = builder.ram;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd=" + hdd +
                ", ram=" + ram +
                ", brand=" + brand +
                ", computerType=" + computerType +
                ", osType=" + osType +
                '}';
    }

    public static class ComputerBuilder {

        private int hdd = 1024;
        private int ram = 8;
        private Brands brand = Brands.DELL;
        private ComputerTypes computerType = ComputerTypes.DESKTOP;
        private OSTypes osType;

        private void setOsType(OSTypes osType){
            this.osType = osType;
            if(osType == OSTypes.OSX){
                this.brand = Brands.APPLE;
            }
        }

        public ComputerBuilder(OSTypes osType){
            this.setOsType(osType);
        }

        public Computer build(){
            return new Computer(this);
        }

        public ComputerBuilder setHdd(int hdd){
            this.hdd = hdd;
            return this;
        }

        public ComputerBuilder setRam(int ram){
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setComputerType(ComputerTypes computerType){
            this.computerType = computerType;
            return this;
        }

        public ComputerBuilder setBrand(Brands brand){
            this.brand = brand;
            if(brand == Brands.APPLE){
                this.osType = OSTypes.OSX;
            }
            return this;
        }

    }

}
