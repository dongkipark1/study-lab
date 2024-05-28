package ex05;

import ex05.teacher.HtmlTeacher;
import ex05.teacher.JavaTeacher;
import ex05.teacher.PythonTeacher;

public class App {
    public static void main(String[] args) {
        JavaTeacher jt = new JavaTeacher();
        PythonTeacher pt = new PythonTeacher();
        HtmlTeacher ht = new HtmlTeacher();
        pt.수업하기();
    }
}
