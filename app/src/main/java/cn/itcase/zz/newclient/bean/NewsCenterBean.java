package cn.itcase.zz.newclient.bean;

import java.util.List;

/**
 * 新闻中心数据实体类
 * @author wangdh
 * gson使用原则：
 *  1. 成员变量，需要是public
 *  2. 成员变量名，必须与json的key一致
 */
public class NewsCenterBean {
    public String retcode;//状态码
    public List<String> extend;
    public List<NewsCenterData> data;
    public class NewsCenterData{
        public String id;
        public String type;
        public String title;//标题
        public String url;
        public String url1;
        public String dayurl;
        public String excurl;
        public String weekurl;
        public List<Children> children;
        public class Children{
            public String id;
            public String type;
            public String title;//标题
            public String url;
        }
    }
    
}
