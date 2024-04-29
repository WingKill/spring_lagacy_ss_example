package edu.sejong.ex.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import edu.sejong.ex.vo.EmpVO;

public interface EmpMapper {

	@Select("SELECT * FROM emp")
	public List<EmpVO> getEmp();
}
