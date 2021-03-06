package com.lol;

public class MatchProtocol {
    /**
     * 申请进入匹配
     */
    public static final int ENTER_CREQ = 0;
    /**
     * 返回申请结果
     */
    public static final int ENTER_SRES = 1;
    /**
     * 申请离开匹配
     */
    public static final int LEAVE_CREQ = 2;
    /**
     * 返回离开结果
     */
    public static final int LEAVE_SRES = 3;
    /**
     * 匹配完毕，通知进入 选择界面广播
     */
    public static final int ENTER_SELECT_BRO = 4;
}