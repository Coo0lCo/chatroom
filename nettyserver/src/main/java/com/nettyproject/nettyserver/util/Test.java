package com.nettyproject.nettyserver.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.nettyproject.nettyserver.enums.JsonKeyEnum;
import com.nettyproject.nettyserver.pojo.GroupChatMessage;

/**
 * @Author:SCBC_LiYongJie
 * @time:2022/1/30
 */

public class Test {
    public static void main(String[] args) {

        String model_Json = "{\n" +
                "    \"type\":\"1\",\n" +
                "    \"data\":{\"token\":\"1298h1u2dnui1ni\",\n" +
                "    \"sender\":\"123213213das\",\n" +
                "    \"receivers\":[\"1279897g1dh91\",\"187gd871d81\",\"12jiiii1dn\",\"18912h1bu2d\",\"12iufv291bi\"]}\n" +
                "}";

        JSONObject jsonObject = JSON.parseObject(model_Json);

        System.out.println("type:" + jsonObject.get(JsonKeyEnum.TYPE.getKey()));

        GroupChatMessage groupChatMessage = jsonObject.getObject(JsonKeyEnum.DATA.getKey(), GroupChatMessage.class);

        System.out.println(groupChatMessage.toString());

        System.out.println(groupChatMessage.getReceivers().toString());
    }
}
class a{
    public static void main(String[] args) {
        System.out.println(JwtUtil.generateToken("Niu","13266746455"));
        System.out.println(JwtUtil.generateToken("Baby","13266746454"));
        System.out.println(JwtUtil.generateToken("Hello","13266746453"));
        System.out.println(JwtUtil.generateToken("SanSha","13266746452"));
        System.out.println(JwtUtil.generateToken("ShaGou","13266746451"));
    }
}