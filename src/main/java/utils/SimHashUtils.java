package utils;

import com.hankcs.hanlp.HanLP;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class SimHashUtils {
    /**
     * 用MD5计算hash值
     * @param str 需要计算hash值的字符串
     * @return 返回str的hash值
     */
    public static String getMD5Hash(String str) {
        try {
            // 创建MessageDigest实例并设为MD5算法
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 转化为字节数组
            byte[] bytes = md.digest(str.getBytes());
            // 用2进制字符串保存Hash值
            BigInteger num = new BigInteger(1, bytes);
            String hashText = num.toString(2);

            // 如果Hash值少于128位 在低位补0
            while(hashText.length() < 128) {
                hashText = hashText + "0";
            }

            return hashText;
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * 计算SimHash值
     * @param str 需要计算SimHash值的字符串
     * @return 返回str的SimHash值
     */
    public static String getSimHash(String str) {
        // 特征向量v：文本内容的数值化表示 包含了关键词的哈希值信息及权重
        int[] v = new int[128];
        // 提取所有关键词
        List<String> keywordList = HanLP.extractKeyword(str, str.length());

        // 加权 合并
        for(String keyword: keywordList) {
            // 获取每个关键词的hash值
            String keywordHash = getMD5Hash(keyword);
            for(int i = 0; i < v.length; i++) {
                int weight = 1;
                // keywordHash中的每一位：为1则增加权重 为0则减少权重
                if(keywordHash.charAt(i) == '1') {
                    v[i] += weight;
                } else {
                    v[i] -= weight;
                }
            }
        }

        // 降维（对于特征向量v从左往右遍历 v中第i位<=0则simHash中对应的第i记为0 否则为1）
        String simHash = "";
        for(int val: v) {
            if(val <= 0){
                simHash += "0";
            } else {
                simHash += "1";
            }
        }
        return simHash;
    }
}
