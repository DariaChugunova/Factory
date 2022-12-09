package Доп;

// Каждая конкретная фабрика знает и создаёт только продукты
// своей вариации.
public class VintageFactory implements GUIFactory {

    @Override
    public Table createTable() {
        return new VintageTable();
    }

    @Override
    public Chair createChair() {
        return new VintageChair();
    }
}
