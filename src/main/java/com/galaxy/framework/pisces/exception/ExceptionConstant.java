package com.galaxy.framework.pisces.exception;

/**
 * Created by hanlei6 on 2017/12/11.
 */
public interface ExceptionConstant {
    interface APIException {
        class Code {
            public final static String API = "1000";
            public final static String AUTHORIZE = "1001";
            public final static String DATAVERSION = "1002";
            public final static String DEVIATION = "1003";
            public final static String ENCRYPT = "1004";
            public final static String REGISTRY = "1005";
            public final static String VERIFICATION = "1006";
            public final static String FUSE = "1007";
            public static final String LOCK = "1008";
        }

        class Message {
            public final static String API = "目标服务器业务处理失败";
            public final static String AUTHORIZE = "授权异常";
            public final static String DATAVERSION = "与持久层数据版本不一致异常";
            public final static String DEVIATION = "与给定数据范围不一致异常";
            public final static String ENCRYPT = "加解密异常";
            public final static String REGISTRY = "未注册异常";
            public final static String VERIFICATION = "身份校验异常";
            public final static String FUSE = "服务开启熔断降级，请求被强制熔断";
            public static final String LOCK = "获取全局锁失败,锁路径为: %s";
        }
    }

    interface FormatException {
        class Code {
            public final static String FORMAT = "1100";
            public final static String JSON = "1101";
            public final static String NUMBER = "1102";
            public final static String OBJECT = "1103";
            public final static String STRING = "1104";
        }

        class Message {
            public final static String FORMAT = "数据格式化异常";
            public final static String JSON = "转JSON出现异常";
            public final static String NUMBER = "转数字出现异常";
            public final static String OBJECT = "转对象出现异常";
            public final static String STRING = "转字符串出现异常";
        }
    }

    interface RuleException {
        class Code {
            public final static String RULE = "1200";
            public final static String EMPTY = "1201";
            public final static String GRAMMAR = "1202";
        }

        class Message {
            public final static String RULE = "业务规则异常";
            public final static String EMPTY = "禁止为空异常";
            public final static String GRAMMAR = "语法错误异常";
        }
    }

    interface PlatformException {
        class Code {
            public final static String PLATFORM = "1300";
            public final static String JSF = "1301";
            public final static String JMQ = "1302";
            public final static String JIMDB = "1303";
            public final static String JFS = "1304";
            public final static String MAIL = "1305";
            public final static String SMS = "1306";
            public final static String DONGDONG = "1307";
        }

        class Message {
            public final static String PLATFORM = "平台异常";
            public final static String JSF = "JSF连接异常";
            public final static String JMQ = "JMQ连接异常";
            public final static String JIMDB = "JIMDB连接异常";
            public final static String JFS = "JFS连接异常";
            public final static String MAIL = "邮件系统连接异常";
            public final static String SMS = "短信连接异常";
            public final static String DONGDONG = "咚咚连接异常";
        }
    }

    interface DbException {
        class Code {
            public final static String DB = "1400";
            public final static String UPDATE = "1401";
            public final static String INSERT = "1402";
            public final static String DELETE = "1403";
            public final static String NOTEXIST = "1404";
            public final static String VERSION = "1404";
        }

        class Message {
            public final static String DB = "数据库操作异常";
            public final static String UPDATE = "数据更新异常";
            public final static String INSERT = "数据写入异常";
            public final static String DELETE = "数据删除异常";
            public final static String NOTEXIST = "数据不存在异常";
            public final static String VERSION = "数据版本不匹配异常";
        }
    }
}
