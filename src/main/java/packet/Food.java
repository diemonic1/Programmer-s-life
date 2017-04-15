package packet;

import java.util.Scanner;

public class Food {
    public static void main() {
        int r123 = 1;
        while (r123 == 1) {
            r123++;
            try {
                //читаем из файла
                Saving saving = FileReader.getSaving();
                while (true) {
                    System.out.println("     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n");
                    System.out.println(saving.getDen() + " рублей | " + saving.getHap() + " настроения | " + saving.getEne() + " энергии");
                    System.out.println("-----");
                    System.out.println("одежда - " + saving.getShmot());
                    System.out.println("компьютер - " + saving.getKomp());
                    System.out.println("проект - " + saving.getProject());
                    System.out.println("-----");
                    System.out.println("1:Заварить дошик  -50 рублей, +10 энергии, +3 настроения");

                    if (saving.getPr() >= 0) {
                        System.out.println("2:Купить пирожков -150 рублей, +25 энергии, +5 настроения");
                    }
                    if (saving.getPr() < 0) {
                        System.out.println("2:\uD83D\uDD12Купить пирожков -150 рублей, +25 энергии, +5 настроения");
                    }

                    if (saving.getPr2() >= 0) {
                        System.out.println("3:Выпить кофейку -200 рублей, +30 энергии, +6 настроения");
                    }
                    if (saving.getPr2() < 0) {
                        System.out.println("3:\uD83D\uDD12Выпить кофейку -200 рублей, +30 энергии, +6 настроения");
                    }

                    if (saving.getPr3() >= 0) {
                        System.out.println("4:Купить шавермы -350 рублей, +35 энергии, +8 настроения");
                    }
                    if (saving.getPr3() < 0) {
                        System.out.println("4:\uD83D\uDD12Купить шавермы -350 рублей, +35 энергии, +8 настроения");
                    }

                    if (saving.getPr4() >= 0) {
                        System.out.println("5:Doritos и Mountain Dew -500 рублей, +40 энергии, +10 настроения");
                    }
                    if (saving.getPr4() < 0) {
                        System.out.println("5:\uD83D\uDD12Doritos и Mountain Dew -500 рублей, +40 энергии, +10 настроения");
                    }
                    System.out.println("---");
                    System.out.println("9:Назад");
                    Scanner in = new Scanner(System.in);
                    int x = in.nextInt();
                    if (x == 1 && saving.getDen() >= 50) {
                        System.out.println("Ммммм, пища богов");
                        saving.setDen(saving.getDen() - 50);
                        saving.setEne(saving.getEne() + 20);
                        saving.setHap(saving.getHap() + 3);
                        saving.setPr(saving.getPr() + 20);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 1 && saving.getDen() < 50) {
                        System.out.println("Необходимо 50 рублей");
                    }

                    if (x == 2 && saving.getDen() >= 150 && saving.getPr() >= 0) {
                        System.out.println("Пирожочки, почти как бабушкины");
                        saving.setDen(saving.getDen() - 150);
                        saving.setEne(saving.getEne() + 25);
                        saving.setHap(saving.getHap() + 5);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 2 && (saving.getDen() < 150 || saving.getPr() < 0)) {
                        System.out.println("Необходимо 150 рублей и создать первый проект - тараканьи бега");
                    }

                    if (x == 3 && saving.getDen() >= 200 && saving.getPr2() >= 0) {
                        System.out.println("10/10 этой шаверме");
                        saving.setDen(saving.getDen() - 200);
                        saving.setEne(saving.getEne() + 30);
                        saving.setHap(saving.getHap() + 6);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 3 && (saving.getDen() < 200 || saving.getPr2() < 0)) {
                        System.out.println("Необходимо 200 рублей и создать фри-ту-плэй клон ГТА");
                    }

                    if (x == 4 && saving.getDen() >= 350 && saving.getPr3() >= 0) {
                        System.out.println("STARBUCKS COFFEE");
                        saving.setDen(saving.getDen() - 350);
                        saving.setEne(saving.getEne() + 35);
                        saving.setHap(saving.getHap() + 8);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 4 && (saving.getDen() < 350 || saving.getPr3() < 0)) {
                        System.out.println("Необходимо 350 рублей и открыть интернет-магазин");
                    }

                    if (x == 5 && saving.getDen() >= 500 && saving.getPr4() >= 0) {
                        System.out.println("Еда посвященных");
                        saving.setDen(saving.getDen() - 500);
                        saving.setEne(saving.getEne() + 40);
                        saving.setHap(saving.getHap() + 10);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 5 && (saving.getDen() < 500 || saving.getPr4() < 0)) {
                        System.out.println("Необходимо 500 рублей и создать свой стартап на кикстартере");
                    }

                    if (x == 9) {
                        Menu.main();
                    }
                }

            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
        }
    }
}