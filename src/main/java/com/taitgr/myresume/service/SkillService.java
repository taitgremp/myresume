package com.taitgr.myresume.service;

import com.taitgr.myresume.dao.SkillDao;
import com.taitgr.myresume.dao.SkillDaoImpl;
import com.taitgr.myresume.models.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * SkillService
 *
 * @author Gabriel Tait (gatait)
 * @since 4.
 *  
 */

@Service
public class SkillService {

    @Autowired
    private SkillDaoImpl skillDaoImpl;

    public void create(Skill skill) {
        skillDaoImpl.createSkill(skill);
    }

    public List<Skill> getAllSkills() {
        return skillDaoImpl.getAllSkills();
    }

    public Skill getSkillById(Long id) {
        return skillDaoImpl.getSkill(id);
    }

    public void updateSkill(Skill skill) {
        skillDaoImpl.updateSkill(skill);
    }

    public void deleteSkill(Long id) {
        skillDaoImpl.deleteSkill(id);
    }
}
