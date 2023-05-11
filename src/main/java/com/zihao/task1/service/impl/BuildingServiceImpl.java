package com.zihao.task1.service.impl;

import com.zihao.task1.entity.Building;
import com.zihao.task1.mapper.BuildingMapper;
import com.zihao.task1.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuildingServiceImpl implements BuildingService {
    @Autowired
    private BuildingMapper buildingMapper;

    @Override
    public void savebuilding(Building building){buildingMapper.insertBuilding(building);};
}
