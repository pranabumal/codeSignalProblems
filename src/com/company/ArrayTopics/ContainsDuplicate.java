package com.company.ArrayTopics;

import java.util.HashMap;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {

        HashMap<Integer,Boolean> box= new HashMap<>();
        for (int num : nums) {
            if (box.containsKey(num)) {
                return true;
            } else {
                box.put(num, true);
            }
        }
        return false;

    }
}
