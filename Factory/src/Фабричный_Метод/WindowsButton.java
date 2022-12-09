package Фабричный_Метод;

//конкретные продукты выражают разную реализацию
public class WindowsButton implements Button {
    public void render() {// Отрисовать кнопку в стиле Windows.
        System.out.println("Windows кнопка");
        onClick();
    }

    public void onClick() {
        System.out.println("Клик ОС");
    }
}
