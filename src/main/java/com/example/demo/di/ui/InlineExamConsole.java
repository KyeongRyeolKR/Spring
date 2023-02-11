package com.example.demo.di.ui;

import com.example.demo.di.entity.Exam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("console")
public class InlineExamConsole implements ExamConsole {
    @Autowired
//    @Qualifier("exam2")
    private Exam exam;

    public InlineExamConsole() {
        System.out.println("constructor");
    }

    public InlineExamConsole(Exam exam) {
        System.out.println("overload constructor");
        this.exam = exam;
    }

    @Override
    public void print() {
        if(exam == null) {
            System.out.printf("total is %d, avg is %f\n", 0, 0.0);
        } else {
            System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());
        }
    }

    @Override
    public void setExam(Exam exam) {
        System.out.println("setter injection");
        this.exam = exam;
    }
}
