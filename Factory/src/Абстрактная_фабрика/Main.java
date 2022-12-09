package Абстрактная_фабрика;

import java.util.Scanner;

public class Main {

    // Для кода, использующего фабрику, не важно, с какой конкретно
// фабрикой он работает. Все получатели продуктов работают с
// ними через общие интерфейсы.
    private static Application configureApplication() throws Exception {
        Application app;
        GUIFactory factory = null;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите систему");
        System.out.println("Windows(W) / Mac(M)");
        String s = scanner.nextLine();
        if (s.equals("M")) {
            factory = new MacOSFactory();
        } else if (s.equals("W")){
            factory = new WindowsFactory();
        }
        else{
            throw new Exception("Ошибка, неизвестная система");
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) throws Exception {
        Application app = configureApplication();
        app.paint();
    }
}
