package com.tangguna.rxhttputils.rxhttputils;

import android.Manifest;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.tangguna.rxhttputils.library.RxHttp;

import com.tangguna.rxhttputils.library.callback.CallBack;
import com.tangguna.rxhttputils.library.callback.CallClazzProxy;
import com.tangguna.rxhttputils.library.exception.ApiException;

import com.tangguna.rxhttputils.library.permission.OnPermissionCallback;
import com.tangguna.rxhttputils.library.permission.PermissionManager;
import com.tangguna.rxhttputils.library.utils.HttpLog;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PermissionManager.instance().request(this, new OnPermissionCallback() {
            @Override
            public void onRequestAllow(String permissionName) {

            }

            @Override
            public void onRequestRefuse(String permissionName) {

            }

            @Override
            public void onRequestNoAsk(String permissionName) {

            }
        }, Manifest.permission.CALL_PHONE);

        RxHttp.post("app/appLogin")
                .params("account","13088888888")
                .params("password","12345678")
                .execute(new CallBack<String>() {

                    @Override
                    public void onStart() {

                    }

                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(ApiException e) {

                    }

                    @Override
                    public void onSuccess(String s) {
                        HttpLog.e(s.toString());
                    }
                });
    }
}
