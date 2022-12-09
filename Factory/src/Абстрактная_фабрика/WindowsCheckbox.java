package Абстрактная_фабрика;

public class WindowsCheckbox implements Checkbox {
    // Отрисовать чекбокс в стиле Windows.
    @Override
    public void paint() {
        System.out.println("Windows Checkbox");
    }
}
