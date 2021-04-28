package com.xiangwen.test;

import com.xiangwen.model.ClassNew;
import com.xiangwen.model.Student;
import com.xiangwen.model.Teacher;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student(1,21,3,"张三");
        Student stu2= new Student(2,22,3,"李四");
        List<Student> lists=new ArrayList<Student>();
        lists.add(stu);
        lists.add(stu2);
        ClassNew classNew=new ClassNew();
        classNew.setClassId(101);
        classNew.setClassName("101班");
        classNew.setStudents(lists);
        System.out.println(classNew);
        try {
            javaToxml(classNew);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void javaToxml(ClassNew classNew) throws Exception {
        // 获取JAXB的上下文环境，需要传入具体的 Java bean -> 这里使用Student
        JAXBContext context = JAXBContext.newInstance(Student.class);
        // 创建 Marshaller 实例
        Marshaller marshaller = context.createMarshaller();
        // 设置转换参数 -> 这里举例是告诉序列化器是否格式化输出
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        // 构建输出环境 -> 这里使用标准输出，输出到控制台Console
        PrintStream out = System.out;
        // 将所需对象序列化 -> 该方法没有返回值
        marshaller.marshal(classNew, out);
    }
}
