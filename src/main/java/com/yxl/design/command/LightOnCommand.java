package com.yxl.design.command;

/**
 * @author yxl
 * @version 1.0
 * @date 2021/2/9 下午1:02
 */
public class LightOnCommand implements Command{


    LightReceiver lightReceiver;

    //构造器
    public LightOnCommand(LightReceiver lightReceiver) {
        this.lightReceiver = lightReceiver;
    }

    @Override
    public void execute() {
        //调用接收者的方法
        lightReceiver.on();
    }

    @Override
    public void undo() {
        //调用接收者的方法
        lightReceiver.off();
    }
}
