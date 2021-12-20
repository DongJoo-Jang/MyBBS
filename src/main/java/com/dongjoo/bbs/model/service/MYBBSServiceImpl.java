package com.dongjoo.bbs.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dongjoo.bbs.model.dao.IMyBBSDao;
import com.dongjoo.bbs.vo.MyBBS_VO;

@Service
public class MYBBSServiceImpl implements IMyBBSService {
	@Autowired
	IMyBBSDao dao;
	
	@Override
	public int insert(MyBBS_VO vo) {
		return dao.insertBBS(vo);
	}
	public List<MyBBS_VO> selectAll() {
		return dao.selectAll();
	}
	
}
