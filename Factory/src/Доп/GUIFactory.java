package Доп;


// Абстрактная фабрика знает обо всех абстрактных типах
// продуктов.
public interface GUIFactory {
    Table createTable();
    Chair createChair();
}

