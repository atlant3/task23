package min;

import java.util.Scanner;

public class Deputat extends Person {
    private String lastName;
    private String firstName;
    private int age;
    private boolean getCash;
    private int cash;

    public Deputat(int weight, int height, String lastName, String firstName, int age, boolean getCash) {
        super(weight, height);
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
        this.getCash = getCash;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGetCash() {
        return getCash;
    }

    public void setGetCash(boolean getCash) {
        this.getCash = getCash;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Deputat{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                ", getCash=" + getCash +
                ", cash=" + cash +
                '}';
    }
    public void giveCash() {
        if(this.getCash == false) {
            System.out.println("This deputat not give cash");
        }
        else {
            System.out.println("Please enter amount cash: ");
            Scanner sc = new Scanner(System.in);
            int cash = sc.nextInt();
            if (cash>5000) {
                System.out.println("Police");
            }
            else {
                this.cash = cash;
            }
        }
    }
}
