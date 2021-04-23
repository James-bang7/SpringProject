package com.spring.deptservice;

import java.util.List;

import com.spring.deptvo.DeptVO;

public interface DeptService {

	public List<DeptVO> listDepartment(DeptVO param); // 리스트 출력
	public DeptVO selectDepartment(String deptid); // 상세 보기
	public int insertDepartment(DeptVO param); // 부서 등록
	public int updateDepartment(DeptVO param); // 부서 수정
	public int deleteDepartment(DeptVO param); // 부서 삭제

}
