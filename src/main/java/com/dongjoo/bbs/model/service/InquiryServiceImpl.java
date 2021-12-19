package com.dongjoo.bbs.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongjoo.bbs.model.dao.IInquiryDao;
import com.dongjoo.bbs.vo.InquiryBBS_VO;

@Service
public class InquiryServiceImpl implements IInquiryService {
	@Autowired
	IInquiryDao dao;
	
	@Override
	public int insert(InquiryBBS_VO vo) {
		return dao.insertBBS(vo);
	}
	
}
