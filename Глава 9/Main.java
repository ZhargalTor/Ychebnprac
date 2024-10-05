Глава 9 Вариант A 
Выполнил: Торяшиев Жаргал

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        String filePath = "numbers.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            double sum = 0.0;
            int count = 0;

            while ((line = br.readLine()) != null) {
                try {
                    String[] parts = line.split(" ");
                    if (parts.length != 2) {
                        throw new InvalidNumberException("Неверный формат строки: " + line);
                    }

                    String numberStr = parts[0];
                    Locale locale = new Locale(parts[1]);
                    NumberFormat format = NumberFormat.getInstance(locale);
                    Number number = format.parse(numberStr);

                    double value = number.doubleValue();
                    if (Double.isNaN(value) || Double.isInfinite(value)) {
                        throw new InvalidNumberException("Недопустимое значение числа: " + value);
                    }

                    sum += value;
                    count++;
                } catch (InvalidNumberException | ParseException e) {
                    System.err.println("Ошибка при обработке строки: " + e.getMessage());
                }
            }

            if (count > 0) {
                double average = sum / count;
                System.out.println("Сумма: " + sum);
                System.out.println("Среднее значение: " + average);
            } else {
                System.out.println("Нет корректных чисел для обработки.");
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении файла: " + e.getMessage());
        } catch (OutOfMemoryError e) {
            System.err.println("Недостаточно памяти для выполнения операции.");
        }
    }
}
