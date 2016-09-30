package com.wang.dao.mapper;

		import java.util.List;
		import java.util.Map;

		import com.wang.dao.vo.StudentVo;
		import org.apache.ibatis.annotations.Param;
		import com.wang.dao.entity.Student;
		import com.fc.platform.commons.page.Page;
		import com.fc.platform.commons.page.Pageable;

public interface StudentMapper {

	boolean insertStudent(Student student);

	boolean deleteStudentByStudentNo(Integer studentNo);

	boolean updateStudent(Student student);

	Page<Student> searchStudentByParams(@Param("map") Map<String, String> map, Pageable pageable);

	List<Student> searchStudentByParams(@Param("map") Map<String, String> map);

	Page<StudentVo> searchStudentByParams1(@Param("map") Map<String, String> map, Pageable pageable);
}
