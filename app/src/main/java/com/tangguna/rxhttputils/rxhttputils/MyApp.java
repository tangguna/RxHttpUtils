package com.tangguna.rxhttputils.rxhttputils;

import android.app.Application;

import com.tangguna.rxhttputils.library.RxHttp;


public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        RxHttp.init(this);

        RxHttp.getInstance()
                //基地址
                .setBaseUrl("")//基地址
                //打印日志
                .debug("输出",true)
                //超时设置
                .setReadTimeOut(30 * 1000)
                .setWriteTimeOut(30 * 1000)
                .setConnectTimeout(30 * 1000)
                //设置超时重连次数
                .setRetryCount(3)
                //设置超时重试连接间隔
                .setRetryDelay(500);
//                //可以全局统一设置缓存模式,默认是不使用缓存,可以不传,具体请看CacheMode
//                .setCacheMode(CacheMode.NO_CACHE)
//                //可以全局统一设置缓存时间,默认永不过期 -1表示永久缓存,单位:秒 ，Okhttp和自定义RxCache缓存都起作用
//                .setCacheTime(-1)
//                //全局设置自定义缓存保存转换器，主要针对自定义RxCache缓存
//                .setCacheDiskConverter(new SerializableDiskConverter())//默认缓存使用序列化转化
//                //全局设置自定义缓存大小，默认50M
//                .setCacheMaxSize(100 * 1024 * 1024)//设置缓存大小为100M
//                //设置缓存版本，如果缓存有变化，修改版本后，缓存就不会被加载。特别是用于版本重大升级时缓存不能使用的情况
//                .setCacheVersion(1)//缓存版本为1
//                //可以设置https的证书,以下几种方案根据需要自己设置
//                .setCertificates()
//                .addCommonHeaders(null)//设置全局公共头
//                .addCommonParams(null);//设置全局公共参数
//                .addNetworkInterceptor(new NoCacheInterceptor())//设置网络拦截器
//                .setCookieStore();//设置cookie
                //.setCallFactory()//局设置Retrofit对象Factory
                //.setHttpCache(new Cache())//设置Okhttp缓存，在缓存模式为DEFAULT才起作用
                //.setCertificates(new SafeTrustManager())            //方法二：自定义信任规则，校验服务端证书
                //配置https的域名匹配规则，不需要就不要加入，使用不当会导致https握手失败
                //.setHostnameVerifier(new SafeHostnameVerifier())
                //.addConverterFactory(GsonConverterFactory.create(gson))//本框架没有采用Retrofit的Gson转化，所以不用配置
                //.setOkproxy()//设置全局代理
                //.setOkconnectionPool()//设置请求连接池
                //.setCallbackExecutor()//全局设置Retrofit callbackExecutor
                //可以添加全局拦截器，不需要就不要加入，错误写法直接导致任何回调不执行
                //.addInterceptor(new GzipRequestInterceptor())//开启post数据进行gzip后发送给服务器
//                .addInterceptor(new CustomSignInterceptor());//添加参数签名拦截器
    }
}
