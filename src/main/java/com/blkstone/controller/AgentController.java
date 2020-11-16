package com.blkstone.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.blkstone.mapper.AgentMapper;
import com.blkstone.pojo.ArkAgent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agent")
public class AgentController {

    @Autowired
    AgentMapper agentMapper;

    @PostMapping("/getAll")
    public List<ArkAgent> getAll(){
        List<ArkAgent> list = agentMapper.selectList(null);
        return list;
    }

    @PostMapping("/getById")
    public ArkAgent getById(@RequestBody ArkAgent input){
        ArkAgent arkAgent = agentMapper.selectOne(new QueryWrapper<ArkAgent>().eq("id", input.getId()));
        return arkAgent;
    }

    @PostMapping("/addAgent")
    public void addAgent(@RequestBody ArkAgent input){
        agentMapper.insert(input);
    }
}
