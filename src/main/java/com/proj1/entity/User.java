package com.proj1.entity;

import lombok.Data;

@Data
public class User {

    private String xing; // 姓（漢字）
    private String ming; // 名（漢字）
    private String sei; // セイ
    private String mei; // メイ
    private String romasei;// 姓（ローマ字）
    private String romamei;// 名（ローマ字）
    private String country;// 国籍
    private String sex ; // 性別
    private String birth; // 生年月日
    private String tel; // 電話番号
    private String phone; // 携帯電話
    private String job; // 職業
    private String address; // 勤務先
}
