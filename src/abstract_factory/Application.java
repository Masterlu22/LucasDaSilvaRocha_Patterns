package abstract_factory;

public class Application {

    public static void criar(UIComponentFactory factory){
        factory.createButton().render();
        factory.createTextField().render();
        factory.createCheckbox().render();
    }
}
