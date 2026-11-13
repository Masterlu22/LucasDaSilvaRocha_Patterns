package builder;

public class Main {
    static void main() {
        Computador computadorBasico = new ComputadorBuilder().
                processador("Core i3-3210").
                memoriaRam("8GB RAM").
                armazenamento("256GB SSD").
                build();

        Computador computadorGamer = new ComputadorBuilder().
                processador("Ryzen 7 7800X3D").
                memoriaRam("32GB RAM").
                armazenamento("1TB SSD").
                placaDeVideo("Palit GeForce RTX 5060 Ti (16 GB GDDR7)").
                build();

        System.out.println("---Computador básico---" + computadorBasico);
        System.out.println("---Computador gamer---" + computadorGamer);
    }
}
