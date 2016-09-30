package com.wang.dao.vo;

/**
 * 
 * @author wangguangjun
 */
public class StudentVo {
	/**
	 *  学号
	 */
	private Integer studentNo;
	/**
	 *  学员名字
	 */
	private String studentName;
	/**
	 *  所属年级
	 */
	private Integer gradeId;
	/**
	 * 学号
	 * @param
	 */
	private String gradeName;

	public String getGradeName() {
		return gradeName;
	}

	public void setGradeName(String gradeName) {
		this.gradeName = gradeName;
	}

	public void setStudentNo(Integer studentNo){
		this.studentNo = studentNo;
	}
	
    /**
     * 学号
     * @return Integer
     */	
    public Integer getStudentNo(){
    	return studentNo;
    }
	/**
	 * 学员名字
	 * @param studentName
	 */
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	
    /**
     * 学员名字
     * @return String
     */	
    public String getStudentName(){
    	return studentName;
    }
	/**
	 * 所属年级
	 * @param gradeId
	 */
	public void setGradeId(Integer gradeId){
		this.gradeId = gradeId;
	}

    /**
     * 所属年级
     * @return Integer
     */
    public Integer getGradeId(){
    	return gradeId;
    }
}