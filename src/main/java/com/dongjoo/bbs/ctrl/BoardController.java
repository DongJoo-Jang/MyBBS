package com.dongjoo.bbs.ctrl;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.http.HttpResponse;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.dongjoo.bbs.model.service.IMyBBSService;
import com.dongjoo.bbs.vo.MyBBS_VO;

@Controller
public class BoardController {

	@Autowired
	private IMyBBSService service;
	
	@GetMapping("/bbsList.do")
	public String selectAll(Model model) {
		System.out.println("전체 조회");
		List<MyBBS_VO> lists = service.selectAll();
		model.addAttribute("lists",lists);
		
		return "bbs/bbslist";
	}
	
	@GetMapping("/bbsinsertForm.do")
	public String insertForm()  {
		
		return "bbs/bbsinsertform";
	
	}
	
	@PostMapping("/bbsinsert.do")
	public String insertBoard(MyBBS_VO vo , HttpServletResponse resp) throws IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		int insertCnt = service.insert(vo);
		if(insertCnt >0) {
			out.println("<script> alert('등록 성공'); </script>");
		}else {
			System.out.println("등록실패");
			out.println("<script> alert('등록 실패'); </script>");
		}
		return "/bbs/bbslist";
	}

	@GetMapping("/bbsdetail.do")
	public ModelAndView detail(int seq)  {

		ModelAndView mav = new ModelAndView();
		MyBBS_VO vo = service.selectBySeq(seq);
		mav.setViewName("bbs/bbsdetail");
		mav.addObject(vo);
		return mav;
	
	}
}
