package Доп;

import java.util.Scanner;

public class Main {

    // Для кода, использующего фабрику, не важно, с какой конкретно
// фабрикой он работает. Все получатели продуктов работают с
// ними через общие интерфейсы.
    private static Application configureApplication() throws Exception {
        Application app;
        GUIFactory factory = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите стиль");
        System.out.println("Хайтек(ХТ) / Винтаж(В)");
        String s = scanner.nextLine();
        if (s.equals("В")) {
            factory = new VintageFactory();
        } else if (s.equals("ХТ")){
            factory = new HTFactory();
        }
        else{
            throw new Exception("Ошибка, неизвестный стиль");
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) throws Exception {
        Application app = configureApplication();
        app.buy();
    }
}
