package utils;

public class HammingAndSimilarityUnit {
    /**
     * 计算相似度
     * @param simHash1
     * @param simHash2
     * @return 返回double类型的相似度
     */
    public static double SimilarityResult(String simHash1, String simHash2) {
        // 计算海明距离（海明距离越小 文本越相似）
        int distance = 0;
        for(int i = 0; i < simHash1.length(); i++) {
            if(simHash1.charAt(i) != simHash2.charAt(i)) distance++;
        }
        // 计算相似度 distance最大为128(完全不同) 最小为0(完全一致)
        return 1.0 - (double)distance / simHash1.length();
    }
}
