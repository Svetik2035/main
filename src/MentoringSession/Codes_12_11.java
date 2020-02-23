package MentoringSession;

import java.util.Arrays;

public class Codes_12_11 {
    public static void main(String[] args) {
                int [] nums1 ={2,4,1,34,8};
                int [] nums2 ={2,4,1,34,8};
                boolean checkIfarraysEqual=true;
                if(nums1.length!=nums2.length){
                    checkIfarraysEqual=false;
                    System.out.println("Arrays are no equal. Have different amount of elements");
                }else{
                    for(int i=0; i< nums1.length; i++){
                        if(nums1[i]!=nums2[i]){
                            checkIfarraysEqual=false;
                            break;
                        }

                    }
                }
                System.out.println(checkIfarraysEqual);
        /**
         * nums1 ={2,4,1,34,8};
         * nums2 ={2,8,1,2,8};
         * Check for equality:
         * 1. Check if our arrays have the same amount of elements.
         *  If yes -> we check if each element in nums1 equal to each element in nums2.
         *  If no -> Out arrays are not equal for sure.
         *  2. If yes -> we check if each element in nums1 equal to each element in nums2.
         *   If  we find at least 1 case when element on certain position in nums1 is not equal to element
         *   from nums2 on the same position.
         *   Then we do not need to check all other cases (use key word brake) and
         *   we know for sure our arrays are not equal.
         */

        System.out.println("---------------- check for minimum----------------");
        int [] nums ={2,4,1,34,8};
        int temp = 0;
        for (int i = 0; i < nums.length ; i++) {
            for (int j = i+1; j <nums.length  ; j++) {
                if(nums[i]>nums[j]){
                    temp=nums[i];
                    nums[i]=nums[j];
                      nums[j] = temp;
                }

            }

        }

        System.out.println(Arrays.toString(nums));

        System.out.println("-----------------check maximum---------------");
        }


        }