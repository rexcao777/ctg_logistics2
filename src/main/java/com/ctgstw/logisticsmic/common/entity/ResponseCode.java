package com.ctgstw.logisticsmic.common.entity;

/**
 * Created by hfangjian on 2017/6/28.
 */
public enum ResponseCode {


    //2：非法参数；描述：ILLEGAL_ARGUMENT
    ILLEGAL_ARGUMENT(2, "非法参数"),

    //3:部分成功（批量操作）； 描述:PART_TRUE
    PART_TRUE(3, "部分操作成功"),

    //4:参数异常（批量操作）； 描述:PARAMETER_ERROR
    PARAMETER_ERROR(4, "传入参数异常"),

    //0:成功； 描述:SUCCESS
//    SUCCESS(0, "操作成功。 Operation Successfully Completed !"),
    SUCCESS(0, "操作成功。"),

    //1:失败； 描述:ERROR
//    ERROR(1, "操作失败。 Operation Failed !"),
    ERROR(1, "操作失败。"),

    //9：未登录，需登录；描述：NEED_LOGIN
//    NEED_LOGIN(9, "请先登录。 Please Log In First !"),
    NEED_LOGIN(9, "请先登录。"),
    //10:身份信息已失效，请重新登录；
//    IDENTITY_INFO_EXPIRED(10, "身份信息已过期，请重新登录。 Identity Information Has Expired.Please Log In Again !"),
    IDENTITY_INFO_EXPIRED(10, "身份信息已过期，请重新登录。"),
    //11:身份信息不合法；
//    IDENTITY_INFO_ILLEGAL(11, "身份信息不合法。 Identity Information Is Illegal!"),
    IDENTITY_INFO_ILLEGAL(11, "身份信息不合法!"),

    //12:该账号已经被禁用；
//    ACCOUNT_IS_DISABLED(12, "该账号已经被禁用。 This Account Has Been Disabled!"),
    ACCOUNT_IS_DISABLED(12, "该账号已经被禁用。 "),

    //13:该账号尚未注册；
//    ACCOUNT_NOT_REGISTERED(13, "该账号不存在。 This Account Has Not Been Registered!"),
    ACCOUNT_NOT_REGISTERED(13, "该账号不存在。"),

    //14:密码不正确；
//    PASSWORD_WRONG(14, "密码错误。 Password Is Wrong!"),
    PASSWORD_WRONG(14, "密码错误。"),

    //15:秘钥凭证不正确；
//    SECRET_KEY_WRONG(15, "秘钥凭证不正确。 Secret Key Not Correct!"),
    SECRET_KEY_WRONG(15, "秘钥凭证不正确。 "),

    //16:账号已被其他人在别处登录，请您重新登录；
    ACCOUNT_ALREADY_LOGGED(16, "账号已被其他人在别处登录，请您重新登录。"),
    //验证码错误或失效
    VALIDATE_WRONG_EXPIRE(17, "验证码错误或者失效"),

    //20:失败； 描述:请求参数有缺失
//    LACK_OF_PARAMETERS(20, "请求参数有缺失,请将参数填写完整。 Lack Of Parameter !"),
    LACK_OF_PARAMETERS(20, "请求参数有缺失,请将参数填写完整。"),

    //21:参数值的长度不符合要求； 描述:请求参数的长度不符合要求
//    LENGTH_OF_PARAMETER_ILLEGAL(21, "请求参数的值的长度不符合要求。 The Length Of Parameter Value Is Illegal!"),
    LENGTH_OF_PARAMETER_ILLEGAL(21, "请求参数的值的长度不符合要求。"),

    //22:请求参数不合法
//    ILLEGAL_OF_PARAMETER(22, "请求参数不合法。 Parameter Is Illegal!"),
    ILLEGAL_OF_PARAMETER(22, "请求参数不合法。"),

    //30:ocr Vin码识别失败 描述：图片vin码识别失败
//    FAILURE_OF_DISCERN_VIN_CODE(30, "图片vin码识别失败 FAILURE_OF_DISCERN_VIN_CODE"),
    FAILURE_OF_DISCERN_VIN_CODE(30, "图片vin码识别失败"),
    //31:ocr 车牌识别失败 描述：车牌识别失败
//    FAILURE_OF_DISCERN_PLATE_NUMBER(31, "图片车牌识别失败 FAILURE_OF_DISCERN_PLATE_NUMBER"),
    FAILURE_OF_DISCERN_PLATE_NUMBER(31, "图片车牌识别失败"),

    //密码不正确
//    WRONGPASSWORD(50, "WRONGPASSWORD"),
    /***
     * tangjun
     * 订单状态及相关
     */
    ORDER_ALL_FAIL(30, "订单全部下单失败"),
    ORDER_CTG_ID_MISS(31, "公司id未与车同轨匹配"),
    ORDER_USER_ID_MISS(32, "登录用户在车同轨中不存在或未传输"),
    ORDER_PART_TRUE(33, "部分订单下单成功"),
    ORDER_NUMBER_FALSE(34, "订单号和公司编号不匹配"),
    ORDER_STATE_FALSE(35, "订单状态异常"),
    ORDER_PARAMETER_FALSE(36, "订单参数异常"),
    ORDER_MISS(37, "订单不存在"),
    ORDER_TOKEN_MISS(38, "TOKEN获取失败"),
    ORDER_CLIENT_ID_MISS(39, "顾客id为空"),
    ORDER__SUPPLIER_MISS(40, "供应商未匹配或公司已删除"),
    INVALID_DATA(41, "无效数据");

    //用户名不正确
//    WRONGUSERNAME(51, "WRONGUSERNAME");


    private final int code;
    private final String desc;

    ResponseCode(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
