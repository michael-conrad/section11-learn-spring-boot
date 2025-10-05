package com.michael_conrad.springboot.learn_spring_boot;

import java.util.Objects;

public class Course {
    private final int id;

    public String getName() {
        return name;
    }

    private final String name;

    public String getAuthor() {
        return author;
    }

    private final String author;

    public Course(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Course course)) return false;
        return getId() == course.getId() && Objects.equals(name, course.name) && Objects.equals(author, course.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), name, author);
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
