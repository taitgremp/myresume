package com.taitgr.myresume.controllers;

import com.taitgr.myresume.dao.SkillDaoImpl;
import com.taitgr.myresume.models.Skill;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * SkillsController
 *
 * @author Gabriel Tait (gatait)
 * @since 4.
 *  
 */
@RestController
@RequestMapping("/skills")
public class SkillsController {

    @Autowired
    private SkillDaoImpl skillDaoImpl;

    @RequestMapping(method = RequestMethod.GET)
    public List<Skill> getAllSkills() {
        return skillDaoImpl.getAllSkills();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Skill getSkill(@PathVariable("id") Long id) {
        return skillDaoImpl.getSkill(id);
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createSkill(@RequestBody Skill skill) {
        skillDaoImpl.createSkill(skill);
    }

    @RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateSkill(@RequestBody Skill skill) {
        skillDaoImpl.updateSkill(skill);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteSkill(@PathVariable("id") Long id) {
        skillDaoImpl.deleteSkill(id);
    }
}
