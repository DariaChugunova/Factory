package Доп;

// Каждая конкретная фабрика знает и создаёт только продукты
// своей вариации.
public class HTFactory implements GUIFactory {

    @Override
    public Table createTable() {
        return new HTTable();
    }

    @Override
    public Chair createChair() {
        return new HTChair();
    }
}
