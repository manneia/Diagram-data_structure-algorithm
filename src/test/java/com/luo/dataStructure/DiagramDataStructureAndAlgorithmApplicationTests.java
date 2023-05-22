package com.luo.dataStructure;

import com.luo.dataStructure.introduction.ReplaceSpace;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DiagramDataStructureAndAlgorithmApplicationTests {
    @Resource
    private ReplaceSpace replaceSpace;

    @Test
    void contextLoads() {
        String s = replaceSpace.replaceSpace("We are happy.");
        System.out.println(s);
    }

}
