package com.luo.dataStructure.introduction;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author lkx
 * @version 1.0.0
 */
@Component
public class ReplaceSpace {

    /**
     * 替换字符串中的空格字符为非空格字符
     *
     * @param s 待替换的字符串
     * @return 返回替换后的字符串
     */
    public String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();

    }
}
