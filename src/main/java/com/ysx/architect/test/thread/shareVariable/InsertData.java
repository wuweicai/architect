package com.ysx.architect.test.thread.shareVariable;

import java.util.ArrayList;

class InsertData {
    private ArrayList<Integer> arrayList = new ArrayList<Integer>();

    public static ArrayList<Integer> arrayListStatic = new ArrayList<Integer>();

    public void insert(Thread thread){
        ArrayList<Integer> arrayList1 = new ArrayList<Integer>();
        for(int i=0;i<100;i++){
            System.out.println(thread.getName()+"在插入数据"+i);
            arrayList1.add(i);
            System.out.println((thread.getName()+arrayList1.toString()));

            arrayList.add(i);
            System.out.println((thread.getName()+"arrayList:"+arrayList.toString()));

            arrayListStatic.add(i);
            System.out.println((thread.getName()+"arrayListStatic:"+arrayListStatic.toString()));
        }



    }
}