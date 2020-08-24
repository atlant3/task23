package min;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Rada rada = new Rada();
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        while (flag) {
            nav();
            try {
                switch (sc.next()) {
                    case "1": {
                        rada.add();
                        break;
                    }
                    case "2": {
                        rada.delete();
                        break;
                    }
                    case "3": {
                        rada.showAll();
                        break;
                    }

                    case "4": {
                        rada.clear();
                        break;
                    }

                    case "5": {
                        rada.showFraction();
                        break;
                    }

                    case "6": {
                        rada.addDeputatFraction();
                        break;
                    }

                    case "7": {
                        rada.deleteDeputatFraction();
                        break;
                    }

                    case "8": {
                        rada.showCashFraction();
                        break;
                    }

                    case "9": {
                        rada.showMainCashFraction();
                        break;
                    }

                    case "0": {
                        flag = false;
                        break;
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
        System.out.println("Please entry 1 - add a new Fraction");
        System.out.println("Please entry 2 - delete Fraction ");
        System.out.println("Please entry 3 - show all Fraction ");
        System.out.println("Please entry 4 - clear Fraction");
        System.out.println("Please entry 5 - show Fraction ");
        System.out.println("Please entry 6 - add a new Deputat ");
        System.out.println("Please entry 7 - delete Deputat ");
        System.out.println("Please entry 8 - Show all giveCash ");
        System.out.println("Please entry 9 - Show mainGiveCash ");
        System.out.println("Please entry 0 - exit ");
    }

}
