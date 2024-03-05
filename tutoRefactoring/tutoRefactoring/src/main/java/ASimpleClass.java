import java.time.LocalDate;
import java.util.Locale;

public class ASimpleClass {

    public ASimpleClass() {
    }

    /**
     * Additionne a et b
     * @param firstParameter - premier paramètre
     * @param b - second paramètre
     * @return
     */
    public int add(int firstParameter, int b) {
        return firstParameter + b ;
    }

    public static boolean isNowBetween (LocalDate startingDate, LocalDate endingDate) {
        return isDateBetween(LocalDate.now(), startingDate, endingDate);
    }

    public static boolean isDateBetween(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return (date.isAfter(startingDate)
                &&
                date.isBefore(endingDate)
        );
    }

    public static boolean isDateOutside(LocalDate date, LocalDate startingDate, LocalDate endingDate) {
        return (!isDateBetween(date, startingDate, endingDate));
    }

    public static void main(String[] args) {
        new ASimpleClass().add(1,2);

        System.out.println("Hello world");

        if(isDateBetween(LocalDate.now(), LocalDate.of(2024,01,01), LocalDate.of(2024,12,01))) {
            System.out.println("oui");
        }
        else {
            System.out.println("non");
        }
    }

}


