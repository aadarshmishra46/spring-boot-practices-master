package com.example.postgresql_demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao  {

    @Autowired
    private JdbcTemplate jdbcTemplate;
    public void createTable(){
        String querey="CREATE TABLE student123(id SERIAL PRIMARY KEY, name varchar(256) NOT NULL , city varchar(256))";
        int n=this.jdbcTemplate.update(querey);
        System.out.println(n+" table created");
    }

    //insert query
    public void insertData(String name,String city){
        String q="insert into student(name,city) values(?,?)";
        int n=this.jdbcTemplate.update(q,name,city);
        System.out.println(n+" rows added");
    }
    // update query
    public void updateData(long id){
        String q="update student set name='suresh' where id=@id";
        jdbcTemplate.update(q);
    }


    //delete query

    public void delete(long id){
        String q="delete from student where id=?";
        jdbcTemplate.update(q,id);
    }
}
