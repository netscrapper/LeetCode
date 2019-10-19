class Solution {
    public int numberOfArithmeticSlices(int[] A) {
        if(A.length<3) return 0;
        int diff = A[1]-A[0];
        int curr = 1;
        int ret = 0;
        for(int i = 1; i < A.length; i++) {
            if(A[i] - A[i-1] == diff) {
                curr++;
            } else {
                if(curr>2) {
                    for(int j = curr; j>=3; j--) {
                        ret+= curr-j+1;
                    }
                }
                curr = 2;
                diff = A[i]-A[i-1];
            }
        }
        if(curr>2) {
            for(int j = curr; j>=3; j--) {
                ret+= curr-j+1;
            }
        }
        return ret;
    }
}