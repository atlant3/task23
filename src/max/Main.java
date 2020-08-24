package max;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CommodityMethods cm = new CommodityMethods();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            nav();
            try {
                switch (sc.next()) {
                    case "1": {
                        cm.add();
                        break;
                    }
                    case "2": {
                        cm.delete();
                        break;
                    }
                    case "3": {
                        cm.update();
                        break;
                    }
                    case "4": {
                        cm.showAll();
                        break;
                    }
                    case "5": {
                        System.out.println("Sort by name");
                        cm.shortByName();
                        cm.showAll();
                        break;
                    }
                    case "6": {
                        System.out.println("Sort by height");
                        cm.shortByHeight();
                        cm.showAll();
                        break;
                    }
                    case "7": {
                        System.out.println("Sort by weight");
                        cm.shortByWeight();
                        cm.showAll();
                        break;
                    }
                    case "8": {
                        System.out.println("Sort by width");
                        cm.shortByWidth();
                        cm.showAll();
                    }
                    case "9": {
                        System.exit(0);
                    }

                    default: {
                        throw new Exception("You've chosen a non-existent item!");
                    }
                }

            } catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }

    public static void nav() {
        System.out.println("Please entry 1 - add a new Commodity");
        System.out.println("Please entry 2 - delete Commodity");
        System.out.println("Please entry 3 - update Commodity");
        System.out.println("Please entry 4 - Show all");
        System.out.println("Please entry 5 - Sort by Name");
        System.out.println("Please entry 6 - Sort by Height");
        System.out.println("Please entry 7 - Sort by Weight");
        System.out.println("Please entry 8 - Sort by Width");
        System.out.println("Please entry 9 - exit ");
    }
}
