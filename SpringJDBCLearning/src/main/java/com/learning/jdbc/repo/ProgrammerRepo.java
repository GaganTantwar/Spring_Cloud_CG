package com.learning.jdbc.repo;

import com.learning.jdbc.model.Programmer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import java.util.*;
@Repository
public class ProgrammerRepo {

    @Autowired
    private JdbcTemplate template;
    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public void save(Programmer programmer){
        System.out.println("Data Saved");
        String sql="insert into Programmer (id,name,tech) values(?,?,?)";
        int rows=template.update(sql,programmer.getId(),programmer.getName(),programmer.getTech());

        System.out.println("Rows Affected: "+rows);
    }
    public List<Programmer>findAll(){
        String sql="select *from Programmer";
        RowMapper<Programmer> mapper=(rs, rowNum)->{
                Programmer p=new Programmer();
                p.setId(rs.getInt(1));
                p.setName(rs.getString(2));
                p.setTech(rs.getString(3));
                return p;
        };
        List<Programmer> programmers=template.query(sql,mapper);
        return programmers;
    }
}
