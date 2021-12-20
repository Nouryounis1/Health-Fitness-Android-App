package com.crazytrends.nymanagerhelath.WalkandStep.models;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Arrays;
import java.util.List;


@RunWith(Parameterized.class)
public class ParameterizedTest {

    private int mInput01;
    private int mExpect;




    public ParameterizedTest(int input01,  int expected){
        mInput01 = input01;
        mExpect = expected;
    }



    @Parameterized.Parameters
    public static List<Object[]> data(){
        return Arrays.asList(new Object[][]{
                {2, 100},
                {3, 120},
                {4, 140},
                {6, 160},
                {8, 180},
                {10, 200}
        });
    }


    @Test
    public void additions_test() {
        int healthy_weight, height;
         height = mInput01  ;
         healthy_weight = height * height * 25;

         assertEquals(mExpect,healthy_weight);
    }



    @RunWith(Parameterized.class)
    public static  class   ParameterizedTest2 {
        private int mInput01;
        private int mInput02;
        private int mExpect2;




        public ParameterizedTest2(int input01,int input02,  int expected){
            mInput01 = input01;
            mInput02 = input02;
            mExpect2 = expected;
        }



        @Parameterized.Parameters
        public static List<Object[]> data(){
            return Arrays.asList(new Object[][]{
                    {10,200 ,1426},
                    {11,210 ,1446},
                    {12,220 ,1466},
                    {13,230 ,1486},
                    {14,240 ,1506}
            });
        }


        @Test
        public void additions_test2() {
            int height = mInput01;

            int weight = mInput02;

            int bmi = (int) (weight / Math.pow(height, 2) * 703);

            if (bmi < 18.5) {
                System.out.println("underweight");
            } else if (bmi < 25) {
                System.out.println("normal");
            } else if (bmi < 30) {
                System.out.println("overweight");
            } else {
                System.out.println("obese");
            }
            System.out.println(bmi);
            assertEquals(mExpect2, bmi);


        }




    }


}




