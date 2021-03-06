/**
 * TuSDKVideoDemo
 * Constants.java
 *
 * @author Bonan
 * @Date: 2017-5-8 上午10:42:48
 * @Copyright: (c) 2017 tusdk.com. All rights reserved.
 */
package com.upyun.shortvideo.utils;

public class Constants {
    /**
     * 最大录制时长 (单位：秒)
     */
    public static int MAX_RECORDING_TIME = 20;

    /**
     * 最小录制时长 (单位：秒)
     */
    public static int MIN_RECORDING_TIME = 2;


    public static int[] AUDIO_EFFECTS = new int[]{com.upyun.shortvideo.R.raw.lsq_audio_lively, com.upyun.shortvideo.R.raw.lsq_audio_oldmovie, com.upyun.shortvideo.R.raw.lsq_audio_relieve};

    /**
     * 滤镜 filterCode 列表
     */
    public static String[] VIDEOFILTERS = {"None", "nature", "pink", "jelly", "ruddy",
            "sugar", "honey", "clear", "timber", "whitening", "porcelain"};

    /** -----------注意事项：视频录制使用人像美颜滤镜(带有磨皮、大眼、瘦脸)，编辑组件尽量不要使用人像美颜滤镜，会造成视频处理过度，效果更不好，建议使用纯色偏滤镜 ----------------*/
    /**
     * 编辑滤镜 filterCode 列表
     */
    public static String[] EDITORFILTERS = {"None", "Olympus_1", "Leica_1", "Gold_1", "Cheerful_1",
            "White_1", "s1950_1", "Blurred_1", "Newborn_1", "Fade_1", "NewYork_1"};


    /**
     * 场景特效code 列表
     */
    public static String[] SCENE_EFFECT_CODES = {"None", "LiveShake01", "LiveMegrim01", "EdgeMagic01", "LiveFancy01_1", "LiveSoulOut01",
            "LiveSignal01"};


    /**
     * 魔法 Code 列表
     */
    public static String[] PARTICLE_CODES = {"None", "snow01", "Music", "Star", "Love", "Bubbles", "Surprise", "Fireball", "Flower",
            "Magic", "Money", "Burning"};
}