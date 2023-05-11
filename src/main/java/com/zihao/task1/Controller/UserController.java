package com.zihao.task1.Controller;

import com.zihao.task1.entity.Building;
import com.zihao.task1.entity.Guarantee;
import com.zihao.task1.entity.User;
import com.zihao.task1.service.BuildingService;
import com.zihao.task1.service.GuaranteeQueryApplierService;
import com.zihao.task1.service.GuaranteeSerive;
import com.zihao.task1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private GuaranteeQueryApplierService guaranteeQueryApplierService;
    @Autowired
    private GuaranteeSerive guaranteeSerive;
    @Autowired
    private BuildingService buildingService;

    @PostMapping("add")
    public ResponseEntity<?> createUser(@RequestBody User user){

        userService.save(user);
        return ResponseEntity.ok("保存成功");
    }
    @RequestMapping(value = "queryapplier",method = RequestMethod.POST)
    public List<User> queryapplier(@RequestBody Map<String, String> map){
        List<User> listseimei = guaranteeQueryApplierService.QueryApplier(map.get("xing"), map.get("ming"));
        return listseimei;
    }
    @PostMapping("addguarantee")
    public ResponseEntity<?> createGuarantee(@RequestBody Guarantee guarantee){
        guaranteeSerive.saveguarantee(guarantee);
        return ResponseEntity.ok("保存成功");
    }
    @PostMapping("addbuilding")
    public ResponseEntity<?> createBuilding(@RequestBody Building building){
        buildingService.savebuilding(building);
        return ResponseEntity.ok("保存成功");
    }
}

