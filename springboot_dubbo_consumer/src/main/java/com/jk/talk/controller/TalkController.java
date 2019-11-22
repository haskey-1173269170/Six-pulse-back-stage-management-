package com.jk.talk.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jk.talk.service.TalkService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("talk")
public class TalkController {

    @Reference(version = "1.0")
    private TalkService talkService;

    @RequestMapping("queryTalk")
    @ResponseBody
    public List queryTalk(Model model, Integer id, HttpServletRequest request){
        HttpSession session = request.getSession();
//         Integer id= (User)session.getAttribute(session.getId()).getUserId();
        List list = talkService.queryTalk(id);
        return list;
    }
}
