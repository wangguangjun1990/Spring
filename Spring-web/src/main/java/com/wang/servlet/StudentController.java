package com.wang.servlet;

import com.fc.platform.commons.page.Page;
import com.wang.dao.entity.Grade;
import com.wang.dao.entity.Student;
import com.wang.dao.vo.StudentVo;
import com.wang.serivce.GradeMapperSerivce;
import com.wang.serivce.StudentMapperSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2016/9/27.
 */

@Controller
public class StudentController {

    @Autowired
    private StudentMapperSerivce studentMapperSerivce;
    @Autowired
    private GradeMapperSerivce gradeMapperSerivce;



    /*@RequestMapping("/fen")
    public String  fenye(@RequestParam(name="p",defaultValue ="0") Integer p,ModelMap modelMap){
        Page<Student> slist=studentMapperSerivce.findbypage(p, 8);
        int page1;
        int page2;
        //当在第一页时，点击上一页，页面不动，点击下一页，页面加一
       if(p==0){
           page1=0;
           page2=p+1;

       }
       //当页面为最后一页时，点击上一页，页面减一，点击下一页，页面不变
        else if(p==slist.getTotalPages()-1){
           page1=p-1;
           page2=p;
       }
        else {
           page1 = p - 1;
           page2 = p + 1;
       }
            modelMap.put("page1",page1);
            modelMap.put("page2",page2);
            modelMap.put("slist",slist);
        return "index2";

    }
*/


    @RequestMapping("/fen1")
    public String  fenye1(@RequestParam(name="p",defaultValue ="0") Integer p,ModelMap modelMap){
        Page<StudentVo> slist1=studentMapperSerivce.findbypage1(p, 8);
        int page1;
        int page2;
        //当在第一页时，点击上一页，页面不动，点击下一页，页面加一
        if(p==0){
            page1=0;
            page2=p+1;

        }
        //当页面为最后一页时，点击上一页，页面减一，点击下一页，页面不变
        else if(p==slist1.getTotalPages()-1){
            page1=p-1;
            page2=p;
        }
        else {
            page1 = p - 1;
            page2 = p + 1;
        }
        modelMap.put("page1",page1);
        modelMap.put("page2",page2);
        modelMap.put("slist1",slist1);
        return "index2";

    }



    @RequestMapping("/add")
    @ResponseBody
    public boolean zengjia (Student student,ModelMap modelMap){
        boolean bo=studentMapperSerivce.add(student);
           return bo;
    }
    @RequestMapping("/toadd1")
    public String  xinzeng (ModelMap modelMap){
        List<Grade> list1=gradeMapperSerivce.find();
        modelMap.put("list1",list1);
        return "xinzeng1";
    }

    //删除
    @RequestMapping("/shanchu")
    @ResponseBody
    public boolean shanchu (@RequestParam("studentNo") Integer studentNo){
        try{
            boolean bo=studentMapperSerivce.detele(studentNo);
               return bo;
           }catch(Exception e){
               return false;
        }
    }
        //c查找信息
       @RequestMapping("/toupdate")
     public String togengxin (@RequestParam("studentNo") Integer studentNo,ModelMap modelMap){
           List<Grade> list1=gradeMapperSerivce.find();
           modelMap.put("list1",list1);
            Map map=new HashMap();
            map.put("studentNo",studentNo);
            List<Student> list=studentMapperSerivce.cha(map);
            if(list.size()==1)
              modelMap.put("student",list.get(0));
               return "gengxin";

    }
    @RequestMapping("/update")
    @ResponseBody
    public boolean gengxin (Student student){

        try{
            boolean bo=studentMapperSerivce.update(student);
             return bo;
        }catch(Exception e){
            return false;
        }

    }

    @RequestMapping("/chaxun1")
    @ResponseBody
    public int chaxun (@RequestParam("studentNo") Integer studentNo,@RequestParam("studentName") String studentName,ModelMap modelMap){
        Map map=new HashMap();
        map.put("studentNo",studentNo);
        map.put("studentName",studentName);
        List<Student> list=studentMapperSerivce.cha(map);
           return list.size();
    }


}

