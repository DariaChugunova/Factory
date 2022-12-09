package Фабричный_Метод;


// Конкретные фабрики переопределяют фабричный метод и
// возвращают из него собственные продукты.
public class WindowsDialog extends Dialog {

    @Override // преобразование заводского метода, чтобы изменить тип результата
    public Button createButton() {
        return new WindowsButton();
    }
}
