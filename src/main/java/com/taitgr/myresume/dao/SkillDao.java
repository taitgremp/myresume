package com.taitgr.myresume.dao;

import com.taitgr.myresume.models.Skill;

import java.util.List;

/**
 * SkillDat
 *
 * @author Gabriel Tait (gatait)
 * @since 4.
 *  
 */

public interface SkillDao {
    List<Skill> getAllSkills();

    Skill getSkill(Long id);

    void createSkill(Skill skill);

    void updateSkill(Skill skill);

    void deleteSkill(Long id);
}
