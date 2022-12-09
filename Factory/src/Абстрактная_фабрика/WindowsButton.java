package Абстрактная_фабрика;

// Семейства продуктов имеют те же вариации (macOS/Windows).
public class WindowsButton implements Button {
    // Отрисовать кнопку в стиле Windows.
    @Override
    public void paint() {
        System.out.println("Windows кнопка");
    }
}
