import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class Test1 {
    static Logger LOGGER = Logger.getLogger(Test1.class.getName());
    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Начало Test1.");
        int sum = IntStream.iterate(1, n -> n+1)
                .filter(n -> n % 5 == 0 && n % 2 != 0)
                .limit(10)
                .map(n -> n * n)
                .sum();
        LOGGER.log(Level.INFO, "Результат {0}", sum);
    }
}
