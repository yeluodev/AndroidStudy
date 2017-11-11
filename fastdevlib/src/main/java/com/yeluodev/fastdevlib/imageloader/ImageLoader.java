package com.yeluodev.fastdevlib.imageloader;

import android.content.Context;
import android.widget.ImageView;

/**
 * 类描述  图片加载入口
 * 作者   yeluodev1226
 * 创建时间 2017/11/11 19:30
 * 修改人  yeluodev1226
 * 修改时间 2017/11/11 19:30
 * 备注
 */
public class ImageLoader {

    /**
     * 类型（大图，中图，小图）
     */
    private int type;
    /**
     * 需要加载的图片资源id
     */
    private int res;
    /**
     * 占位图
     */
    private int placeHolder;
    /**
     * 加载策略，是否在wifi下才加载
     */
    private int strategy;
    /**
     * 需要解析的图片url
     */
    private String url;
    /**
     * 需要加载图片的ImageView实例
     */
    private ImageView imageView;
    /**
     * 图片加载的填充类型
     */
    private boolean fitType;

    private ImageLoader(Builder builder){
        this.type = builder.type;
        this.res = builder.res;
        this.placeHolder = builder.placeHolder;
        this.strategy = builder.strategy;
        this.url = builder.url;
        this.imageView = builder.imageView;
        this.fitType = builder.fitType;
    }

    public int getType() {
        return type;
    }

    public int getRes() {
        return res;
    }

    public int getPlaceHolder() {
        return placeHolder;
    }

    public int getStrategy() {
        return strategy;
    }

    public String getUrl() {
        return url;
    }

    public boolean isFitType() {
        return fitType;
    }

    public ImageView getImageView() {
        return imageView;
    }

    public static class Builder{
        private int type;
        private int res;
        private int placeHolder;
        private int strategy;
        private String url;
        private ImageView imageView;
        private boolean fitType;

        public Builder(){
            this.type = ImageLoaderUtil.PIC_SMALL;
            this.res = 0;
            this.placeHolder = 0;
            this.url="";
            this.strategy = ImageLoaderUtil.LOAD_STRATEGY_NORMAL;
            this.imageView = null;
            this.fitType = true;
        }

        public Builder type(int type) {
            this.type = type;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder res(int res) {
            this.res = res;
            return this;
        }

        public Builder placeHolder(int placeHolder) {
            this.placeHolder = placeHolder;
            return this;
        }

        public Builder imgView(ImageView imageView) {
            this.imageView = imageView;
            return this;
        }

        public Builder strategy(int strategy) {
            this.strategy = strategy;
            return this;
        }

        public Builder fit(boolean fitType) {
            this.fitType = fitType;
            return this;
        }

        public ImageLoader build() {
            return new ImageLoader(this);
        }
    }


}
