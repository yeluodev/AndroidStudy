package com.yeluodev.fastdevlib.imageloader;

import android.content.Context;

/**
 * 类描述  图片加载抽象类
 * 作者   yeluodev1226
 * 创建时间 2017/11/11 19:58
 * 修改人  yeluodev1226
 * 修改时间 2017/11/11 19:58
 * 备注
 */
public abstract class BaseImageLoaderProvider {
    public abstract void loadImage(Context context, ImageLoader loader);
}
