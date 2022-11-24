import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max;
        int min;
        //1. Ввести первое число с клавиатуры и записать его в строковую переменную.
        System.out.print("Введите первое число: ");
        String x = Integer.toString(scanner.nextInt()); //Вводим число и преобразуем его в String
        //2. Ввести второе число с клавиатуры и сохранить его в целочисленную переменную типа int.
        System.out.print("Введите второе число: ");
        int y = scanner.nextInt();
        //3. Сравнить 2 числа и вывести большее на экран
        int i1 = Integer.parseInt(x); //Для сравнения конфертируем х в Int и записываем в переменную i1
        if (i1 < y){
            max = y;
            min = i1;
        }
        else{
            max = i1;
            min = y;
        }
        System.out.println("Максимальное число равно: " + max);
        //4. Выведите также меньшее число на экран, предварительно переконвертировать его в тип double.
        System.out.println("Минимальное число равно: " + (double)min);
    }
}