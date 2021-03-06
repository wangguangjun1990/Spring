package com.wang.dao.vo;

/**
 * 
 * @author wangguangjun
 */
public class ResultVo {
	/**
	 *  参加考试的学员编号
	 */
	private Integer studentNo;
	/**
	 *  参考考试的科目编号
	 */
	private Integer subjectNo;
	/**
	 *  考试分数
	 */
	private Integer studentResult;
	/**
	 *  
	 */
	private Integer studentPk;
	/**
	 * 参加考试的学员编号
	 * @param studentNo
	 */
	public void setStudentNo(Integer studentNo){
		this.studentNo = studentNo;
	}
	
    /**
     * 参加考试的学员编号
     * @return Integer
     */	
    public Integer getStudentNo(){
    	return studentNo;
    }
	/**
	 * 参考考试的科目编号
	 * @param subjectNo
	 */
	public void setSubjectNo(Integer subjectNo){
		this.subjectNo = subjectNo;
	}
	
    /**
     * 参考考试的科目编号
     * @return Integer
     */	
    public Integer getSubjectNo(){
    	return subjectNo;
    }
	/**
	 * 考试分数
	 * @param studentResult
	 */
	public void setStudentResult(Integer studentResult){
		this.studentResult = studentResult;
	}
	
    /**
     * 考试分数
     * @return Integer
     */	
    public Integer getStudentResult(){
    	return studentResult;
    }
	/**
	 * 
	 * @param studentPk
	 */
	public void setStudentPk(Integer studentPk){
		this.studentPk = studentPk;
	}
	
    /**
     * 
     * @return Integer
     */	
    public Integer getStudentPk(){
    	return studentPk;
    }
}