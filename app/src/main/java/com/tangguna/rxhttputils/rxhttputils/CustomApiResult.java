package com.tangguna.rxhttputils.rxhttputils;

import com.tangguna.rxhttputils.library.model.ApiResult;

public class CustomApiResult<T>  extends ApiResult<T>{
    private boolean flag;
    private  T result;
    private String message;

    public CustomApiResult<T>setResult(T result) {
        this.result = result;
        return this;
    }


    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public T getData() {
        return result;
    }

    @Override
    public void setData(T result) {
        this.result = result;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
