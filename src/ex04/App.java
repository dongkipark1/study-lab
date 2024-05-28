package ex04;

import ex04.teacher.HtmlTeacher;
import ex04.teacher.JavaTeacher;
import ex04.teacher.PythonTeacher;

public class App {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();
        HtmlTeacher ht = new HtmlTeacher();
        pt.수업하기();
    }
}
