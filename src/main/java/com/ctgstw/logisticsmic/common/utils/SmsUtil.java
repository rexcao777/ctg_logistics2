package com.ctgstw.logisticsmic.common.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

/**
 * 通过短信接口发送短信
 */
public class SmsUtil {


    public static void main(String[] args) {

//		sendSms2("13511111111","您的验证码是：1111。请不要把验证码泄露给其他人。");
        //sendSmsAll(List<PageData> list)

        //sendSms1();
        sendDinner("项一磊", "13306195736");
    }


    //短信商 一  http://www.dxton.com/ =====================================================================================

    /**
     * 给一个人发送单条短信
     *
     * @param mobile 手机号
     * @param code   短信内容
     */
    public static void sendSms1(String mobile, String code) {

        String account = "", password = "";
        String strSMS1 = Tools.readTxtFile("admin/config/SMS2.txt");            //读取短信1配置
        if (null != strSMS1 && !"".equals(strSMS1)) {
            String strS1[] = strSMS1.split(",yxtc,");
            if (strS1.length == 2) {
                account = strS1[0];
                password = strS1[1];
            }
        }
        String PostData = "";
        try {
            PostData = "account=" + account + "&password=" + password + "&mobile=" + mobile + "&content=" + URLEncoder.encode(code, "utf-8");
        } catch (UnsupportedEncodingException e) {
            System.out.println("短信提交失败");
        }
        //System.out.println(PostData);
        String ret = SMS(PostData, "http://sms.106jiekou.com/utf8/sms.aspx");
        System.out.println(ret);
        /*
 	   100			发送成功
 	   101			验证失败
 	   102			手机号码格式不正确
 	   103			会员级别不够
 	   104			内容未审核
 	   105			内容过多
 	   106			账户余额不足
 	   107			Ip受限
 	   108			手机号码发送太频繁，请换号或隔天再发
 	   109			帐号被锁定
 	   110			发送通道不正确
 	   111			当前时间段禁止短信发送
 	   120			系统升级
		*/

    }

    public static String SMS(String postData, String postUrl) {
        try {
            //发送POST请求
            URL url = new URL(postUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("POST");
            conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            conn.setRequestProperty("Connection", "Keep-Alive");
            conn.setUseCaches(false);
            conn.setDoOutput(true);

            conn.setRequestProperty("Content-Length", "" + postData.length());
            OutputStreamWriter out = new OutputStreamWriter(conn.getOutputStream(), "UTF-8");
            out.write(postData);
            out.flush();
            out.close();

            //获取响应状态
            if (conn.getResponseCode() != HttpURLConnection.HTTP_OK) {
                System.out.println("connect failed!");
                return "";
            }
            //获取响应内容体
            String line, result = "";
            BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream(), "utf-8"));
            while ((line = in.readLine()) != null) {
                result += line + "\n";
            }
            in.close();
            return result;
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }
        return "";
    }
    //===================================================================================================================


    /**
     * 短信商 二  http://www.ihuyi.com/ =====================================================================================
     */
    private static String Url = "http://106.ihuyi.com/webservice/sms.php?method=Submit";


    /**
     * 给一个人发送单条短信
     *
     * @param mobile 手机号
     * @param code   短信内容
     */
