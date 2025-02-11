import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        Recipients problem = new Recipients();
        problem.lines.addAll(Arrays.asList("Mr. J. Adams", "6 Rose St.", "Ithaca, NY 14850", "",
            "Jack S. Smith", "Ms. M.K. Delgado", "12 Posy Way", "Suite #201", "Glendale, CA 91023", "",
            "John Doe", "2 River Dr.", "New York, NY 10013", ""
        ));
        problem.printNames();
        System.out.println(problem.extractCity("Ithaca, NY 14850"));
        System.out.println(problem.getAddress("Jack S. Smith"));
    }
}