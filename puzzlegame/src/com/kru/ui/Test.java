package com.kru.ui;

import javax.swing.*;

public class Test {
    public static void main(String[] args) {
        // 创建一个游戏的主界面
        // JavaBean类描述界面的
        // 属性（宽 高） 行为
        // 上下左右移动的代码逻辑
        // 统计步数的代码逻辑
        // 一键通关
        // 查看最终效果
        // 恶搞好基友
        // ……
        JFrame gameJframe = new JFrame();
        gameJframe.setSize(603,680);
        // gameJframe.setVisible(true);

        // 创建一个登录界面
        // 获取用户输入的用户名
        // 获取用户输入的密码
        // 生成一个验证码
        // 获取用户输入的验证码
        // 比较用户名，密码，验证码

        JFrame loginJframe = new JFrame();
        loginJframe.setSize(488,430);
        loginJframe.setVisible(true);

        // 创建一个注册界面
        // 获取用户输入的用户名
        // 获取用户输入的密码（两次）
        // 比较两次的密码是否一致
        // 判断当前用户是否已经注册
        JFrame registerJframe = new JFrame();
        registerJframe.setSize(488,500);
        registerJframe.setVisible(true);

    }
}
