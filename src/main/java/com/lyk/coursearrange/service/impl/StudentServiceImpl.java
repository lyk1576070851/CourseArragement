package com.lyk.coursearrange.service.impl;

import com.lyk.coursearrange.entity.Student;
import com.lyk.coursearrange.dao.StudentDao;
import com.lyk.coursearrange.service.StudentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lequal
 * @since 2020-03-13
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentDao, Student> implements StudentService {

}
