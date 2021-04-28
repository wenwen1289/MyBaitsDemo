package com.xiangwen.model;

public class ClassModel {
    private int classId;
    private String className;
    private Teacher teacher;
    public int getClassId() {
        return classId;
    }

    public void setClassId(int calssId) {
        this.classId = calssId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "ClassModel{" +
                "calssId=" + classId +
                ", className='" + className + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}
