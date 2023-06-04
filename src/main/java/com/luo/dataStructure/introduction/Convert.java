package com.luo.dataStructure.introduction;

import java.util.ArrayList;

/**
 * @author lkx
 * @version 1.0.0
 */
public class Convert {
    public String convert(String s, int numRows) {
        if (numRows < 2) {
            return s;
        }
        ArrayList<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1) {
                flag = -flag;
            }
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for (StringBuilder row : rows) {
            res.append(row);
        }
        return res.toString();
    }
}
