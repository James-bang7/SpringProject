package com.spring.deptdao;

import java.util.List;

import com.spring.deptvo.DeptVO;

public interface DeptMapper {

	List<DeptVO> listDepartment(DeptVO param);
	DeptVO selectDepartment(String deptid);
	int insertDepartment(DeptVO param);
	int updateDepartment(DeptVO param);
	int deleteDepartment(DeptVO param);

}
