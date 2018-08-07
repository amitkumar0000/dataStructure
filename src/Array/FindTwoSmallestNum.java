package Array;

public class FindTwoSmallestNum {

    public void smallestNum(int[] arr){
        int s1 = arr[0];
        int s2 = arr[0];
        if(arr.length > 2){
            s1 = arr[0];
            if(s1 < arr[1]){
                s2 = arr[1];
            }else{
                s1 = arr[1];
                s2 = arr[0];
            }
            for(int i =2; i<arr.length; i++){
                if(arr[i] < s2 && arr[i] > s1)
                    s2 = arr[i];
                else if(arr[i] < s1){
                    s2 = s1;
                    s1 = arr[i];
                }
            }
        }

        System.out.println("\nS1::" + s1 + " S2::"+ s2);
    }
}
