package com.proj1.controller;


import com.proj1.entity.User;
import com.proj1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    //在控制层注入业务层 コントロール層にサービス層を注入する
    @Autowired
    private UserService userService;

    @PostMapping("add")     //设置方法的请求路径　メソッドのポストパスの設定
    public ResponseEntity<?> createUser(@RequestBody User user) {

        //判断输入框的值是否为空值
        //フォーム入力ボックスの値がNULL値かどうかを判断する
        if (user.getXing()== null || user.getXing().isEmpty()) {
            return ResponseEntity.badRequest().body("姓（漢字）を入力してください。");
        }
        if (user.getMing()== null || user.getMing().isEmpty()) {
            return ResponseEntity.badRequest().body("名（漢字）を入力してください。");
        }
        if (user.getSei()== null || user.getSei().isEmpty()) {
            return ResponseEntity.badRequest().body("セイを入力してください。");
        }
       if (user.getMei()== null || user.getMei().isEmpty()) {
            return ResponseEntity.badRequest().body("メイを入力してください。");
        }
        if (user.getRomasei()== null || user.getRomasei().isEmpty()) {
            return ResponseEntity.badRequest().body("姓（ローマ字）を入力してください。");
        }
         if (user.getRomamei()== null || user.getRomamei().isEmpty()) {
            return ResponseEntity.badRequest().body("名（ローマ字）を入力してください。");
        }
        if (user.getCountry()== null || user.getCountry().isEmpty()) {
            return ResponseEntity.badRequest().body("国籍を選択してください。");
        }
         if (user.getSex()== null || user.getSex().isEmpty()) {
            return ResponseEntity.badRequest().body("性別を選んでください。");
        }
        if (user.getBirth()== null || user.getBirth().isEmpty()) {
            return ResponseEntity.badRequest().body("生年月日を入力してください。");
        }
        if (user.getTel()== null || user.getTel().isEmpty()) {
            return ResponseEntity.badRequest().body("電話番号を入力してください。");
        }

         if (user.getPhone()== null || user.getPhone().isEmpty()) {
            return ResponseEntity.badRequest().body("電話番号を入力してください。");
        }
         if (user.getJob()== null || user.getJob().isEmpty()) {
            return ResponseEntity.badRequest().body("職業を選んでください。");
        }
        // 所有信息都正确的话就传输到数据库
        // すべての情報が正しい場合は、データベースに転送する
         userService.save(user);
        return ResponseEntity.ok("保存成功");}
    }




