package com.wang.Test;

import com.fc.platform.commons.page.Page;
import com.wang.StartSpring;
import com.wang.dao.entity.Student;
import com.wang.dao.vo.StudentVo;
import com.wang.serivce.StudentMapperSerivce;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import java.util.List;
/**
 * Created by Administrator on 2016/9/26.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(value= StartSpring.class)
public class TestSpring {
      @Autowired
private StudentMapperSerivce studentMapperSerivce;

    @Test
    public void one(){
        List<Student> list=  studentMapperSerivce.find();
        for(Student s:list){
            System.out.println(s.getStudentName());
        }
    }

    @Test
    public void two(){
        Page<Student> list=studentMapperSerivce.findbypage(0, 10);

        System.out.println("总行数"+list.getTotalElements());
        System.out.println("总页数"+list.getTotalPages());

    }

    @Test
     public void three(){
        Student student=new Student();
        student.setStudentName("ss");
        student.setGradeId(100);
        boolean  bo=studentMapperSerivce.add(student);
        System.out.println(bo);
    }

    @Test
    public void four(){
       boolean bo= studentMapperSerivce.detele(10);
        System.out.println(bo);
    }
}
