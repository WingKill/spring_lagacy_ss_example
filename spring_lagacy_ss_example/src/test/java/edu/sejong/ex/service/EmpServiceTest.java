package edu.sejong.ex.service;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.sejong.ex.vo.EmpVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class EmpServiceTest {

	@Autowired
	private EmpService empService; 
	
	@Test
	public void testDeptService() {
		assertNotNull(empService);
		
		for(EmpVO emp : empService.empList()) {
			System.out.println("emp : " + emp);
		}		
	}

}
