package com.spring.dept;

import java.util.List;

import org.junit.Test;

import com.spring.deptdao.DeptMapper;
import com.spring.deptdao.DeptMapperImpl;
import com.spring.deptservice.DeptService;
import com.spring.deptservice.DeptServiceImpl;
import com.spring.deptvo.DeptVO;

public class DepartmentServiceClient {
	
	@Test
	public void deptTest() {
		DeptVO vo = new DeptVO();
		DeptService service = new DeptServiceImpl();
		DeptMapper mapper = new DeptMapperImpl();
		
		String a = "1";
		vo = service.selectDepartment(a);
		
		
		System.out.println("---> " + vo.toString());
		
//		List<DeptVO> List  = mapper.listDepartment(vo);
//		for (DeptVO dept : List) {
//			System.out.println("---> " + dept.toString());
//		}
	}
}
