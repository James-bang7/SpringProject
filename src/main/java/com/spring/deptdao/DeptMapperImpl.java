package com.spring.deptdao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.deptvo.DeptVO;

@Repository
public class DeptMapperImpl implements DeptMapper {

	@Inject
	private SqlSession sqlSession;
	
	// DeptMapper 위치 설정, 이를 통해 메소드 출력이 쉽게한다
	private static final String namespace = "com.spring.deptdao.DeptMapper";
	
	@Override
	public List<DeptVO> listDepartment(DeptVO param) {
		return sqlSession.selectList(namespace + ".listDepartment", param);
	}

	@Override
	public DeptVO selectDepartment(String deptid) {
		return sqlSession.selectOne(namespace + ".selectDepartment", deptid);
	}

	@Override
	public int insertDepartment(DeptVO param) {
		return sqlSession.insert(namespace + ".insertDepartment", param);
	}

	@Override
	public int updateDepartment(DeptVO param) {
		return sqlSession.update(namespace + ".updateDepartment", param);
	}

	@Override
	public int deleteDepartment(DeptVO param) {
		return sqlSession.delete(namespace + ".deleteDepartment", param);
	}

}
