import java.util.Scanner;

public class FirstClass {

    /**Функция запускает работу программы.*/
    public void run() {
        String name = setData("Введите имя: ");
        String age_str = setData("Введите возраст: ");
        int age = 0;
        try {
            age = Integer.parseInt(age_str);
        } catch (NumberFormatException exception) {
            System.out.println(exception.getMessage());
        }

        Decorator.helloUser(name, age);

    }

    /**Функция принимает сообщение, что нужно внести пользователю и возвращает строку, которая далее вываодится на экран.*/
    private String setData(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }
}
