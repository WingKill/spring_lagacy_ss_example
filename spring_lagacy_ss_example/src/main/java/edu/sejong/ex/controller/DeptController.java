package edu.sejong.ex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import edu.sejong.ex.service.DeptService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@GetMapping("/dept")
	public String empList(Model model) {
		model.addAttribute("depts", deptService.deptList());
		return "deptList";
	}
}
