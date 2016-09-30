package com.wang.serivce;


import com.fc.platform.commons.page.Page;
import com.fc.platform.commons.page.PageRequest;
import com.wang.dao.entity.Student;
import com.wang.dao.mapper.StudentMapper;
import com.wang.dao.vo.StudentVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/26.
 */
@Service
public class StudentMapperSerivce {
    @Autowired
    private StudentMapper studentMapper;

    public List<Student> find(){
        List<Student> list=studentMapper.searchStudentByParams(null);
           return list;

    }

    public Page<Student> findbypage(int page,int count){
        PageRequest pqg=new PageRequest(page,count);
        Page<Student> slist=studentMapper.searchStudentByParams(null,pqg);
           return  slist;
    }

    public Page<StudentVo> findbypage1(int page,int count){
        PageRequest pqg=new PageRequest(page,count);
        Page<StudentVo> slist1=studentMapper.searchStudentByParams1(null,pqg);
        return  slist1;
    }

    public boolean add(Student student){
        try{
            boolean bo=studentMapper.insertStudent(student);
            return bo;
        }
       catch(Exception e){
           return false;

      }
    }

    public boolean detele(int studentNo){
        boolean boo=studentMapper.deleteStudentByStudentNo(studentNo);
             return boo;

    }

    public  List<Student> cha(Map map){
      List<Student> list=studentMapper.searchStudentByParams(map);
           return list;

    }

    public boolean update(Student student){
          boolean bo=studentMapper.updateStudent(student);
            return bo;
    }


}
