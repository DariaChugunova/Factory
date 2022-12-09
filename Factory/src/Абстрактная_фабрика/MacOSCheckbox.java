package Абстрактная_фабрика;

/**
 * Все семейства продуктов имеют одинаковые вариации (MacOS/Windows).
 *
 * Вариация чекбокса под MacOS.
 */
public class MacOSCheckbox implements Checkbox {
    // Отрисовать чекбокс в стиле macOS.
    @Override
    public void paint() {
        System.out.println("Mac Checkbox.");
    }
}
