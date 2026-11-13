package abstract_factory;

public class Main {
    static void main() {
        System.out.println("=== Tema Claro ===");
        UIComponentFactory lightTheme = new LightThemeFactory();
        Application.criar(lightTheme);

        System.out.println("=== Tema Escuro ===");
        UIComponentFactory darkTheme = new DarkThemeFactory();
        Application.criar(darkTheme);

    }
}
