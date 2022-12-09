package Доп;

// Семейства продуктов имеют те же вариации (macOS/Windows).
public class HTTable implements Table {
    @Override
    public void buy() {
        System.out.println("Хайтек стол");
    }
    // Отрисовать кнопку в стиле Windows.

}
