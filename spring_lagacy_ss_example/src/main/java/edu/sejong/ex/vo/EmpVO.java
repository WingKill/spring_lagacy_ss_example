package edu.sejong.ex.vo;

import java.sql.Timestamp;

import org.springframework.stereotype.Component;
import org.zerock.sample.Chef;
import org.zerock.sample.Restaurant;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Data
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	private String mgr;
	private Timestamp hiredate;
	private int sal;
	private String comm;
	private int deptno;
}
