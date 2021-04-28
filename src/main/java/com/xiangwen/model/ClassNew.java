package com.xiangwen.model;

import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@ToString
@Data
//@XmlRootElement
public class ClassNew {
    private int classId;
    private String className;
    private List<Student> students;
}
