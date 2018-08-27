package com.xiongms.statusbar;

import android.view.Window;


/**
 * 状态栏接口
 *
 * @author xiongms
 * @time 2018-08-27 10:22
 */
interface IStatusBar {
    void setStatusBarColor(Window window, int color, boolean lightStatusBar);
}
