package task2;

import java.util.Comparator;

public class FIOComporator implements Comparator<Employee>{
    @Override
    public int compare(Employee o1, Employee o2) {
        int res = o1.name.compareTo(o2.name);
        if (res == 0)
            return o1.surName.compareTo(o2.surName);
        else
            return res;

    }
}
