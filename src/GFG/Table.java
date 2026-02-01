package GFG;

import java.util.ArrayList;

class Table {
    static ArrayList<Integer> getTable(int n) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            list.add(n * i);
        }

        return list;
    }
}
