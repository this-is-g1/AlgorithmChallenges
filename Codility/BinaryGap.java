class BinaryGap {
    public int solution(int N) {
        int countGap = 0;
        int maxBinaryGap = 0;
        boolean isCounting = false;
        
        while (true) {
            if ((N & 1) == 1) {
                if (!isCounting) {
                    isCounting = true;
                } else {
                    if (countGap > maxBinaryGap) {
                        maxBinaryGap = countGap;
                    }
                }
                countGap = 0;
            } else {
                countGap++;
            }
            N = N >> 1;
            if (N == 0) break;
        }

        return maxBinaryGap;
    }
}