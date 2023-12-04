

public class majorityEleMoreThanNbyTwo {
    public static int majorityElement(int []v) {
        int n = v.length;

        for(int i = 0; i < n; i++) {
            int count = 0;
            for(int j = 0; j < n; j++) {
                if(v[j] == v[i]) {
                    count++;
                }
            }
            if(count > (n / 2)) {
                return v[i];
            }
        }
        return n;
    }
    

    public static void main(String[] args) {
        int[] v = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(v);
        System.out.println("The majority element is: " + ans);
    }
}

// TC -> O(N ^ 2) N is the size of the arr
// there are 2 for loops
// for every element of the array the inner loop runs for N times and there 
// are N elements ink the array.

// SC -> O(1) no extra space