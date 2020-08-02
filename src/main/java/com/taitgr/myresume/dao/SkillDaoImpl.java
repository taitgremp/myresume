package com.taitgr.myresume.dao;

import com.taitgr.myresume.models.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

/**
 * SkillDaoImpl
 *
 * @author Gabriel Tait (gatait)
 * @since 4.
 *  
 */

@Repository("mysql")
public class SkillDaoImpl implements SkillDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static class SkillsRowMapper implements RowMapper<Skill> {

        @Override
        public Skill mapRow(ResultSet rs, int rowNum) throws SQLException {
            Skill skill = new Skill();
            skill.setId(rs.getLong("id"));
            skill.setName(rs.getString("name"));
            return skill;
        }
    }


    @Override
    public List<Skill> getAllSkills() {
        final String query = "SELECT * from skills";
        return jdbcTemplate.query(query, new SkillsRowMapper());
    }

    @Override
    public Skill getSkill(Long id) {
        final String query = "Select * from skills where id = ?";
        return jdbcTemplate.queryForObject(query, new SkillsRowMapper(), id);
    }

    @Override
    public void createSkill(Skill skill) {
        final String query = "Insert into skills (name) values (?)";
        jdbcTemplate.update(query, skill.getName());
    }

    @Override
    public void updateSkill(Skill skill) {
        final String query = "Update skills set name = ? where id = ?";
        jdbcTemplate.update(query, skill.getName(), skill.getId());
    }

    @Override
    public void deleteSkill(Long id) {
        final String query = "Delete from skills where id = ?";
        jdbcTemplate.update(query, id);
    }
}
