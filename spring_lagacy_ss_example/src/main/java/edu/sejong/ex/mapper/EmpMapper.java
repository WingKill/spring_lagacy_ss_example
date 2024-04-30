package edu.sejong.ex.mapper;

import java.util.List;

import edu.sejong.ex.vo.EmpVO;

public interface EmpMapper {
	//@Select("SELECT * FROM emp")
	public List<EmpVO> getEmp();
}
