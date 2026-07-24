package com.kru.ui;

import javax.swing.*;

public class GameJFrame extends JFrame {
    // JFrame 界面，窗体
    // 子类呢？也表示界面，窗体
    // 规定：GameJFrame就是游戏的主界面
    // 以后跟游戏相关的所有逻辑写在这个类中

    public GameJFrame() {
        // 初始化界面
        initJFrame();

        initJMenuBar();
    }

    private void initJMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        // 创建选项下面的条目对象
        JMenuItem replayItem = new JMenuItem("重新游戏");
        JMenuItem reLoginItem = new JMenuItem("重新登录");
        JMenuItem closeItem = new JMenuItem("关闭游戏");

        JMenuItem accountItem = new JMenuItem("公众号");

        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        aboutJMenu.add(accountItem);

        // 将菜单里面的两个选项添加到菜单当中
        menuBar.add(functionJMenu);
        menuBar.add(aboutJMenu);

        this.setJMenuBar(menuBar);

        this.setVisible(true);
    }

    private void initJFrame() {
        // 设置界面的宽高
        this.setSize(603,680);
        // 设置界面的标题
        this.setTitle("拼图单机版 v1.0");
        // 设置界面置顶
        this.setAlwaysOnTop(true);
        // 设置界面居中
        this.setLocationRelativeTo(null);
        // 设置默认的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 3
    }
}
