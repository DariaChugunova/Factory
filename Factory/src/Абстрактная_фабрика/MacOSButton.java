package Абстрактная_фабрика;

// Семейства продуктов имеют те же вариации (macOS/Windows).
public class MacOSButton implements Button {
    // Отрисовать кнопку в стиле macOS.
    @Override
    public void paint() {
        System.out.println("Mac кнопка");
    }
}
