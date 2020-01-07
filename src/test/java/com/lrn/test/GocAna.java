package com.lrn.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @Decription TODO
 * @Author dengwei
 * @Date 2019/11/28 3:08 PM
 * @Version 1.0
 */
public class GocAna {
    public static void main(String[] args) {
        final String tp3AppName = "tradeplatform3";
        final String tmAppName = "trademanager";
        final String rf2AppName = "rf2";
        final String rp2AppName = "rp2";
        final String detailAppName = "detail";
        final String umpAppName = "ump";
        final String fpAppName = "fundplatform";
        final String icAppName = "itemcenter2";
        final String uicFinalAppName = "uicfinal";
        final String punishcenterAppName = "punishcenter";
        final String ipmAppName = "ipm";
        final String cartAppName = "carts2";
        Map<String,Map<String,String>> allCrashOnline8to11 = new HashMap<String, Map<String, String>>();
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080100000023001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tmAppName);
                    put("type","业务正常");
                    put("failType","成功量下跌");
                    put("reason","入口流量下跌");
                    put("name","tm成功率（买到卖出）_PC详情_成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080100000025001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",detailAppName);
                    put("type","业务正常");
                    put("reason","爬虫");
                    put("failType","成功量下跌");
                    put("name","详情detail访问_静态_WAP_V6_成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080400000004001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",rf2AppName);
                    put("type","业务正常");
                    put("reason","业务拦截");
                    put("failType","成功率下跌");
                    put("name","卖家同意退款页面渲染rf2-成功率");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080500000001001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tp3AppName);
                    put("type","故障");
                    put("reason","磁盘IO打满");
                    put("failType","成功量下跌");
                    put("name","非压测秒级交易创建_tp3");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080500000007001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",umpAppName);
                    put("type","故障");
                    put("reason","应用切流");
                    put("failType","舆情反馈");
                    put("name","部分ISV商家定向优惠不生效，导致优惠对全部消费者可见");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080500000015001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tmAppName);
                    put("type","业务正常");
                    put("reason","入口流量下跌");
                    put("failType","成功量下跌");
                    put("name","tm成功率（买到卖出）_PC已买到_成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080600000004001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",detailAppName);
                    put("type","业务正常");
                    put("reason","正常波动");
                    put("failType","成功量下跌");
                    put("name","详情detail访问_静态_WAP_V6_成功量异常");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080800000001001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tp3AppName);
                    put("type","业务正常");
                    put("reason","消息堆积");
                    put("failType","成功率下跌");
                    put("name","tp3发货请求_成功率");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080800000012001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",detailAppName);
                    put("type","故障");
                    put("reason","安全拦截");
                    put("failType","舆情反馈");
                    put("name","用户反馈商品详情访问被拦截，提示请检查是否使用了代理软件或者VPN");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080800000028001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",detailAppName);
                    put("type","业务正常");
                    put("reason","灰度测试");
                    put("failType","成功率下跌");
                    put("name","详情detail访问_静态_WAP_V6_成功率");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019080800000040001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tmAppName);
                    put("type","业务正常");
                    put("reason","恶意刷单");
                    put("failType","成功量下跌");
                    put("name","tm成功率（买到卖出）_PC已买到_成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019081200000014001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app","buy2");
                    put("type","突袭");
                    put("reason","磁盘满、TDDL超时");
                    put("failType","成功率下跌");
                    put("name","(SPE灰度)环境_淘宝付款申请");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019081200000018001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",uicFinalAppName);
                    put("type","突袭");
                    put("reason","UIC限流");
                    put("failType","成功率下跌");
                    put("name","(SPE灰度)环境_无线帐密登录服务指标");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019081200000034001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",punishcenterAppName);
                    put("type","故障");
                    put("reason","代码变更");
                    put("failType","舆情反馈");
                    put("name","账户处罚自助开通撤销后PC端无法登录");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092300000035001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app",tp3AppName);
                    put("type","突袭");
                    put("reason","oom、DB超时");
                    put("failType","成功率下跌");
                    put("name","(SPE灰度)环境_淘宝交易创建下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019091900000012001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",uicFinalAppName);
                    put("type","业务正常");
                    put("reason","菜鸟入口下跌，实际无影响");
                    put("failType","成功量下跌");
                    put("name","会员注册和激活_register_成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019091900000002001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","蚂蚁金服");
                    put("type","故障");
                    put("reason","SRE执行Tair FO");
                    put("failType","成功量下跌");
                    put("name","0919支付宝交易付款下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019091700000001001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app","buy2");
                    put("type","压测");
                    put("reason","摸高触发限流");
                    put("failType","成功量下跌");
                    put("name","压测导致淘宝交易创建下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019091300000002001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tp3AppName);
                    put("type","故障");
                    put("reason","网络变更导致");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019091200000010001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",icAppName);
                    put("type","故障");
                    put("reason","慢sql");
                    put("failType","成功率下跌");
                    put("name","天猫商品发布成功率下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019091200000007001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app","buy2");
                    put("type","故障");
                    put("reason","现场操作尾纤导致网络抖动");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建等多个业务下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019091200000006001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",tmAppName);
                    put("type","业务正常");
                    put("reason","非法请求");
                    put("failType","成功率下跌");
                    put("name","tm成功率（买到卖出）");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019091000000003001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",icAppName);
                    put("type","业务正常");
                    put("reason","卖家发品数量超出限制并不断重试导致");
                    put("failType","成功率下跌");
                    put("name","商品发布成功率(淘宝助理)");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019090800000003001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",tp3AppName);
                    put("type","业务正常");
                    put("reason","99大促提前预案执行预期内的PC交易下跌");
                    put("failType","成功量下跌");
                    put("name","淘宝PC交易创建_tp3__成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019090700000001001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","压测");
                    put("reason","压测限流导致交易下跌");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建下跌超过5%");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019090400000009001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",detailAppName);
                    put("type","故障");
                    put("reason","wrs代码变更导致");
                    put("failType","舆情反馈");
                    put("name","部分天猫商家商品详情页展示已缺货");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019090400000002001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019090300000021001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",tp3AppName);
                    put("type","业务正常");
                    put("reason","99大促预案执行，预期内");
                    put("failType","成功量下跌");
                    put("name","淘宝PC交易创建_tp3__成功量");
                }}
        );

        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082900000024001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","故障");
                    put("reason","Forest7 diamond 配置变更导致");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建异常");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082900000012001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app","buy2");
                    put("type","故障");
                    put("reason","代码变更热发导致");
                    put("failType","成功量下跌");
                    put("name","交易相关多个业务订单创建跌0");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082900000003001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app","buy2");
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","全链路压测");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082600000019001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","突袭");
                    put("reason","fp线程池满");
                    put("failType","成功量下跌");
                    put("name","(SPE灰度)环境_淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082600000010001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","突袭");
                    put("reason","iC磁盘满");
                    put("failType","成功量下跌");
                    put("name","(SPE灰度)环境_淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082300000013001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app","FP");
                    put("type","故障");
                    put("reason","启动优化，代码变更导致");
                    put("failType","舆情反馈");
                    put("name","天猫新享礼金红包使用不符合业务预期");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082300000003001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tmAppName);
                    put("type","业务正常");
                    put("reason","爬虫");
                    put("failType","成功量下跌");
                    put("name","tm成功率（买到卖出）_PC已买到_成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082100000018001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tp3AppName);
                    put("type","故障");
                    put("reason","sigama容器变更");
                    put("failType","成功量下跌");
                    put("name","淘宝付款申请");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019082000000011001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",icAppName);
                    put("type","故障");
                    put("reason","dump数据延迟导致");
                    put("failType","舆情反馈");
                    put("name","部分天猫商家未上架宝贝在仓库中不展示");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019081500000017001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",icAppName);
                    put("type","故障");
                    put("reason","gpf-tmall switch开关推送导致npe");
                    put("failType","舆情反馈");
                    put("name","部分天猫商家反馈商品发布失败");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019081500000001001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","容灾演练");
                    put("reason","NA620云上IOHang容灾演练");
                    put("failType","成功量下跌");
                    put("name","NA620云上IOHang容灾演练");
                }}
        );

        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092300000064001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tp3AppName);
                    put("type","故障");
                    put("reason","下发Qos配置");
                    put("failType","成功量下跌");
                    put("name","非压测秒级付款申请_tp3");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019110700000018001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","压测导致交易下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019110700000002001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","压测导致交易下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019110600000006001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",cartAppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功率下跌");
                    put("name","carts2服务");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019110600000004001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",tmAppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功率下跌");
                    put("name","无线TM订单");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019110600000003001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","【压测】淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019110600000002001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",tmAppName);
                    put("type","压测");
                    put("reason","压测限流，扩容后恢复");
                    put("failType","成功率下跌");
                    put("name","无线TM订单");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019110600000001001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","【压测】淘宝交易创建下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019102900000009001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app","igraph");
                    put("type","故障");
                    put("reason","igraph发布导致超时");
                    put("failType","成功率下跌");
                    put("name","看评价指标");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019102400000003001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app",tp3AppName);
                    put("type","容灾演练");
                    put("reason","断网演练导致");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019102400000001001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019102200000009001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app",tp3AppName);
                    put("type","业务正常");
                    put("reason","于11:51分，淘宝付款成功量下跌超过3%，于12:00分恢复。12:02分再次下跌，跌幅超过5%。经确认11:51分的下跌是热点商品下架，12:00之后的下跌是正常业务逻辑。故障取消，请知晓。");
                    put("failType","成功量下跌");
                    put("name","淘宝付款成功量下跌超过5%");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019102200000002001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",rp2AppName);
                    put("type","业务正常");
                    put("reason","正常业务逻辑波动");
                    put("failType","成功率下跌");
                    put("name","卖家同意退款提交后端rp2接口近5min成功率低于80%");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019102100000050001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","突袭");
                    put("reason","ic2 TDDL 超时注入");
                    put("failType","成功率下跌");
                    put("name","(SPE灰度)环境_淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101900000005001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",icAppName);
                    put("type","压测");
                    put("reason","伟达、丘原反馈确认是压测导致：压了下优衣库的商品,原因是这批商品的SPUID在 影子表不存在。");
                    put("failType","成功率下跌");
                    put("name","天猫_总体指标_全部_成功率");
                }}
        );

        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101900000003001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","容灾演练");
                    put("reason","集团破坏性演练导致");
                    put("failType","成功量下跌");
                    put("name","集团交易下跌超过50%");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101900000001001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","20191018全链路压测");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101800000030001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",rp2AppName);
                    put("type","压测");
                    put("reason","菜鸟压测导致");
                    put("failType","成功量下跌");
                    put("name","上门取件申请提交rp2接口-成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101800000029001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","压测");
                    put("reason","压测导致");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建成功量");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101700000001001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app","buy2");
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","压测导致交易下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101600000022001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",rp2AppName);
                    put("type","压测");
                    put("reason","压测预期");
                    put("failType","失败量");
                    put("name","获取上门取件入口rp2接口");
                }}
        );

        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101600000001001?",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","非压测秒级付款申请_tp3");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101400000001001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tp3AppName);
                    put("type","故障");
                    put("reason","充值账号余额不足导致无法支付");
                    put("failType","成功量下跌");
                    put("name","淘宝付款成功异常");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101300000004001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",rp2AppName);
                    put("type","业务正常");
                    put("reason","正常业务波动");
                    put("failType","成功率下跌");
                    put("name","卖家拒绝提交后端rp2接口-成功率");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101200000024001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",tp3AppName);
                    put("type","故障");
                    put("reason","目前分析是消息中心为支持压测进行集群扩容，扩容会触发队列漂移（部分队列从老机器漂移到新扩容的机器），期间老机器会对漂移走的队列进行关闭操作，需要清理堆外缓存，初步判断是单机漂移的队列数较多，使清理堆外缓存线程的工作负载过大（疑似存在大量segment锁争抢），导致CPU几乎被打满，单机吞吐能力下降，进而导致业务发消息耗时变高甚至超时，并疑似引发上游发消息链路的雪崩，导致大量付款失败。目前已临时通过禁止队列漂移止血，根因定位和彻底的修复方案还在继续进行中，有相应结果会及时同步。");
                    put("failType","成功量下跌");
                    put("name","1012蚂蚁金服交易付款，淘宝付款成功量等多业务下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101100000013001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",fpAppName);
                    put("type","故障");
                    put("reason","9:16开始汇金平台支付成功回调服务异常，影响相关钉钉、服务市场服务支付成功权益未生效。初步分析是汇金bus调度异常，已于9:50左右bus服务扩容后调度恢复正常，钉钉、服务市场等服务恢复正常。详细原因汇金开发排查中");
                    put("failType","舆情反馈");
                    put("name","汇金平台支付成功未回调影响钉钉/服务市场");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101000000028001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","突袭");
                    put("reason","UMP连接池打满");
                    put("failType","成功量下跌");
                    put("name","(SPE灰度)环境_淘宝交易创建下跌超过10%");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101000000005001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","突袭");
                    put("reason","IPM线程池满");
                    put("failType","成功量下跌");
                    put("name","(SPE灰度)环境_淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019101000000003001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","突袭");
                    put("reason","TP3磁盘满");
                    put("failType","成功量下跌");
                    put("name","(SPE灰度)环境_淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019100900000031001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app","buy2");
                    put("type","故障");
                    put("reason","buy2改造引起");
                    put("failType","舆情反馈");
                    put("name","天猫国际包税优惠失效导致部分本应包税订单产生税费");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019100500000003001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",umpAppName);
                    put("type","业务正常");
                    put("reason","于11:12分，卡券/线上券或权益/成功率 当前值 83.83%，于11:13分恢复，原因为老主库主机故障宕机触发了切换导致。");
                    put("failType","成功率下跌");
                    put("name","权益发放(goc监控系统维度错误)");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092400000021001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",detailAppName);
                    put("type","故障");
                    put("reason","【补录】0923建站压测较多舆情反馈详情页白屏，舆情反馈200+，初步排查为swift容量问题，扩容后解决，故障相关详细信息GOC正在收集确认，稍后更新，请知晓。");
                    put("failType","舆情反馈");
                    put("name","【20191111】【补录】0923建站压测较多舆情反馈详情页白屏，舆情反馈200+");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019100100000003001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app","buy2");
                    put("type","业务正常");
                    put("reason","国庆阅兵活动导致来源下跌");
                    put("failType","成功量下跌");
                    put("name","淘宝付款成功");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092700000033001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app","会员");
                    put("type","业务正常");
                    put("reason","菜鸟压测导致");
                    put("failType","成功率下跌");
                    put("name","会员注册成功率下跌最大跌幅超过95%");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092700000004001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app","buy2");
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功率下跌");
                    put("name","淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092600000037001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tp3AppName);
                    put("type","故障");
                    put("reason","压测切流导致");
                    put("failType","成功量下跌");
                    put("name","淘宝交易创建");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092600000029001",
                new HashMap<String, String>() {{
                    put("level","p1");
                    put("app",rf2AppName);
                    put("type","故障");
                    put("reason","代码变更，前端资源版本错误");
                    put("failType","成功量下跌");
                    put("name","退款发起量下跌超过60%");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092600000010001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tmAppName);
                    put("type","业务正常");
                    put("reason","爬虫");
                    put("failType","成功量下跌");
                    put("name","TM已卖出");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092500000025001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app",icAppName);
                    put("type","故障");
                    put("reason","系统切流灰度导致");
                    put("failType","舆情反馈");
                    put("name","商家中心-出售中的宝贝-宝贝编辑页面无法打开，报错显示504");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092400000036001",
                new HashMap<String, String>() {{
                    put("level","p3");
                    put("app",tp3AppName);
                    put("type","故障");
                    put("reason","原因初步怀疑是网络设备lsw ospf抖动，导致spanner到后端业务服务器的路由失效，造成业务下跌。");
                    put("failType","成功量下跌");
                    put("name","[根因未知]0924支付宝交易创建下跌");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019092400000011001",
                new HashMap<String, String>() {{
                    put("level","p2");
                    put("app",tp3AppName);
                    put("type","压测");
                    put("reason","压测限流");
                    put("failType","成功量下跌");
                    put("name","淘宝付款成功");
                }}
        );
        allCrashOnline8to11.put(
                "https://g.alibaba-inc.com/ormFailure/workbench/failure/2019100400000004001",
                new HashMap<String, String>() {{
                    put("level","p4");
                    put("app","regionserver");
                    put("type","故障");
                    put("reason","full gc导致");
                    put("failType","舆情反馈");
                    put("name","天猫商家发布商品后放到仓库，但在仓库里无法找到");
                }}
        );
        /*
        allCrashOnline8to11.put(
            "",
            new HashMap<String, String>() {{
                put("level","");
                put("app","");
                put("type","");
                put("reason","");
                put("failType","");
                put("name","");
            }}
        );
        */






        Map<String,Integer> typeConut = new HashMap<String, Integer>();
        Map<String,Integer> failTypeConut = new HashMap<String, Integer>();
        Map<String,Integer> levelConut = new HashMap<String, Integer>();
        Map<String,Integer> appConut = new HashMap<String, Integer>();
        Map<String,Integer> realAppCount = new HashMap<String, Integer>();
        Map<String,Integer> reasonConut = new HashMap<String, Integer>();

        int totalCount = 0;
        for (Map.Entry<String, Map<String,String>> entry : allCrashOnline8to11.entrySet()) {
            entry.getValue();
            totalCount = totalCount+1;
            if(!typeConut.containsKey(entry.getValue().get("type"))){
                typeConut.put(entry.getValue().get("type"),1);
            }else{
                typeConut.put(entry.getValue().get("type"),typeConut.get(entry.getValue().get("type"))+1);
            }


            if(!failTypeConut.containsKey(entry.getValue().get("failType"))){
                failTypeConut.put(entry.getValue().get("failType"),1);
            }else{
                failTypeConut.put(entry.getValue().get("failType"),failTypeConut.get(entry.getValue().get("failType"))+1);
            }

            if(!levelConut.containsKey(entry.getValue().get("level"))){
                levelConut.put(entry.getValue().get("level"),1);
            }else{
                levelConut.put(entry.getValue().get("level"),levelConut.get(entry.getValue().get("level"))+1);
            }

            if(!appConut.containsKey(entry.getValue().get("app"))){
                appConut.put(entry.getValue().get("app"),1);
            }else{
                appConut.put(entry.getValue().get("app"),appConut.get(entry.getValue().get("app"))+1);
            }

            if(!reasonConut.containsKey(entry.getValue().get("reason"))){
                reasonConut.put(entry.getValue().get("reason"),1);
            }else{
                reasonConut.put(entry.getValue().get("reason"),reasonConut.get(entry.getValue().get("reason"))+1);
            }

            if(entry.getValue().get("type").equals("故障")&&!entry.getValue().get("failType").equals("舆情反馈")){
                if(!realAppCount.containsKey(entry.getValue().get("reason"))){
                    realAppCount.put(entry.getValue().get("reason"),1);
                }else{
                    realAppCount.put(entry.getValue().get("reason"),realAppCount.get(entry.getValue().get("reason"))+1);
                }

            }

        }

        /*
        System.out.print("故障总数："+totalCount+"\n");
        System.out.print("故障分类："+typeConut+"\n");
        System.out.print("故障来源："+failTypeConut+"\n");
        System.out.print("故障等级："+levelConut+"\n");
        System.out.print("app分布："+appConut+"\n");
        System.out.print("故障app分布："+realAppCount+"\n");
        System.out.print("根因分布："+reasonConut+"\n");
        */

//        for (Map.Entry<String, Integer> entry : reasonConut.entrySet()) {
//            System.out.println(entry.getKey()+"-"+entry.getValue());
//        }

//        for (Map.Entry<String, Map<String,String>> entry : allCrashOnline8to11.entrySet()) {
//            System.out.println(entry.getKey() + " -" + entry.getValue().get("reason"));
//        }

        int i=1;
        for (Map.Entry<String, Map<String,String>> entry : allCrashOnline8to11.entrySet()) {
            if(entry.getValue().get("reason").contains("代码") || entry.getValue().get("reason").contains("发布") ||
                    entry.getValue().get("reason").contains("配置") || entry.getValue().get("reason").contains("变更") ||
                    entry.getValue().get("reason").contains("改造")){
                if(entry.getValue().get("type").equals("故障")||entry.getValue().get("type").equals("突袭")){
                    System.out.println(i + "-" + entry.getValue().get("app") + "-" + entry.getValue().get("failType")+ "-" + entry.getValue().get("reason"));
                    System.out.println(entry.getKey());
                    i++;
                }
            }
        }





    }
}
