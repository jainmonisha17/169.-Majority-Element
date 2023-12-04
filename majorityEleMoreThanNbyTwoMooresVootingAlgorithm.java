public class majorityEleMoreThanNbyTwoMooresVootingAlgorithm {
    
    public static int majorityEle(int[] arr) {
        int n = arr.length;
        int count = 0;
        int element = 0;

        // applying moore's algo

      for(int i = 0; i < n; i++) {
        if(count == 0) {
            count = 1;
            element = arr[i];
        } else if(element == arr[i]) {
            count++;
        } else {
            count--;
        }
      }

      //checking if stored element is the majority ele by again traversing

      int againCount = 0;
      for(int i = 0; i < n; i++) {
        if(arr[i] == element) {
            againCount++;
        }
      }

      if(againCount > (n / 2)) {
        return element;
      }
        return -1;
    }


    
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityEle(arr);
        System.out.println("The majority ele is:  " + ans);
    }
}

// TC -> O(N) + O(N)

//
