package com.luo.dataStructure;

import com.luo.dataStructure.introduction.IsNumber;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DiagramDataStructureAndAlgorithmApplicationTests {
    @Resource
    private IsNumber isNumber;

    @Test
    void contextLoads() {
        isNumber.isNumber(".123");
    }

}
