package com.xiangwen.mapper;

import com.xiangwen.model.ClassModel;
import com.xiangwen.model.ClassNew;
import org.springframework.stereotype.Component;

@Component
public interface ClassModerMapper {
    ClassModel findById(int id);
    ClassModel findByIdTwo(int id);
    ClassNew findNewClass(int id);
    ClassNew findNewClassTwo(int id);
}
