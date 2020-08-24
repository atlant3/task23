package min;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Fraction {
    private String nameFraction;
    private List<Deputat> deputats = new ArrayList<>();

    public Fraction(String nameFraction) {
        this.nameFraction = nameFraction;
    }

    public String getNameFraction() {
        return nameFraction;
    }

    public void setNameFraction(String nameFraction) {
        this.nameFraction = nameFraction;
    }

    @Override
    public String toString() {
        return "Fraction{" +
                "nameFraction='" + nameFraction + '\'' +
                ", deputats=" + deputats +
                '}';
    }

    public void add() {
        System.out.println("Add a new deputat");
        Scanner sc = new Scanner(System.in);
        System.out.println("Please entry lastName");
        String lastName = sc.next();
        System.out.println("Please entry firstName");
        String firstName = sc.next();
        System.out.println("Please entry age");
        int age = sc.nextInt();
        System.out.println("Please entry giveCash? 1 - true/ 2 - false");
        int a = sc.nextInt();
        boolean giveCash = false;
        if (a == 1) {
            giveCash = true;
        } else {
            giveCash = false;
        }
        System.out.println("Please entry height");
        int height = sc.nextInt();
        System.out.println("Please entry weight");
        int weight = sc.nextInt();
        deputats.add(new Deputat(weight, height, lastName, firstName, age, giveCash));
        System.out.println("Add a new deputat 1 - yes/ 2 - no");
        int k = sc.nextInt();
        if (k == 1) {
            add();

        }
    }

    public void delete() {
        showAll();
        System.out.println("Please entry id deputats delete");
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        deputats.remove(r);
        showAll();
    }

    public void showCash() {
        deputats.stream().filter(d -> d.isGetCash()).forEach(System.out::println);
    }

    public void showMainCash() {
        deputats.stream().sorted(new MyCompare().reversed()).collect(Collectors.toList());
        System.out.println(deputats.get(0));
    }

    public void showAll() {
        System.out.println("Show all deputats");
        for (int i = 0; i < deputats.size(); i++) {
            System.out.println("id: " + i + " " + deputats.get(i));
        }
    }

    public void clearAll() {
        deputats.clear();
    }
}
