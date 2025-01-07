package com.LogicMatter.demo.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name ="name",nullable = false)
    private String name;

    @Column(name = "english")
    private int englishMarks;

    @Column(name = "maths")
    private int mathMarks;

    @Column(name = "science")
    private int scienceMarks;

    @Column(name = "social_science")
    private int socialScienceMarks;

    public Student() {}

    public Student(String name, int englishMarks, int mathMarks, int scienceMarks, int socialScienceMarks) {
        this.name = name;
        this.englishMarks = englishMarks;
        this.mathMarks = mathMarks;
        this.scienceMarks = scienceMarks;
        this.socialScienceMarks = socialScienceMarks;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEnglishMarks() {
        return englishMarks;
    }
    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }
    public int getMathMarks() {
        return mathMarks;
    }
    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }
    public int getScienceMarks() {
        return scienceMarks;
    }
    public void setScienceMarks(int scienceMarks) {
        this.scienceMarks = scienceMarks;
    }
    public int getSocialScienceMarks() {
        return socialScienceMarks;
    }
    public void setSocialScienceMarks(int socialScienceMarks) {
        this.socialScienceMarks = socialScienceMarks;
    }
}

