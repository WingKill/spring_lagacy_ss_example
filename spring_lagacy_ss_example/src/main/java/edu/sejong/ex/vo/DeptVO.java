package edu.sejong.ex.vo;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Component
@Data
public class DeptVO {
	private int deptno;
	private String dname;
	private String loc;
}
