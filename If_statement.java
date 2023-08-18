package practice_programs;
public class If_statement {
    public static void main(String[] args){
        int i,count, count1, count2;
        float[] weight = {45.0f,55.0f,47.0f,51.0f, 54.0f};
        float[] height = {176.5f, 174.2f, 168.0f, 170.0f, 169.0f};
        count = count1 = 0;
        for(i=0; i<=4; i++){
            if(weight[i]<50.0f && height[i]>170.0f){
                count1++;
            }
            count++;
        }
        count2 = count - count1;
        System.out.println("Number of persons with....");
        System.out.println("Weight < 50 And height > 170 is : "+count1);
        System.out.println("Others :  "+count2);
    }
}
