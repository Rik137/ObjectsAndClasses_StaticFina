public class Computer {
    private final String vendor;
    private final String name;
    private  CPU cpu;
    private RAM ram;
    private Memory memory;
    private Screen screen;
    private Keyboard keyboard;

    private int allWeight = 0;

    public Computer(String vendor, String name, CPU cpu, RAM ram, Memory memory, Screen screen, Keyboard keyboard) {
        this.vendor = vendor;
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.screen = screen;
        this.keyboard = keyboard;
    }

    public String getVendor() {
        return vendor;
    }

    public Computer setVendor(String vendor) {
        return new Computer(vendor, name, cpu, ram, memory, screen, keyboard);
    }

    public String getName() {
        return name;
    }

    public Computer setName(String name) {
        return new Computer(vendor, name, cpu, ram, memory, screen, keyboard);
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public int getAllWeight() {
        return allWeight;
    }

    public void setAllWeight(int allWeight) {
        this.allWeight = allWeight;
    }

    public double calcWeight(){
        return cpu.getWeight() + ram.getWeight() + memory.getWeight() +
                screen.getWeight()  + keyboard.getWeight();
    }

    @Override
    public String toString() {
        return "ФИРМА: " + vendor + "\n" +
                "----------------------------" + "\n" +
                "МОДЕЛЬ: " + name + "\n" +
                "----------------------------" + "\n" +
                "ПРОЦЕССОР" + "\n" + cpu + "\n" +
                "----------------------------" + "\n" +
                "ОПЕРАТИВНАЯ ПАМЯТЬ" + "\n" + ram + "\n" +
                "----------------------------" + "\n" +
                "XРАНИЛИЩЕ" + "\n" + memory + "\n" +
                "----------------------------" + "\n" +
                "ЭКРАН" + "\n" + screen + "\n" +
                "----------------------------" + "\n" +
                "КЛАВИОТУРА" + "\n" + keyboard;

    }
}
