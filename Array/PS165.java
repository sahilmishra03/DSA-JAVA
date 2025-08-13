package Array;

public class PS165 {
    public static void main(String[] args) {
        int[] colors = {1,8,3,8,3};
        System.out.println(maxDistance(colors));
    }

    public static int maxDistance(int[] colors){
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < colors.length; i++) {
            for (int j = i+1; j < colors.length; j++) {
                if (colors[i]!=colors[j]) {
                    int value = Math.abs(j-i);

                    res=Math.max(value,res);
                }
            }
        }
        return res;
    }
}