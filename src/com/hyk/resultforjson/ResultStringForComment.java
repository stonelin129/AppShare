package com.hyk.resultforjson;

import com.hyk.app.APPCommentList;

public class ResultStringForComment {
	/**
	 * 0为成功，1为失败；
	 */
	private int result;
	/**
	 * 错误信息
	 */
	private String errMsg;
	/**
	 * 错误Id
	 */
	private String errId;
	/**
	 * 为签名字符串（保留）
	 */
	private String sign;
	/**
	 * 
	 */
	private String errCode;
	/**
	 * 
	 */
	private String infor;
	/**
	 * 
	 */
	private String sucMsg;
	/**
	 * 成功返回的数据信息，当result=0时有效
	 */
	private APPCommentList obj;

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public String getErrMsg() {
		return errMsg;
	}

	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}

	public String getErrId() {
		return errId;
	}

	public void setErrId(String errId) {
		this.errId = errId;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public String getInfor() {
		return infor;
	}

	public void setInfor(String infor) {
		this.infor = infor;
	}

	public String getSucMsg() {
		return sucMsg;
	}

	public void setSucMsg(String sucMsg) {
		this.sucMsg = sucMsg;
	}

	public APPCommentList getObj() {
		return obj;
	}

	public void setObj(APPCommentList obj) {
		this.obj = obj;
	}

}
