public class CPU {
    
    // Attribute of the CPU class
    double price;
    
    // Constructor for CPU class
    public CPU(double price) {
        this.price = price;
    }

    // Inner class Processor (non-static)
    class Processor {
        int cores;
        String manufacturer;

        // Constructor for Processor class
        public Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }

        // Method to display processor details
        public void displayProcessorInfo() {
            System.out.println("Processor Information:");
            System.out.println("Number of Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Static nested class RAM
    static class RAM {
        int memory; // in GB
        String manufacturer;

        // Constructor for RAM class
        public RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }

        // Method to display RAM details
        public void displayRAMInfo() {
            System.out.println("RAM Information:");
            System.out.println("Memory: " + memory + " GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }

    // Method to display CPU information
    public void displayCPUInfo() {
        System.out.println("CPU Price: $" + price);
    }

    public static void main(String[] args) {
        // Create an object of CPU
        CPU myCPU = new CPU(500.00);

        // Display the CPU information
        myCPU.displayCPUInfo();

        // Create an object of Processor (inner class)
        CPU.Processor myProcessor = myCPU.new Processor(8, "Intel");
        myProcessor.displayProcessorInfo();

        // Create an object of RAM (static nested class)
        CPU.RAM myRAM = new CPU.RAM(16, "Corsair");
        myRAM.displayRAMInfo();
    }
}

