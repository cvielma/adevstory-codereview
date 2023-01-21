package com.adev;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a contains function.
 */
public class UserCart {
    private List<String> list = new ArrayList<>();

    public boolean con(String o) {
        int a1 = list.size();
        if (a1 <= 0) {
            return false;
        } else if (a1 > 0){
            int l = 0;
            while (l < a1) {
                if (list.get(l).equals(o)) {
                    return true;
                }
                l++;
            }
            return false;
        }
        return false;
    }

    public void add(String item) {
        list.add(item);
    }

    public void remove(String item) {
        list.remove(item);
    }

    // some other methods
}
