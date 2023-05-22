package com.luo.dataStructure.introduction;

import org.springframework.stereotype.Component;

/**
 * @author lkx
 * @version 1.0.0
 */
@Component
public class IsNumber {

    public boolean isNumber(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        char c = s.charAt(s.length() - 1);
        char tmpF = 'f';
        char tmpD = 'd';
        char tempD = 'D';
        char tempF = 'F';
        try {
            if (c == tmpF || c == tmpD) {
                return false;
            }

            if (c == tempD || c == tempF) {
                return false;
            }
            double num = Double.parseDouble(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
