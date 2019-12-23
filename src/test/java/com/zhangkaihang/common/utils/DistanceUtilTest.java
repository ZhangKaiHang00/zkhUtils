package com.zhangkaihang.common.utils;

import static org.junit.Assert.*;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

import org.junit.Test;

public class DistanceUtilTest {

	@Test
	public void testGetDistance() throws IOException {
		//目标坐标
		double j=116.425249;//经度
		double w=39.914504;//维度
		//读入数据
		List<String> read = StreamUtil.read(this.getClass().getResourceAsStream("/data.txt"));
		for (String str : read) {
			String[] s = str.split(",");
			double d = DistanceUtil.getDistance(j,w,Double.parseDouble(s[2]), Double.parseDouble(s[3]));
			DecimalFormat df = new DecimalFormat("#.00");
			System.out.println("该车距离目标的距离为："+df.format(d)+"米");
		}
		
	}
}
