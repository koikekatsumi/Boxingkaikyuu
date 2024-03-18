package com.koike;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BoxingData boxing1 = new BoxingData("寺田拳四朗", "ライトフライ級", 6);
        BoxingData boxing2 = new BoxingData("山中慎介", "バンダム級", 12);
        BoxingData boxing3 = new BoxingData("長谷川穂積", "バンダム級", 11);
        BoxingData boxing4 = new BoxingData("畑山隆則", "スーパーフェザー級", 1);
        BoxingData boxing5 = new BoxingData("辰吉丈一郎", "バンダム級", 3);
        BoxingData boxing6 = new BoxingData("井上尚弥", "スーパーバンダム級", 1);

        List<BoxingData> boxingList = new ArrayList<>();
        boxingList.add(boxing1);
        boxingList.add(boxing2);
        boxingList.add(boxing3);
        boxingList.add(boxing4);
        boxingList.add(boxing5);
        boxingList.add(boxing6);

        for (BoxingData boxing : boxingList) {
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





