package com.example.demo;

import org.junit.Test;

import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author yt
 * @date 2020/9/22 21:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class Slf4jTest {
    private Logger logger= LoggerFactory.getLogger(getClass());
    @Test
    public void a(){
        logger.trace("跟踪。。。。。");
        logger.info("信息。。。。。");
    }
}
