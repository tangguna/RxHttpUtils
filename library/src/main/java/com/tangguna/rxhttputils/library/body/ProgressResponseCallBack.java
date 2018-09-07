package com.tangguna.rxhttputils.library.body;

/**
 * 上传进度回调接口
 */
public interface ProgressResponseCallBack {
    /**
     * 回调进度
     * @param bytesWritten  当前读取响应体字节长度
     * @param contentLength 总长度
     * @param done          是否读取完成
     */
    void onResponseProgress(long bytesWritten, long contentLength, boolean done);
}
