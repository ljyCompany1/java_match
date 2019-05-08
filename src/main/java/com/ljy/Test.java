package com.ljy;

public class Test {
    public static void main(String[] args) {
        char c='1';
        int a=c;
        System.out.println((int)c);
        System.out.println(new Integer(31111).compareTo(51));
        System.out.println(new String("1").compareTo("91"));
        System.out.println(new String("111").compareTo("161"));
        /*List<String> list=new ArrayList<String>(){{
            add("13");
            add("38");
            add("387");
            add("3876");
        }};
        Collections.sort(list);
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
            stringBuilder.append(list.get(i));
        }
        System.out.println(stringBuilder.toString());*/
    }
}
