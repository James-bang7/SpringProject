package com.spring.deptservice;

import java.util.List;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.deptdao.DeptMapper;
import com.spring.deptvo.DeptVO;

@Service
@Transactional
public class DeptServiceImpl implements DeptService {

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public List<DeptVO> listDepartment(DeptVO param) { // 리스트 출력
		List<DeptVO> list = new ArrayList<DeptVO>();
		System.out.println(param.getDeptname());
		list = deptMapper.listDepartment(param);
		
		return list;
	}

	@Override
	public DeptVO selectDepartment(String deptid) { // 상세 보기
		return deptMapper.selectDepartment(deptid);
	}

	@Override
	public int insertDepartment(DeptVO param) { // 부서 등록
		return deptMapper.insertDepartment(param);
	}

	@Override
	public int updateDepartment(DeptVO param) {
		return deptMapper.updateDepartment(param); // 부서 정보 변경
	}

	@Override
	public int deleteDepartment(DeptVO param) {
		return deptMapper.deleteDepartment(param); // 부서 삭제
	}

}
