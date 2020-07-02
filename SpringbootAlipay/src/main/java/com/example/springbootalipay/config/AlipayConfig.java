package com.example.springbootalipay.config;

import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileWriter;
import java.io.IOException;

public class AlipayConfig {
    // 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
    public static String app_id = "2016101800716266";

    // 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key ="MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQCAJ3GHhf97sJY0EZhYdw+bvmv91IHXIE2dSZx2WNa5gonJT1klut0W9R5HB0OS1q3A+yiV2epeUDwFMFVdOBnR8RKoLzqH0FHrgrJv3NRGel77DWpJiuEvk3I0mlb0CTd6mXxAwrdz/6ytldxXj6NUG1t+own5I5stK5I34RFQe1N2kP5VrWvC5u19W3kr/mBml0eAV4wKqtaB+i4nE2/zKar5cUe9r+24fSeZu5tU/Rqj4IscfUJW0cbqfmuSD3Sez5HiafbEli7mTufgH0FGwezd5lwUpoADvfDEEXBgblMjfJRROln1DW7ab8fo6QhQHFZE/hepLLW2RmKNc841AgMBAAECggEAVxT2Y0XdnjoXRthx8iMtWwJhNYFSnVEZDHk5tX2Wo0YdxMqDZEz+8Rus8EzyUPRJ62l/YZxLUr0om8oFJ6v4d51dtSUqm6EmGWedQsAHCsEai3PJNqIFdKO3piD+VyNwLIHhWcw2hr9EokvEB0fWj09rs7isDTxxtJb367qnXk0DWB7HOaRxU8sjbGxJj0owpbh+PlarGvZN4A7RoNaE0kJPC8yEQ8TDRKtJaIEN0xoxO/ZvGZv5kiMCc2U2skhpJWkKsRSNMf9CUlmBKlTjJAJ62AV1GClC6yuW9+LMU/Bd6SeaiSitQ8sPmjHMIf6fLY7CDLbgDSSe0RdJxpdVYQKBgQDgNMRwB+oaMj6V8sbviZVhcXe9uJcqB9c1JKQ45AhFwJ77c2XLqvTl4WH9MWjk6bwOtDOVo76nZmtl8GASF5xbp1B3MQ/3j5c3sL88E0IevuvpqWbzALRqRooC2BqZ31z9hEZM8/ShVqTT0PxDMYKUpgoNiI5qm0QwQ2+YZrKa7QKBgQCSU8BE7Ul6dXhUL8uLqoRb/4zdQAjaK1WWsXY1jjvW+KRCWLtJTOTriaWi3R6QzLEc0xcKzGuCS14Ix88oMuzybfeazd5iY6d/7GOTqESsy5Q7lXxFZh0CRCoO7tKUohJmGCE2TdSdt/h0d+ysQwim3B/XaYrp+LiVmomyWOvvaQKBgHOHfTllOqIpBcrqgMvpj0nY2CSwu2PzClfd+6k9B2455TIYsnmSLANQcdev4Ccksby56mLPL2y+/9RVWou4Et+/hV0FsP6VxQvzTXc9TTLeml2a5uuMj2q70l3I0Vw8loQj5r28b2+7X8+tvm85Udoa/M8gcJJKU4azGQvkz1+5AoGAGtuOddhL3VNEY8dmB9ujcbNlKpL/TPQZQJCQDuJtb1ax54+byKd5eRYJtev6GT/I3m6MUyoULZUhzGDIUCuQvCqdAOf6gnqiGuPLnyWKfWDcc1dLuP02I91ZDuac9jUNRXn2Vp5QgSZsTwxX/4JKSz4qBgLUQX+qeaMk1PxnSckCgYEA1IX/KxWCcmrAwIzH0HnL3ioKMcYSL0MIe6nDHGbdpo2pigd0lkA2da/6RYpggE+9yzoVcfqfrTfwFTSeoKptEKfHRikB3z/IGz0jaCuQoIvuoD/jv8ryuwiwBOCHltkRiye/CbIjfJ8xyfwt/YUjJ7CPIIc+XKoWcI46PC5VT5k=";
    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAt3rHXYvIU9k1pvIQLrZ0x9MXlZCjA/ZXw3zr7TVPhaBvck61OMLojnyfJaC8tXcqvPaM7J+AcA4W4eky86lMsAr35Tg7wCpNiXSY8ThJZSHdz5gOOLCEyH9zbN2dkwumz8khimtVeJb1+A8clK6jEcY2MKiNlJkVHS33CS1BchV3lVrg14Qp7ulgBj53D93xmhJ1GXkrjjyvP8DiaHZNN1OvVk7/o/kTy7q1qWDULN6Bzq6L68NN6+zaPVFl0A2qVK2dKsSl9aRJIRoIfykHnV4YK7Zb3osA3Fwa8kXg4sNXv3jVxD78qUJeRh5UcK32ERhz7WSpCijgaqtEXw73CQIDAQAB";
    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String notify_url = " http://j6bmaz.natappfree.cc/payment/notify";

    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
    public static String return_url = "http://localhost:8080/payment/return_url";

