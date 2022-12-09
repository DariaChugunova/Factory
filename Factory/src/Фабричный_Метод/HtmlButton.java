package Фабричный_Метод;

//конкретные продукты выражают разную реализацию
public class HtmlButton implements Button {

    public void render() {     // Вернуть HTML-код кнопки.
        System.out.println("Кнопка HTML");
        onClick();
    }

    public void onClick() {
        System.out.println("Клик web");
    }
}
