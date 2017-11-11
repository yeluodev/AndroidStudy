package com.yeluodev.fastdevlib.imageloader;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;

/**
 * 类描述  Picasso
 * 作者   yeluodev1226
 * 创建时间 2017/11/11 19:59
 * 修改人  yeluodev1226
 * 修改时间 2017/11/11 19:59
 * 备注
 */
public class PicassoImageLoaderProvider extends BaseImageLoaderProvider {
    @Override
    public void loadImage(Context context, ImageLoader loader) {
        loadNormal(context,loader);
    }

    /**
     * 使用Picasso加载图片（无占位图）
     * @param context
     * @param img
     */
    private void loadNormal(Context context, ImageLoader img) {
        RequestCreator req;
        if (TextUtils.isEmpty(img.getUrl())) {
            req = Picasso.with(context)
                    .load(img.getRes());
        } else {
            req = Picasso.with(context)
                    .load(img.getUrl());
        }

        if(img.getPlaceHolder()!=0){
            req = req.placeholder(img.getPlaceHolder());
        }

        if (img.isFitType()) {
            req = req.fit();
        }

        req.config(Bitmap.Config.RGB_565).into(img.getImageView());
    }
}