    // 签名方式
    public static String sign_type = "RSA2";

    // 字符编码格式
    public static String charset = "utf-8";

    // 支付宝网关
    public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";

    // 支付宝网关
    public static String log_path = "D:\\";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /**
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}


//@Component
//public class AlipayConfig {
//    // 作为身份标识的应用ID
//    @Value("${alipay.appid}")
//    public String app_id;
//
//    // 商户私钥，您的PKCS8格式RSA2私钥
//    @Value("${alipay.merchant_private_key}")
//    public String merchant_private_key;
//
//    // 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
//    @Value("${alipay.alipay_public_key}")
//    public String alipay_public_key;
//
//    // 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    @Value("${alipay.notify_url}")
//    public String notify_url;
//
//    // 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
//    @Value("${alipay.return_url}")
//    public String return_url ;
//
//    // 签名方式
//    @Value("${alipay.sign_type}")
//    public String sign_type;
//
//    // 字符编码格式
//    @Value("${alipay.charset}")
//    public String charset;
//
//    // 支付宝网关
//    @Value("${alipay.gatewayUrl}")
//    public String gatewayUrl;
//
//    public String getApp_id() {
//        return app_id;
//    }
//
//    public void setApp_id(String app_id) {
//        this.app_id = app_id;
//    }
//
//    public String getMerchant_private_key() {
//        return merchant_private_key;
//    }
//
//    public void setMerchant_private_key(String merchant_private_key) {
//        this.merchant_private_key = merchant_private_key;
//    }
//
//    public String getAlipay_public_key() {
//        return alipay_public_key;
//    }
//
//    public void setAlipay_public_key(String alipay_public_key) {
//        this.alipay_public_key = alipay_public_key;
//    }
//
//    public String getNotify_url() {
//        return notify_url;
//    }
//
//    public void setNotify_url(String notify_url) {
//        this.notify_url = notify_url;
//    }
//
//    public String getReturn_url() {
//        return return_url;
//    }
//
//    public void setReturn_url(String return_url) {
//        this.return_url = return_url;
//    }
//
//    public String getSign_type() {
//        return sign_type;
//    }
//
//    public void setSign_type(String sign_type) {
//        this.sign_type = sign_type;
//    }
//
//    public String getCharset() {
//        return charset;
//    }
//
//    public void setCharset(String charset) {
//        this.charset = charset;
//    }
//
//    public String getGatewayUrl() {
//        return gatewayUrl;
//    }
//
//    public void setGatewayUrl(String gatewayUrl) {
//        this.gatewayUrl = gatewayUrl;
//    }
//
//    public AlipayClient getAliapyClient(){
//        return new DefaultAlipayClient(gatewayUrl, app_id, merchant_private_key, "json", charset, alipay_public_key, sign_type);
//    }
//}
