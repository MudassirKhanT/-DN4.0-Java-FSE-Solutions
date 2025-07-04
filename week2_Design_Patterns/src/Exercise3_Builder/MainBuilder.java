package Exercise3_Builder;

public class MainBuilder {
    public static void main(String[] args) {
        Computer comp = new Computer.Builder()
            .setCPU("Intel i7")
            .setRAM("16GB")
            .setStorage("512GB SSD")
            .build();

        System.out.println(comp);
    }
}
