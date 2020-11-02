package com.blkstone;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blkstone.mapper.AgentMapper;
import com.blkstone.pojo.ArkAgent;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ArknightApplicationTests {

    @Autowired
    public AgentMapper agentMapper;

    @Test
    void getAllAgents() {
        List<ArkAgent> list = agentMapper.selectList(null);
        System.out.println(list.toString());
    }

    @Test
    void insertAgent(){
        ArkAgent test = new ArkAgent();
        test.setName("test");
        agentMapper.insert(test);
    }

    @Test
    void deleteAgent(){
        agentMapper.deleteById(1323185341622976514L);
    }

    @Test
    void getAgentById(){
        ArkAgent arkAgent = agentMapper.selectOne(new QueryWrapper<ArkAgent>().eq("id", 1));
        System.out.println(arkAgent.toString());
    }
}
