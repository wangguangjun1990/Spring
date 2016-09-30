package com.wang.serivce;

import com.wang.dao.entity.Grade;
import com.wang.dao.entity.Student;
import com.wang.dao.mapper.GradeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2016/9/29.
 */
@Service

public class GradeMapperSerivce {
    @Autowired
    private GradeMapper gradeMapper;

    public List<Grade> find(){
        List<Grade> list=gradeMapper.searchGradeByParams(null);
           return list;

    }
}
