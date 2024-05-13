import org.junit.Test;
import java.io.FileWriter;
import java.io.IOException;

public class Stz {
    @Test
    public void testSpeed() throws IOException {
        long startTime, endTime;
        double elapsedTime;
        String[] filenames = {"1.txt", "2.txt", "3.txt", "4.txt", "5.txt", "6.txt"};

        for (String filename : filenames) {
            generateFile(filename, Integer.parseInt(filename.substring(0, 1)) * 10); // Генерируем файл с числами
            startTime = System.nanoTime(); // Записываем время начала выполнения
            Mtz.main(new String[]{filename}); // Запускаем программу для обработки файла
            endTime = System.nanoTime(); // Записываем время окончания выполнения
            elapsedTime = (endTime - startTime) / 1_000_000.0; // Вычисляем прошедшее время в миллисекундах
            System.out.println("Время выполнения файла " + filename + ": " + elapsedTime + " миллисекунд");
        }
    }

    private void generateFile(String filename, int count) throws IOException {
        FileWriter fileWriter = new FileWriter(filename);
        for (int i = 1; i <= count; i++) {
            fileWriter.write(i + " ");
        }
        fileWriter.close();
    }
}