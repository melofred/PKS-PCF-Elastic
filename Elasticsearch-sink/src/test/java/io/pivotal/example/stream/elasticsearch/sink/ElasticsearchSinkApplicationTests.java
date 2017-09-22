package io.pivotal.example.stream.elasticsearch.sink;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.pivotal.example.stream.elasticsearch.sink.service.ElasticsearchPersistenceService;

@RunWith(SpringRunner.class)
@SpringBootTest 
public class ElasticsearchSinkApplicationTests {

	@Autowired
	ElasticsearchPersistenceService svc;
	
	
	@Test
	public void contextLoads() {
		
		try {
			svc.insert(svc.parse("2016/01/01 03:16:57.64,-25.3790,-179.4803,415.30,4.10,Mb,,71,8,1.03,us,201601012009"));
		}
		catch(Exception e) {
			throw new RuntimeException(e);
		}
		
	}

}