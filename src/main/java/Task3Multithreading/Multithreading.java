package Task3Multithreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Multithreading implements Runnable{

    //заданное условие
    static int condition = 1000000;
    static String resultPath = "Result.txt";
    // объявляем и инициализируем потокобезопасную переменную счетчика
    final AtomicInteger synchronizedCounter = new AtomicInteger(-1);

    public static void main(String[] args) throws InterruptedException {
        Multithreading multithreading = new Multithreading();
        // запускаем потоки по заданному условию
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i=0; i<condition; i++){
            service.execute(multithreading);
        }
        service.shutdown();
    }

    private static boolean isPrime1(int n) {
        if (n > 1) {
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void run() {
        // поток будет самостоятельно инкрементировать счетчик
        int element = synchronizedCounter.incrementAndGet();
        if (isPrime1(element)) {
            try (FileWriter resultFile = new FileWriter(resultPath, true);
                 FileWriter threadFile = new FileWriter(Thread.currentThread().getName() + ".txt" , true)) {

                resultFile.write(element + " ");
                threadFile.write(element + " ");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " get element " + element);
        }
    }
}
