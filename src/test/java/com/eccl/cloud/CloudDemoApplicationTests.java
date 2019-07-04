package com.eccl.cloud;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.context.WebApplicationContext;

import com.fasterxml.jackson.databind.ObjectMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CloudDemoApplication.class)
@WebAppConfiguration
public class CloudDemoApplicationTests {
	
	@Autowired
    private WebApplicationContext context;

 

	private ObjectMapper mapper = new ObjectMapper();
	
	@Test
    public void testSend() throws Exception {


    }
	

}
