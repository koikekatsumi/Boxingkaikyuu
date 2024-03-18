package com.koike;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Boxer boxing1 = new Boxer("寺田拳四朗", "ライトフライ級", 6);
        Boxer boxing2 = new Boxer("山中慎介", "バンダム級", 12);
        Boxer boxing3 = new Boxer("長谷川穂積", "バンダム級", 11);
        Boxer boxing4 = new Boxer("畑山隆則", "スーパーフェザー級", 1);
        Boxer boxing5 = new Boxer("辰吉丈一郎", "バンダム級", 3);
        Boxer boxing6 = new Boxer("井上尚弥", "スーパーバンダム級", 1);

        List<Boxer> boxingList = new ArrayList<>();
        boxingList.add(boxing1);
        boxingList.add(boxing2);
        boxingList.add(boxing3);
        boxingList.add(boxing4);
        boxingList.add(boxing5);
        boxingList.add(boxing6);

        for (Boxer boxing : boxingList) {
            if ((boxing.getWeight().equals("バンダム級")) && (boxing.getDefense() > 10)) {
                System.out.println(boxing.getName() + "は、スーパー王者です");
            } else if (boxing.getWeight().equals("スーパーフェザー級")) {
                System.out.println(boxing.getName() + "は、軽重量級です");
            } else if (boxing.getWeight().equals("ライトフライ級")) {
                System.out.println(boxing.getName() + "は、超軽量級です");
            }
        }
    }
}





