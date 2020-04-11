package com.example.demo.model;
import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

public class Student implements Serializable{

    private static final long serialVersionUID = 1L;
    private long id;
    private String name;
    private String code;
    private Timestamp create_time;

    public Student() {
        super();
    }

    public Student(long id,String name, String code, Timestamp createtime) {
        super();
        this.id = id;
        this.name = name;
        this.code = code;
        this.create_time = createtime;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Timestamp getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Timestamp createtime) {
        this.create_time = createtime;
    }

    @Override
    public String toString() {
        return "name " + this.name + ", code " + this.code + "create_time " + this.create_time;
    }
}
