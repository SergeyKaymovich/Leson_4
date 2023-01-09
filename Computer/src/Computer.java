public class Computer {
    public RAM ram;
    public HDD hdd;
    private final int price;
    public String model;

    public  Computer(int price,String model){
        this.price = price;
        this.model = model;
    }

    public Computer(int price, String model, RAM ram, HDD hdd) {
        this.ram = ram;
        this.hdd = hdd;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "Computer:" + "\n" +
                " Price:" + price + "\n" +
                " Model" + model + "\n" +
                " RAM:" + ram + "\n" +
                " HDD:" + hdd;
    }
}