//    public static void sendSms2(String mobile, String code) {
//        HttpClient client = new HttpClient();
//        PostMethod method = new PostMethod(Url);
//
//        client.getParams().setContentCharset("UTF-8");
//        method.setRequestHeader("ContentType", "application/x-www-form-urlencoded;charset=UTF-8");
//
//        String content = new String(code);
//
//        String account = "", password = "";
//        String strSMS2 = Tools.readTxtFile("admin/config/SMS2.txt");            //读取短信2配置
//        if (null != strSMS2 && !"".equals(strSMS2)) {
//            String strS2[] = strSMS2.split(",yxtc,");
//            if (strS2.length == 2) {
//                account = strS2[0];
//                password = strS2[1];
//            }
//        }
//
//        NameValuePair[] data = {//提交短信
//                new NameValuePair("account", account),
//                new NameValuePair("password", password),            //密码可以使用明文密码或使用32位MD5加密
//                new NameValuePair("mobile", mobile),
//                new NameValuePair("content", content),
//        };
//
//        method.setRequestBody(data);
//
//        try {
//            client.executeMethod(method);
//
//            String SubmitResult = method.getResponseBodyAsString();
//
//            Document doc = DocumentHelper.parseText(SubmitResult);
//            Element root = doc.getRootElement();
//
//
//            code = root.elementText("code");
//            String msg = root.elementText("msg");
//            String smsid = root.elementText("smsid");
//
//
//            System.out.println(code);
//            System.out.println(msg);
//            System.out.println(smsid);
//
//            if (code == "2") {
//                System.out.println("短信提交成功");
//            }
//
//        } catch (HttpException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } catch (DocumentException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    /**
//     * 给多个人发送单条短信
//     *
//     * @param list 手机号验证码
//     */
//    public static void sendSmsAll(List<Smscode> list) {
//        String code;
//        String mobile;
//        for (int i = 0; i < list.size(); i++) {
//            code = list.get(i).getCode();
//            mobile = list.get(i).getTelphone();
//            sendSms2(mobile, code);
//        }
//    }
    // =================================================================================================


    //云片网短信服务================================================start
    public static String yp_apikey = "d6253cf277edf09f2de5f9a69f13cb2b";
    public static String yp_url = "https://sms.yunpian.com/v2/sms/single_send.json";

    /**
     * 云片-发送短信验证码
     *
     * @param code
     * @param phone
     * @return
     */
    public static void sendSmsYP(String code, String phone) {
        String text = "【车同轨】您的验证码是" + code + "。如非本人操作，请忽略本短信";
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }

    public static void sendDinner(String code, String phone) {
        String text = "【车同轨】" + code + "于明日请吃晚宴，请各位同事准时出席。";
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }

    public static void sendDefSms(String content, String phone) {
        String text = "【车同轨】" + content;
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }

    /**
     * 云片-发送提醒短信
     *
     * @param user   发起人/企业
     * @param action 对应操作
     * @param phone  对应号码
     */
    public static void sendSmsYPTip(String user, String action, String phone) {
        String text = "【车同轨】尊敬的用户，#user#已添加您为客户，请登录车同轨后#action#。";
        text = text.replace("#user#", user).replace("#action#", action);
        System.out.println(text);
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }
    //云片网短信服务================================================end

    /**
     * 发送邀请注册
     *
     * @param user
     * @param action
     * @param phone
     */
    public static void sendInviteMsg(String user, String action, String phone) {
        String text = "【车同轨】尊敬的用户，#user#已添加您为客户，请登录车同轨后#action#。";
        text = text.replace("#user#", user).replace("#action#", action);
        System.out.println(text);
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }

    public static void sendInviteRegistry(String user, String action, String phone) {
        String text = "【车同轨】尊敬的用户，#user#已添加您为外部联系人，您可以在登录车同轨后#action# ";
        text = text.replace("#user#", user).replace("#action#", action);
        System.out.println(text);
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }

    public static void sendJoinCompany(String user, String action, String phone) {
        String text = "【车同轨】尊敬的用户，#user#已添加您为外部联系人，您可以在登录车同轨后#action# ";
        text = text.replace("#user#", user).replace("#action#", action);
        System.out.println(text);
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }

    public static void sendSmsYPTip1(String user, String action, String phone) {
        String text = "【车同轨】尊敬的用户，#user#已添加您为企业成员，请登录车同轨官网#action#。";
        text = text.replace("#user#", user).replace("#action#", action);
        System.out.println(text);
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }
    /**
     * 发送联盟邀请
     * @param user
     * @param action
     * @param phone
     */
    public static void sendAllianceInviteMsg(String user, String action, String phone) {
        String text = "【车同轨】尊敬的用户，#user#想要添加您加入联盟，您可以登录车同轨#action#";
        text = text.replace("#user#", user).replace("#action#", action);
        System.out.println(text);
        Map<String, String> params = new HashMap<String, String>();//请求参数集合
        params.put("apikey", yp_apikey);
        params.put("text", text);
        params.put("mobile", phone);

        String PostData = "";
        PostData = "apikey=" + yp_apikey + "&text=" + text + "&mobile=" + phone;
        SMS(PostData, yp_url);
    }
}

