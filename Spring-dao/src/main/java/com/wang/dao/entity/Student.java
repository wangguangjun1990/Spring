package com.wang.dao.entity;

/**
 * 
 * @author wangguangjun
 */
public class Student {
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
	 * @param studentNo
	 */
	public void setStudentNo(Integer studentNo){
		this.studentNo = studentNo;
	}
	
    /**
     * 学号
     * @return
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
     * @return
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
     * @return
     */	
    public Integer getGradeId(){
    	return gradeId;
    }
}