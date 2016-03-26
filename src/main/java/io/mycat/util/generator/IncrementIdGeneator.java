package io.mycat.util.generator;

/**
 * @ClassName: IncrementIdGeneator
 * @Description:id生成器接口
 * @author chenlinlin
 * @date 2016年3月26日 下午2:33:00
 */
public interface IncrementIdGeneator {

	/**
	 * 生成递增ID，长度为18位 如：201602030000000001 <br />
	 * 8位日期+10位当天递增ID
	 * 
	 * @param sequenceName 序列名称，不同序列下单独递增
	 * @return
	 */
	public String generateId(String sequenceName);

	/**
	 * 带前缀的递增ID 格式为：前缀+递增ID 如：P2P201602030000000001
	 * 
	 * @param sequenceName 序列名称，不同序列下单独递增
	 * @param prefix 前缀
	 * @return
	 */
	public String generateIdWithPrefix(String sequenceName, String prefix);

}
