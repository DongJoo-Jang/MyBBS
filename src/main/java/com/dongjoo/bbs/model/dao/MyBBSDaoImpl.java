package com.dongjoo.bbs.model.dao;

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

		System.out.println("새 글 등록");
		sqlSession.insert(NS+"insertInquiryBBS",vo);
		return 0;
	}
}
