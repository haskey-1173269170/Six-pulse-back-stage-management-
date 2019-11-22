package com.jk.talk.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.jk.talk.mapper.TalkMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service(version = "1.0")
public class TalkServiceImpl  implements  TalkService {

    @Autowired
    private TalkMapper talkMapper;

    @Override
    public List queryTalk(Integer id) {

        return talkMapper.queryTalk(id);
    }
}
