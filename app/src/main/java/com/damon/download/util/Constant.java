package com.damon.download.util;

import android.os.Environment;

import com.damon.download.MainApplication;

/**
 * 创建时间：2018/3/7
 * 编写人：czw
 * 功能描述 ：
 */

public class Constant {
    public final static String APP_ROOT_PATH = Environment.getExternalStorageDirectory().getAbsolutePath() + "/" + MainApplication.getInstance().getPackageName();
    public final static String DOWNLOAD_DIR = "/downlaod/";


}
