package com.youngchan.xml;

import com.youngchan.management.domain.Student;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author youngchan
 * @version V1.0
 * @Package com.youngchan.xml
 * @date 2022/11/21 20:30
 * @Description //在配置文件中获取 信息 并输出   文件位置在JAVA_SE/xml/student.xml   dtd约束在Student.dtd scheam约束在Student.xsd
 */
public class XMLReview {
    public static void main(String[] args) {
        try {
            // 这里使用dom4j 的SAXReader Document 和Element 获取xml文件信息
            SAXReader reader = new SAXReader();
            Document document = reader.read(new File("JAVA_SE\\xml\\student.xml"));
            // 获取document树的根节点
            Element rootElement = document.getRootElement();
            Element message = rootElement.element("message");
            System.out.println(message.getData());
            List<Element> studentsElement = rootElement.elements("student");
            List<Student> studentList = new ArrayList<>();
            for (Element element : studentsElement) {
                //获取 属性
                String uId = element.attributeValue("uId");
                Integer age =Integer.parseInt(element.attributeValue("age")) ;
                //                获取节点信息
                String name = element.element("name").getText();
                Double weight = Double.parseDouble(element.element("weight").getText());
                Double height = Double.parseDouble(element.element("height").getText());
                String gender = element.element("gender").getText();
                studentList.add(new Student(uId,name,age,gender,height,weight));
            }
            System.out.println(studentList);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
    }
}
