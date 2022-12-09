package Фабричный_Метод;

import java.util.Scanner;

public class Main {
    private static Dialog dialog;

    public static void main(String[] args) throws Exception {
        initialize();
        dialog.render();
    }

    /**
     * Приложение создаёт определённую фабрику
     */
    private static void initialize() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите систему");
        System.out.println("Windows(W) / html(H)");
        String s = scanner.nextLine();
        if (s.equals("W")) {
            dialog = new WindowsDialog();
        } else if (s.equals("H")){
            dialog = new HtmlDialog();
        }
        else {
            throw new Exception("Ошибка, неизвестная система");
        }
    }
}
