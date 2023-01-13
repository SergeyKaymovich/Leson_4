public class HDD {
    public String name;
    public int memory;
    public String type;

    public  HDD(){
        name = "hdd";
        memory = 512;
        type = "yes";
    }
    public HDD(String name, int memory, String type) {
        this.name = name;
        this.memory = memory;
        this.type = type;
    }
    public String getName() {
        return name;
    }

    public HDD setName(String name) {
        return new HDD(name, memory, type);
    }

    public int getMemory() {
        return memory;
    }

    public HDD setMemory(int memory) {
        return new HDD(name,memory,type);
    }
    public String getType(){
        return  type;
    }
    public HDD setType(String type) {
        return new HDD(type,memory,name);
    }

    public String toString() {
        return "\n" +
                "Name = '" + name+ '\'' +
                ", Memory = " + memory +" гб."+
                ", Type = '" + type ;
    }
}
