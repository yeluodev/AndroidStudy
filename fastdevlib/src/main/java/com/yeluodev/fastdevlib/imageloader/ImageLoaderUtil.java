package com.yeluodev.fastdevlib.imageloader;

import android.content.Context;

/**
 * 类描述  图片加载工具
 * 作者   yeluodev1226
 * 创建时间 2017/11/11 19:57
 * 修改人  yeluodev1226
 * 修改时间 2017/11/11 19:57
 * 备注
 */
public class ImageLoaderUtil {
    public static final int PIC_LARGE = 0;
    public static final int PIC_MEDIUM = 1;
    public static final int PIC_SMALL = 2;

    public static final int LOAD_STRATEGY_NORMAL = 0;
    public static final int LOAD_STRATEGY_ONLY_WIFI = 1;

    private static ImageLoaderUtil mInstance;
    private BaseImageLoaderProvider mProvider;

    private ImageLoaderUtil(){
        mProvider = new PicassoImageLoaderProvider();
    }

    public static ImageLoaderUtil getInstance(){
        if(mInstance==null){
            synchronized (ImageLoaderUtil.class){
                if(mInstance==null){
                    mInstance = new ImageLoaderUtil();
                    return mInstance;
                }
            }
        }
        return mInstance;
    }

    public void loadImage(Context context, ImageLoader loader){
        mProvider.loadImage(context,loader);
    }
}
