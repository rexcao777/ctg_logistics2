package com.ctgstw.logisticsmic.common.constant;

/**
 * Created by hfangjian on 2017/6/29.
 */
public class Const {

    //当前（登录的）用户
    public static final String CURRENT_USER = "currentUser";
    //邮箱Email
    public static final String EMAIL = "email";
    //用户名
    public static final String USERNAME = "username";

    public static final String RESPONSE_STATUS = "status";

    public static final String RESPONSE_MSG = "msg";

    public static final String RESPONSE_DATA = "data";

    public static final String QUALITY_OEM = "101";

    public static final String QUALITY_BRANDPART = "103";

    // 存放在redis中的session有效时间
    public static final Integer REDIS_SESSION_EXTIME = 60 * 60;

    // redis中存放接口秘钥的key前缀
    public static final String REDIS_CTGSECRET_PREFIX = "CTGSECRET_";

    // redis中存放 '用户ID - 登录后的token值' 的键的前缀
    public static final String REDIS_USERID_PREFIX = "CTGUSERID_";

    // redis中存放 '后台管理员 - 登录后的token值' 的键的前缀
    public static final String REDIS_BCADMIN_PREFIX = "CTGBCADMIN_";

    // redis中存放 '后台管理员ID日志 - 登录后的token值' 的键的前缀
    public static final String REDIS_BCADMINLOG_PREFIX = "CTGBCADMINLOG_";

    // redis中存放 '公司ID_登录平台名称 - 登录人ID' 的键的前缀
    public static final String REDIS_COMPANYID_PREFIX = "CTGCOMPANYID_";

    // redis中存放 '个人登录日志所属用户ID - 登录人ID - 登录平台名称' 的键的前缀。 CTGUSERLOG_1233_CTG_WEB
    public static final String REDIS_USERLOG_PREFIX = "CTGUSERLOG_";

    public interface Role {
        int ROLE_CUSTOMER = 0; //普通用户
        int ROLE_ADMIN = 1;//管理员
    }

    /**
     * 阿里云上传图片
     */
    public interface Picture {
        String endpoint = "http://oss-cn-qingdao.aliyuncs.com";
        String accessKeyId = "LTAIg52OToLAqTPF";
        String accessKeySecret = "oiRdzTjZZcirAWlfl5BHpdyYUidP21";
    }

    /**
     * 阿里云上传图片Buck路径
     */
    public interface PictureBucketPath {
        String BUCKET_NAME = "ctgoe";//Buck路径
    }

    /**
     * 阿里云上传图片Buck下面ObjectKey
     */
    public interface PictureObjectKeyPath {
        String URM = "urm/";
        String CTGPARTS = "ctgParts/";
        String ETC = "etc/";
        String OTHERFILE = "otherfile/";
        String STW = "stw/";
        String WEIXINIMAGES = "weixinImages/";
        String MANUFACTURER = "Manufacturer/";
        String JQR = "jqr/";//机器人
        String TEST = "test/";
        String GOODS = "goods/";//商品
        String ENQUIRY = "enquiry/";//询价
        String CHAT = "chat/";//聊天
    }


}
