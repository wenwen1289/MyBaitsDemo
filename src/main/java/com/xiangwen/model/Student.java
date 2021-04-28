package com.xiangwen.model;

import lombok.Data;
import lombok.ToString;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@ToString
@XmlRootElement
public class Student {
    private int stuId;
    private int stuAge;
    private int classId;
    private String stuName;

    public Student(int stuId, int stuAge, int classId, String stuName) {
        this.stuId = stuId;
        this.stuAge = stuAge;
        this.classId = classId;
        this.stuName = stuName;
    }

    public Student() {
    }
}
