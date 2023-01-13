public class RAM {
    public    String name;
    public  int memory;

    public RAM(){
        name = "ram";
        memory = 512;
    }

    public RAM(String name, int memory) {
        this.name = name;
        this.memory = memory;
    }
    public String getName() {
        return name;
    }

    public RAM setName(String name) {
        return new RAM(name, memory);
    }

    public int getMemory() {
        return memory;
    }

    public RAM setMemory(int memory) {
        return new RAM(name,memory);
    }

    public String toString() {
        return "\n" +
                "Name = '" + name + '\'' +
                ", Memory = " + memory +" гб.";
    }
}
