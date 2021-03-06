package com.tangguna.rxhttputils.library.cache.stategy;


import com.tangguna.rxhttputils.library.cache.RxCache;
import com.tangguna.rxhttputils.library.cache.model.CacheResult;

import java.lang.reflect.Type;
import java.util.Arrays;

import io.reactivex.Observable;


/**
 * <p>描述：先请求网络，网络请求失败，再加载缓存</p>
 */
public final class FirstRemoteStrategy extends BaseStrategy {
    @Override
    public <T> Observable<CacheResult<T>> execute(RxCache rxCache, String key, long time, Observable<T> source, Type type) {
        Observable<CacheResult<T>> cache = loadCache(rxCache, type, key, time, true);
        Observable<CacheResult<T>> remote = loadRemote(rxCache, key, source, false);
        //return remote.switchIfEmpty(cache);
        return Observable
                .concatDelayError(Arrays.asList(remote, cache))
                .take(1);
    }
}
