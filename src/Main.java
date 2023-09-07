import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DateSorter sorter = new DateSorter();
        List<LocalDate> unsortedDates = new ArrayList<>();
        unsortedDates.add(LocalDate.of(2005, 7, 1));
        unsortedDates.add(LocalDate.of(2005, 1, 2));
        unsortedDates.add(LocalDate.of(2005, 1, 1));
        unsortedDates.add(LocalDate.of(2005, 5, 3));

        Collection<LocalDate> sortedDates = sorter.sortDates(unsortedDates);

        for (LocalDate date : sortedDates) {
            System.out.println(date);
        }
    }
}