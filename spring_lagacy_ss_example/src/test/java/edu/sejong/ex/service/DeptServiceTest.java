package edu.sejong.ex.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import edu.sejong.ex.vo.DeptVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DeptServiceTest {

	@Autowired
	private DeptService deptService; 
	
	@Test
	public void testDeptService() {
		assertNotNull(deptService);
		
		for(DeptVO dept : deptService.deptList()) {
			System.out.println("dept : " + dept);
		}		
	}

}
