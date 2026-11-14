package abstract_factory;

public class Main {
    static void main() {
        System.out.println("=== Tema Claro ===");
        UIComponentFactory lightTheme = new LightThemeFactory();
        Application app = new Application();
        app.criar(lightTheme);

        System.out.println("=== Tema Escuro ===");
        UIComponentFactory darkTheme = new DarkThemeFactory();
        Application app2 = new Application();
        app2.criar(darkTheme);

    }
}
