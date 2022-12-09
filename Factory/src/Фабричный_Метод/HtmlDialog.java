package Фабричный_Метод;


// Конкретные фабрики переопределяют фабричный метод и
// возвращают из него собственные продукты.
public class HtmlDialog extends Dialog {

    @Override // преобразование заводского метода, чтобы изменить тип результата
    public Button createButton() {
        return new HtmlButton();
    }
}
