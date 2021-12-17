package com.dongjoo.bbs.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;

import com.dongjoo.bbs.vo.InquiryBBS_VO;

public class InquiryDaoImpl implements IInquiryDao {

	private final String NS = "com.dongjoo.bbs.model.dao.InquiryDaoImpl.";
	
	@Autowired
	private SqlSessionTemplate sqlSession ;
	@Override
	public int insertBBS(InquiryBBS_VO vo) {

		System.out.println("새 글 등록");
		sqlSession.insert(NS+"insertInquiryBBS",vo);
		return 0;
	}
}
