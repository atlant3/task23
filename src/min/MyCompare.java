package min;

import java.util.Comparator;

public class MyCompare implements Comparator<Deputat> {
    public int compare(Deputat o1, Deputat o2) {
        return o1.getCash()>o2.getCash()?1:-1;
    }

}
