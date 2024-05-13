import java.io.File;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Mtz {
    public static void main(String[] args) throws IOException {
        if (args.length < 2) {
            System.out.println("Для запуска программы необходимо указать операцию (min, max, sum, mult) и путь к файлу с числами.");
            return;
        }

        String operation = args[0];
        String filename = args[1];

        BigInteger[] num = readNumbersFromFile(filename);

        switch (operation) {
            case "_min":
                System.out.println("Минимальное: " + _min(num));
                break;
            case "_max":
                System.out.println("Максимальное: " + _max(num));
                break;
            case "_sum":
                System.out.println("Сумма: " + _sum(num));
                break;
            case "_mult":
                System.out.println("Произведение: " + _mult(num));
                break;
            default:
                System.out.println("Неверная операция. Допустимые операции: min, max, sum, mult.");
        }
    }

    public static BigInteger[] readNumbersFromFile(String filename) throws IOException {
        Scanner scanner = new Scanner(new File(filename));
        String line = scanner.nextLine();
        scanner.close();
        String[] numbersAsString = line.split(" ");
        BigInteger[] numbers = new BigInteger[numbersAsString.length];
        for (int i = 0; i < numbersAsString.length; i++) {
            numbers[i] = new BigInteger(numbersAsString[i]);
        }
        return numbers;
    }

    public static BigInteger _min(BigInteger[] numbers) {
        BigInteger min = numbers[0];
        for (BigInteger num : numbers) {
            if (num.compareTo(min) < 0) {
                min = num;
            }
        }
        return min;
    }

    public static BigInteger _max(BigInteger[] numbers) {
        BigInteger max = numbers[0];
        for (BigInteger num : numbers) {
            if (num.compareTo(max) > 0) {
                max = num;
            }
        }
        return max;
    }

    public static BigInteger _sum(BigInteger[] numbers) {
        BigInteger sum = BigInteger.ZERO;
        for (BigInteger num : numbers) {
            sum = sum.add(num);
        }
        return sum;
    }

    public static BigInteger _mult(BigInteger[] numbers) {
        BigInteger product = BigInteger.ONE;
        for (BigInteger num : numbers) {
            product = product.multiply(num);
        }
        return product;
    }
}