package com.tangguna.rxhttputils.rxhttputils;


import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;


public interface ApiService {
    /**
     * 登录
     * @param account
     *         用户名
     * @param password
     *         密码
     * @return
     */
    @FormUrlEncoded
    @POST("app/appLogin")
    Observable<UserBean> postLogin(@Field("account") String account, @Field("password") String password);
}
