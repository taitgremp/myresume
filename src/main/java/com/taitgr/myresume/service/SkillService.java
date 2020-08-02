package com.taitgr.myresume.service;

import com.taitgr.myresume.dao.SkillDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * SkillService
 *
 * @author Gabriel Tait (gatait)
 * @since 4.
 *  
 */

@Service
public class SkillService {

    private SkillDao skillDao;
}
