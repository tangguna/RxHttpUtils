package com.tangguna.rxhttputils.library.func;


import com.tangguna.rxhttputils.library.cache.model.CacheResult;

import io.reactivex.annotations.NonNull;
import io.reactivex.functions.Function;

/**
 * <p>描述：缓存结果转换</p>

 */
public class CacheResultFunc<T> implements Function<CacheResult<T>, T> {
    @Override
    public T apply(@NonNull CacheResult<T> tCacheResult) throws Exception {
        return tCacheResult.data;
    }
}
