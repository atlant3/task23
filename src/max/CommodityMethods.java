package max;

import java.util.*;

public class CommodityMethods {
    Commodity c = new Commodity();
    List<Commodity> commodities = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public void add() {
        System.out.println("Please entry Name");
        String nc = sc.next();
        System.out.println("Please entry height");
        int hc = sc.nextInt();
        System.out.println("Please entry weight");
        int wc = sc.nextInt();
        System.out.println("Please entry width");
        int wd = sc.nextInt();
        commodities.add(new Commodity(nc, hc, wc, wd));
        System.out.println("Add a new Commodity 1 - yes/ 2 - no");
        int k = sc.nextInt();
        if (k == 1) {
            add();
        }
    }

    public void delete() {
        System.out.println("Please entry name delete: ");
        String sd = sc.next();
        commodities.removeIf(f -> f.getName().equalsIgnoreCase(sd));
        showAll();
    }

    public void showAll() {
        for (Commodity cm : commodities) {
            System.out.println(cm);
        }
    }

    public void update() {
        System.out.println("Please entry name update: ");
        String sd = sc.next();
        for (Commodity c : commodities) {
            if (c.getName().equalsIgnoreCase(sd)) {
                Commodity com = commodities.stream().filter(f -> f.getName().equalsIgnoreCase(sd)).findFirst().get();
                System.out.println("Please entry Name");
                com.setName(sc.next());
                System.out.println("Please entry height");
                com.setHeight(sc.nextInt());
                System.out.println("Please entry weight");
                com.setWeight(sc.nextInt());
                System.out.println("Please entry width");
                com.setWidth(sc.nextInt());
            }
        }

    }
    public void shortByName() {
        Collections.sort(commodities, Comparator.comparing(Commodity::getName));
    }
    public void shortByHeight() {
        Collections.sort(commodities, Comparator.comparing(Commodity::getHeight));
    }
    public void shortByWeight() {
        Collections.sort(commodities, Comparator.comparing(Commodity::getWeight));
    }
    public void shortByWidth() {
        Collections.sort(commodities, Comparator.comparing(Commodity::getWidth));
    }
}
