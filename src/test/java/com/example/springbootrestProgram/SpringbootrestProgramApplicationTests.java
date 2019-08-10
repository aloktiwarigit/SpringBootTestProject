package com.example.springbootrestProgram;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class SpringbootrestProgramApplicationTests {

	@Test
	public void contextLoads() {
	}

}

