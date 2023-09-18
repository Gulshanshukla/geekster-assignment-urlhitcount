package com.geekster.UrlHitCounterApplication.Service;

import com.geekster.UrlHitCounterApplication.Entity.UrlHitCounter;
import com.geekster.UrlHitCounterApplication.Repository.UrlHitRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UrlHitService {
    @Autowired
    UrlHitRepo urlHitRepo;

    public List<UrlHitCounter> getAllVisitors() {
        return urlHitRepo.getUrlHitCounter();
    }

    public String addVisitor(UrlHitCounter user) {
        List<UrlHitCounter> visitorlist = getAllVisitors();
        for (UrlHitCounter u : visitorlist) {
            if (u.getUserName().equals(user.getUserName())) {
                u.setCounter(u.getCounter() + 1);
                return "Cannot add the same visitor count updated";
            }
        }

        return "welcome to our website";
    }
        public String getCountOfVisitors()
        {
            List<UrlHitCounter> li=getAllVisitors();
            return "visitors:" +li.size();
        }
        public UrlHitCounter getAVisitor(String username)
        {
            List<UrlHitCounter> visitorList=getAllVisitors();
            for(UrlHitCounter u:visitorList)
            {
                if(u.getUserName().equals(username))
                {
                    return u;
                }
            }
            throw new IllegalStateException("User not found");
        }
        public String CountUpdated(String username)
        {
            List<UrlHitCounter> visitorlist=getAllVisitors();
            for(UrlHitCounter u:visitorlist)
            {
                if(u.getUserName().equals(username))
                {
                    u.setCounter(u.getCounter()+1);
                    return "welcome back ";
                }
            }
            return "user not found new user";
        }
    }






