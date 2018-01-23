package com.drouter.api.thread;

import android.content.Context;

import com.drouter.api.action.IRouterAction;

import java.util.Map;

/**
 * description:
 * author: Darren on 2018/1/23 16:05
 * email: 240336124@qq.com
 * version: 1.0
 */
public interface Poster {
    void enqueue(IRouterAction routerAction, Context context, Map<String,Object> params);
}
