package cn.itcase.zz.newclient.utils;
/**
 * 网络工具，url
 * @author wangdh
 *
 */
public class NetUtils {
  //127.0.0.1回环地址，代表的是自己。模拟器
    //真实的ip：192.168.0.99
    //10.0.2.2 
    //10.0.3.2 GenyMotion
    public final static String BASE_URL = "http://172.18.1.12:8080/zhbj";
    public final static String NEWS_CENTER_CATEGORIES = BASE_URL
     + "/categories.json";
    public static final String PHOTOS_URL = BASE_URL + "/photos/photos_1.json";
}
