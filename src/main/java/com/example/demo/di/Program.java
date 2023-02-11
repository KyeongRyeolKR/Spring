package com.example.demo.di;

import com.example.demo.di.entity.Exam;
import com.example.demo.di.entity.NewlecExam;
import com.example.demo.di.ui.ExamConsole;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {

//        Exam exam = new NewlecExam();
//        ExamConsole console = new GridExamConsole();
//
//        console.setExam(exam);

        ApplicationContext context =
                new ClassPathXmlApplicationContext("setting.xml");

        Exam exam = context.getBean(Exam.class);
        System.out.println(exam.toString());

        ExamConsole console = (ExamConsole) context.getBean("console");
//        ExamConsole console = context.getBean(ExamConsole.class);

        console.print();

        List<Exam> exams = (List<Exam>) context.getBean("exams");//new ArrayList<>();
//        exams.add(new NewlecExam(1,1,1,1));

        for(Exam e : exams){
            System.out.println(e);
        }
    }
}
