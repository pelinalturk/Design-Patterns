package com.designpatterns.creational.builder.builder2;

abstract class LessonBuilder {

    public Lesson lesson;

    public abstract void getLesson();
    public abstract void applyDiscount();
    public abstract void addLessonNote();
    public abstract Lesson getResult();
}
