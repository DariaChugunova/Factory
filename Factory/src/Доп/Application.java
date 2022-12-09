package Доп;

/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Table table;
    private Chair chair;

    public Application(GUIFactory factory) {
        table = factory.createTable();
        chair = factory.createChair();
    }

    public void buy() {
        table.buy();
        chair.buy();
    }
}
