package com.dongjoo.bbs.model.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dongjoo.bbs.vo.MyBBS_VO;

@Repository
public class MyBBSDaoImpl implements IMyBBSDao {

	private final String NS = "com.dongjoo.bbs.model.dao.InquiryDaoImpl.";
	
	@Autowired
	private SqlSessionTemplate sqlSession ;
	
	@Override
	public int insertBBS(MyBBS_VO vo) {

		System.out.println("새 글 등록 테스트");
		System.out.println(vo);
		return sqlSession.insert(NS+"insertMyBBS",vo);
	}
	
	@Override
	public List<MyBBS_VO> selectAll() {
		
		return sqlSession.selectList(NS+"selectMyBBS");
	}
	
	@Override
	public MyBBS_VO selectBySeq(int seq) {
		
		return sqlSession.selectOne(NS+"selectMyBBSBySeq");
	}
}
