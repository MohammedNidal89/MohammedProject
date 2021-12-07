/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercies;

import java.util.Scanner;

/**
 *
 * @author mohammed
 */
public class Exercies {

    static Scanner input = new Scanner(System.in);

    static void exeriseOne() {
        System.out.println("أدخل جميع علامات الطلاب التي تريد حساب مجموعها ومعدلها");
        System.out.println("ضع أي رقم سالب في حال الانتهاء من ادخال العلامات");
        double sum = 0, in;
        int count = 0;
        boolean y = true;
        while (y) {
            in = input.nextDouble();
            count++;
            sum += in;
            if (in < 0) {
                count -= 1;
                break;
                // y=false;
            }
        }
        //System.out.println(count);
        System.out.println("مجموع العلامات: " + sum);
        System.out.println("معدل العلامات: " + (sum / count));

    }

    static void exeriseTwo() {
        System.out.println("خمن الرقم الذي بين الصفر والمئة");
        int num = (int) (Math.random() * 100);
       // System.out.println(num);
        while (true) {

            int userInput = input.nextInt();
            if (userInput == num) {
                System.out.println("اجابة صحيحة");
                System.out.println("هل تريد اللعب مرة أخرى؟");
                System.out.println("1: Yes");
                System.out.println("2:No");
                userInput = input.nextInt();
                if (userInput == 2) {
                    System.out.println("تم انهاء اللعبة");
                    break;
                } else {
                    System.out.println("خمن الرقم الذي بين الصفر والمئة");
                    //continue;
                }
            } else if (userInput > num) {
                System.out.println("أكبر من المتوقع");
            } else {
                System.out.println("أصغر من المتوقع");
            }

        }

    }

    static void exeriseThree() {
        System.out.println("أدخل الرقم الذي تريد ايجاد مضروبه");
        int p = input.nextInt(), mult = 1;
        if (p > 0) {
            for (int i = p; p > 0; p--) {
                mult = mult * p;
            }
            System.out.println("مضروب العدد هو " + mult);

        } else {
            System.out.println("خطأ لا يمكن حساب ارقام سالبة");
        }
    }

    static void fillMyArray(int[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            System.out.println("أدخل الرقم الجامعي للطالب رقم " + (i + 1));
            anyArray[i] = input.nextInt();

        }
        System.out.println("تم ادخال البيانات بنجاح");

    }

    static void printMyArray(int[] anyArray) {
        for (int i = 0; i < anyArray.length; i++) {
            System.out.print(anyArray[i] + " ");

        }
        System.out.println("");
    }

    static int findMyask(int array[], int here) {
        int y = -3;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == here) {
                y = 3;
            }

        }
        return y;

    }

    public static void main(String[] args) {
        /*
                       بسم الله الرحمن الرحيم
      محمد نضال أحمد الزيناتي                 : اسم الطالب
                       120210178 : الرقم الجامعي
                       محمود خليل: اسم المدرس
        
        */
        
        
        
 // برنامج يقوم بادخال الارقام الجامعية لعدد من الطلاب يتم تحديد عددهم ومن ثم يقوم بادخال القيم وطباعتها اذا اراد والبحث عن رقم معين اذا اراد : أولا
        
        /*
        System.out.println("كم عدد الطلاب الذين تريد ادخال أرقامهم؟");
        int limit = input.nextInt();
        int myArray[] = new int[limit];
        fillMyArray(myArray);
        System.out.println("هل تريد طباعة جميع الارقام الجامعية الخاصة بالطلاب؟");
        System.out.println("1: أجل");
        System.out.println("2: لا");
        int answer = input.nextInt();
        if (answer == 1) {
            printMyArray(myArray);
        } else {
            System.out.println("تم الغاء عملية الطباعة");
        }
        System.out.println("هل تريد البحث عن رقم معين؟");
        System.out.println("1: أجل");
        System.out.println("2: لا");
        int answer2 = input.nextInt();
        if (answer2 == 1) {

            System.out.println("أدخل الرقم:");
            int answer3 = input.nextInt();
            int result = findMyask(myArray, answer3);
            if (result > 0) {
                System.out.println("تم ايجاد الرقم الجامعي");
            } else {
                System.out.println("لم يتم ايجاد الرقم الجامعي");
            }

        } else {
            System.out.println("تم الغاء عملية البحث عن رقم معين");
        }
*/
        //***********************************************************************************
        
        
        
    //   برنامج يقوم بادخال علامات عدد غير محدد من الطلاب وطباعة مجموعهن ومعدلهن عندما يريد   :ثانيا
       /*
    exeriseOne();
       */
       
        //*********************************************************
        
        
        
         // برنامج يقوم بتخمين رقم معين بين الصفر والمئة وعلى المستخد تخمين ذالك الرقم:ثالثا
         /*
        exeriseTwo();
        
        */
         
        //*************************************************************
        
         // برنامج يقوم بايجاد مضروب العدد الذي تريده أنت:رابعا
         /*
        exeriseThree();
        */
        
        // اللهم صل على محمد
    }

}
