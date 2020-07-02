package com.example.springbootalipay.controller;

import com.alipay.api.AlipayApiException;

import com.alipay.api.internal.util.AlipaySignature;
import com.alipay.api.internal.util.StringUtils;

import com.example.springbootalipay.config.AlipayConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@RestController
@RequestMapping("/payment")
public class Controller {

    @Autowired
    AlipayService alipayService;


    @RequestMapping("/pay")
    public void payMent(HttpServletResponse response, HttpServletRequest request) {
        try {
            alipayService.aliPay(response,request);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @RequestMapping("/notify_url")
    public void Notify(HttpServletResponse response, HttpServletRequest request) throws Exception {
        System.out.println("----------------------------notify_url------------------------");
        // 商户订单号
        String out_trade_no = new String(request.getParameter("out_trade_no").getBytes("ISO-8859-1"), "utf-8");
        // 付款金额
        String total_amount = new String(request.getParameter("total_amount").getBytes("ISO-8859-1"), "utf-8");
        // 支付宝交易号
        String trade_no = new String(request.getParameter("trade_no").getBytes("ISO-8859-1"), "utf-8");
       // 交易状态
        String trade_status = new String(request.getParameter("trade_status").getBytes("ISO-8859-1"), "utf-8");
        if (trade_status.equals("TRADE_SUCCESS")) {//支付成功商家操作
            System.out.println("----------------------------支付成功------------------------");
            System.out.println("out_trade_no:"+out_trade_no);
            System.out.println("total_amount:"+total_amount);
            System.out.println("trade_no:"+trade_no);
        }
    }

    @RequestMapping("/return_url")
    public String Return_url() throws InterruptedException {
        System.out.println("支付返回");
        return "alipayexit";
    }



    @RequestMapping("/notify")
    public String notify(HttpServletRequest request) throws AlipayApiException, UnsupportedEncodingException {
       return alipayService.notify(request);
    }


}
