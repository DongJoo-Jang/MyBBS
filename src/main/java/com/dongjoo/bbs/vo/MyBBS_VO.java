package com.dongjoo.bbs.vo;

public class MyBBS_VO {
	private int seq;
	private String title;
	private String content;
	private int refer;
	private int step;
	private int depth;
	private String delflag;
	private String regdate;
	private String secretflag;
	private String userid;
	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getRefer() {
		return refer;
	}
	public void setRefer(int refer) {
		this.refer = refer;
	}
	public int getStep() {
		return step;
	}
	public void setStep(int step) {
		this.step = step;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public String getDelflag() {
		return delflag;
	}
	public void setDelflag(String delflag) {
		this.delflag = delflag;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getSecretflag() {
		return secretflag;
	}
	public void setSecretflag(String secretflag) {
		this.secretflag = secretflag;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	@Override
	public String toString() {
		return "Inquiry_VO [seq=" + seq + ", title=" + title + ", content=" + content + ", refer="
				+ refer + ", step=" + step + ", depth=" + depth + ", delflag=" + delflag + ", regdate=" + regdate
				+ ", secretflag=" + secretflag + ", userid=" + userid + "]";
	}
	public MyBBS_VO(String title, String content, String userid) {
		super();
		this.title = title;
		this.content = content;
		this.userid = userid;
	}
	public MyBBS_VO() {
		super();
	}
	
	
}
