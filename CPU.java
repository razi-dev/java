public class CPU {

    double price;
    
    public CPU(double price) {
        this.price = price;
    }

    class Processor {
        int cores;
        String manufacturer;
    
    
        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        
        public void displayProcessorInfo() {
            System.out.println("Processor Information:");
            System.out.println("Number of Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }


    static class RAM {
        int memory; 
        String manufacturer;

        
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        
        public void displayRAMInfo() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }


    public void displayCPUInfo() {
        System.out.println("CPU Price: $" + price);
    }

    public static void main(String[] args) {

        CPU myCPU = new CPU(500.00);

        myCPU.displayCPUInfo();
        CPU.Processor myProcessor = myCPU.new Processor(8, "Intel");
        myProcessor.displayProcessorInfo();

        // Create an object of RAM (static nested class)
        CPU.RAM myRAM = new CPU.RAM(16, "Corsair");
        myRAM.displayRAMInfo();
    }
}

