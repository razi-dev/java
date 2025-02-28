public class CPU
{
    int price=34000;
    
    class Processor
    {
        int num_of_cores=8;
        String manufacturer="AMD";
        
        static class RAM
        {
            int mem=8;
            String ram_manufacturer="companyx";
        }
    }
    
    public static void main(String args[])
    {
        CPU ob=new CPU();
        CPU.Processor proc_ob= ob.new Processor();
        Processor.RAM ram_ob= new Processor.RAM();
        
        System.out.println("Ram details \nMemmory:"+ram_ob.mem+"\nManufacturer:"+ram_ob.ram_manufacturer);
        System.out.println("\nProcessor details \nnumber of cores : "+proc_ob.num_of_cores+"\nManufacturer :" + proc_ob.manufacturer);
    }
}
