package com.tangguna.rxhttputils.rxhttputils;

import com.tangguna.rxhttputils.library.callback.CallBack;

public abstract class CustomCallBack<T> extends CallBack<T>{

    private String mUrl;

    public CustomCallBack() {
    }

//    @Override
//    public void onError(ApiException e) {
//        HttpLog.e(e);
//    }
}
