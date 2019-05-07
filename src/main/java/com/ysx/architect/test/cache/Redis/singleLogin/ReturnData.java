package com.ysx.architect.test.cache.Redis.singleLogin;

public class ReturnData {

    private int returnCode;
    private User user;
    private String strMessage;

    public ReturnData(int returnCode,User user,String strMessage){
        this.returnCode = returnCode;
        this.user = user;
        this.strMessage = strMessage;
    }
    public ReturnData(int returnCode,String strUser,String strMessage){
        this.returnCode = returnCode;
        this.user = null;
        this.strMessage = strMessage;
    }

}
