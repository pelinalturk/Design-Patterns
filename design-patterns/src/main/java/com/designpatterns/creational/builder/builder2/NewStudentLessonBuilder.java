package com.designpatterns.creational.builder.builder2;

public class NewStudentLessonBuilder extends LessonBuilder{
    @Override
    public void getLesson() {
        lesson = new Lesson();
        lesson.id = 1;
        lesson.name = "Artificial Intelligence -  Beginner to Advanced in 10 Minute.";
        lesson.price = 49.99;
    }

    @Override
    public void applyDiscount() {
        lesson.discountedPrice = lesson.price * 0.5;
        lesson.discountApplied = true;
    }

    @Override
    public void addLessonNote() {
        lesson.lessonNote = "Hey, welcome. Your discount code has been applied!";
    }

    @Override
    public Lesson getResult() {
        return lesson;
    }
}
