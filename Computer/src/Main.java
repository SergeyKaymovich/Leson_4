public class Main {

    public static void main(String[] args) {
        Computer computer1 = new Computer(1000, "Pentium"){
        };
        Computer computer2 = new Computer(1000, "Pentium",
                new RAM("DDR4", 16),
                new HDD("HDD", 1000, "External")
        );
        System.out.println(computer1);
        System.out.println(computer2);
    }
}
