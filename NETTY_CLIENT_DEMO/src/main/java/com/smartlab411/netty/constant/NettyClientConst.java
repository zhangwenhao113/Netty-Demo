package com.smartlab411.netty.constant;

/**
 * 
 * @ClassName: NettyClientConst
 * @Description: Netty客户端常量
 * @Author zhangwenhao
 * @DateTime 2022年4月14日
 */
public class NettyClientConst {

	/**
	 * 服务端IP
	 */
	public static final String IP = "127.0.0.1";

	/**
	 * 服务端绑定端口
	 */
	public static final int PORT = 8080;

	/**
	 * 重连时间(单位: 秒)
	 */
	public static final int RECONNECT_TIME = 5;

	/**
	 * 客户端空闲时间/心跳发送间隔(单位: 秒)
	 */
	public static final int IDLE_TIME = 10;

	/**
	 * 心跳超时时间(单位: 秒)
	 */
	public static final int HEART_TIMEOUT = 30;
	
	/**
	 * 客户端连接服务端超时时间(单位: 秒)
	 */
	public static final int CONNECT_TIMEOUT = 30;

	/**
	 * 发送服务端心跳
	 */
	public static final byte[] HEART_BEAT = new byte[]{0x11};

	/**
	 * 服务端回复心跳
	 */
	public static final byte[] RETURN_HEART_BEAT = new byte[]{0x12};
	
	/**
	 * 包头 使用的是字节 默认0xFE
	 */
	public static final byte PACKAGE_HEAD = -2;
	
	/**
	 * 包尾 使用的是字节 默认0x55
	 */
	public static final byte PACKAGE_END = 85;
	
	/**
	 * 包头第一个字符, 使用的是ASCII码，默认F
	 */
	public static final byte HEAD_ONE = 70;
	
	/**
	 * 包头第二个字符, 使用的是ASCII码，默认E
	 */
	public static final byte HEAD_TWO = 69;
	
	/**
	 * 包尾第一个字符，使用的是ASCII码，默认5
	 */
	public static final byte END_ONE = 53;
	
	/**
	 * 包尾第一个字符，使用的是ASCII码，默认5
	 */
	public static final byte END_TWO = 53;
	
	/**
	 * 包长字符/字节长度
	 * <br>
	 * 即包长在数据包所占的长度: 在字节流解码中,若包长字节长度为1,则这个数据包最大长度为255，因为1byte最大表示长度为255
	 * 在字符流解码中, PACKAGE_LENGTH必须为偶数! 若包长字节长度为2，则这个数据包最大长度为255，因为2个字符最大表示长度为FF, 即255
	 */
	public static final int PACKAGE_LENGTH = 4;
	
	/**
	 * 解码方式: 0.不做任何解析 1.字节流解码 2. 字符流解码
	 */
	public static final int DECODE_WAY = 0;

}
