package com.zihao.task1.Controller;

import com.zihao.task1.entity.Building;
import com.zihao.task1.entity.Guarantee;
import com.zihao.task1.entity.User;
import com.zihao.task1.mapper.BuildingMapper;
import com.zihao.task1.mapper.GuaranteeMapper;
import com.zihao.task1.mapper.GuaranteeQueryApplier;
import com.zihao.task1.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserControllerTest {
    @Autowired
    private UserController userController;

    @Test
    void createUser() {
        User user = new User();
        user.setPhone("abc");
        ResponseEntity<?> response = userController.createUser(user);
        System.out.println(response.getBody());
    }

    @Test
    void queryapplier() {
        User user = new User();
        user.setXing("李");
        user.setMing("四");
        HashMap map = new HashMap();
        map.put("xing",user.getXing());
        map.put("ming",user.getMing());
        System.out.println(map);
        List list = userController.queryapplier(map);
        System.out.println(list);
    }

    @Test
    void createGuarantee() {
    }

    @Test
    void createBuilding() {
    }
}