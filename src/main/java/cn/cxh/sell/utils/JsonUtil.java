package cn.cxh.sell.utils;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * Created by SqMax on 2018/3/26.
 */
public class JsonUtil {

    public static String toJson(Object object){
        //GsonBuilder gsonBuilder=new GsonBuilder();
       // gsonBuilder.setPrettyPrinting();
        //Gson gson=gsonBuilder.create();

      //  return gson.toJson(object);
        return JSON.toJSONString(object);
    }
}
