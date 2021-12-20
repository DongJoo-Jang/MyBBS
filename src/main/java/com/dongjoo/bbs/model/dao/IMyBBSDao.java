package com.dongjoo.bbs.model.dao;

import java.util.List;

import com.dongjoo.bbs.vo.MyBBS_VO;

public interface IMyBBSDao {

	public int insertBBS(MyBBS_VO vo) ;
	public List<MyBBS_VO> selectAll();
}
