package cosineSimilarity;

/**
 * Created by bingkunyang on 15/12/3.
 */
class Solution {
    /**
     * @param A: An integer array.
     * @param B: An integer array.
     * @return: Cosine similarity.
     */
    public double cosineSimilarity(int[] A, int[] B) {
        int ab = 0;
        double aa = 0.0;
        double bb = 0.0;
        if(A.length != B.length) return 2.0000;

        if(A.length==1 && A[0]==0 || B.length==1 && B[0]==0)
            return 2.0000;
        for(int i=0;i<A.length;i++){
            ab += A[i] * B[i];
            aa += A[i] * A[i];
            bb += B[i] * B[i];
        }
        if(aa==0 || bb==0) return 2.0000;
        aa = Math.sqrt(aa);
        bb = Math.sqrt(bb);
        return ab/(aa*bb);
    }
}