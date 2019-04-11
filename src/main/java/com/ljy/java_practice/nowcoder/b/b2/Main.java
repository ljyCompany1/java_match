package com.ljy.java_practice.nowcoder.b.b2;



/**
 * 1.题目：
 * （1）题目描述：有两个用字符串表示的非常大的大整数,算出他们的乘积，也是用字符串表示。不能用系统自带的大整数类型。
 * （2）输入描述：空格分隔的两个字符串，代表输入的两个大整数
 * （3）输出描述：输入的乘积，用字符串表示
 * （4）例如：
 * 输入：72106547548473106236 982161082972751393
 * 输出：70820244829634538040848656466105986748
 * 2.思路
 * （1）正确思路：用字符串模拟进位计算
 * （2）容易错误的思路：
 * 直接用Long类型或BigDecimal计算
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(ir);
        String message=bf.readLine();//根据题目输入要求：获取控制台录入的字符串
        String[] str = message.split(" ");
        if(str.length==2){
            String a=str[0];
            String b=str[1];
            count(a,b);
        }
    }

    public static void count(String a,String b){
        //先统一将字符串转化法int数组，这样性能比每次计算都转换整型要高
        char[] aStringArray = a.toCharArray();//char数组
        char[] bStringArray = b.toCharArray();//char数组
        int[] aIntArray = new int[aStringArray.length];
        int[] bIntArray = new int[bStringArray.length];
        int[] resultIntArray=new int[aStringArray.length+bStringArray.length];//保存计算结果，根据乘法规则最大位数得出
        for(int i=0;i<aIntArray.length;i++){//将a转化为整型数组
            aIntArray[i]= Integer.parseInt(String.valueOf(aStringArray[i]));
        }
        for(int i=0;i<bIntArray.length;i++){//将b转化为整型数组
            bIntArray[i]= Integer.parseInt(String.valueOf(bStringArray[i]));
        }
        //从低位计算（如123*456，先计算3*6），此时不用考虑进位，留到最后再计算
        //结果可能为[6,323,534,341,334,1],因此后面需要统一进行进位计算
        for(int i=aIntArray.length;i>=1;i--){//易错点，注意这里不能用int i=aIntArray.length-1
            for(int j=bIntArray.length;j>=1;j--){//易错点，注意这里不能用int j=bIntArray.length-1
                int result=aIntArray[i-1]*bIntArray[j-1];//和前面两个易错点呼应，这里如果使用aIntArray[i]*bIntArray[j]会导致最低位数不正确
                resultIntArray[i+j-1]+=result;
            }
        }
        //针对可能的结果（如[6,323,534,341,334,1]）,统一进行进位计算
        for(int i=resultIntArray.length-1;i>=0;i--){//必须从低位开始计算
            int result=resultIntArray[i];
            int units=result%10;//获取个位数
            int tens=result/10;//获取十位数以上的数值，包括（例如1321/10=132）
            resultIntArray[i]=units;
            if(i>0){//只要不是最高位，都将进位后的值累加到高位
                resultIntArray[i-1]+=tens;
            }
        }
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = 0; i < resultIntArray.length; i++) {
            stringBuilder.append(resultIntArray[i]);
        }
        String result=stringBuilder.toString();
        result=result.replaceFirst("0*", ""); //去掉高位的0
        System.out.println(result);
    }
}
