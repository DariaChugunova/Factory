package Доп;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под MacOS.
 */
public class VintageChair implements Chair {
    @Override
    public void buy() {
        System.out.println("Винтаж стул");
    }
    // Отрисовать чекбокс в стиле macOS.

}
