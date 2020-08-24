package min;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Rada {
    private List<Fraction> fractions = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void add() {
        String f = sc.next();
        fractions.add(new Fraction(f));
        System.out.println("Add a new Fraction 1 - yes/ 2 - no");
        int k = sc.nextInt();
        if (k == 1) {
            add();
        }
    }

    public void delete() {
        showAll();
        int k = sc.nextInt();
        fractions.remove(k);
        showAll();
    }

    public void showAll() {
        System.out.println("Show all deputats");
        for (int i = 0; i < fractions.size(); i++) {
            System.out.println("id: " + i + " " + fractions.get(i));
        }
    }

    public void showFraction() {
        String fractionName = enterFractionName();
        fractions.stream().filter(f -> f.getNameFraction().equalsIgnoreCase(fractionName)).forEach(System.out::println);
    }

    public void addDeputatFraction() {
        String fractionName = enterFractionName();
        fractions.stream().filter(f -> f.getNameFraction().equalsIgnoreCase(fractionName)).findFirst()
                .ifPresent(Fraction::add);
    }

    public void deleteDeputatFraction() {
        String fractionName = enterFractionName();
        fractions.stream().filter(f -> f.getNameFraction().equalsIgnoreCase(fractionName)).findFirst()
                .ifPresent(Fraction::delete);
    }

    public void showCashFraction() {
        String fractionName = enterFractionName();
        fractions.stream().filter(f -> f.getNameFraction().equalsIgnoreCase(fractionName)).findFirst()
                .ifPresent(Fraction::showCash);
    }

    public void showMainCashFraction() {
        String fractionName = enterFractionName();
        fractions.stream().filter(f -> f.getNameFraction().equalsIgnoreCase(fractionName)).findFirst()
                .ifPresent(Fraction::showMainCash);
    }

    public void showAlLDeputiesInFraction() {
        String fractionName = enterFractionName();
        fractions.stream().filter(f -> f.getNameFraction().equalsIgnoreCase(fractionName)).findFirst()
                .ifPresent(Fraction::showAll);
    }

    public void clear() {
        String fractionName = enterFractionName();
        fractions.stream().filter(f -> f.getNameFraction().equalsIgnoreCase(fractionName)).findFirst()
                .ifPresent(Fraction::clearAll);
    }

    public String enterFractionName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name fraction:");
        while (true) {
            try {
                String fractionName = sc.next();

                for (Fraction fraction : fractions) {
                    if (fraction.getNameFraction().equalsIgnoreCase(fractionName)) {
                        return fractionName;
                    }
                }

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
}
