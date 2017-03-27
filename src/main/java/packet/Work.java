package packet;

import java.util.Scanner;

public class Work {
    public static void main() {

        int r123 = 1;
        while (r123 == 1) {
            r123++;
            try {
                //читаем из файла
                Saving saving = FileReader.getSaving();
                while (true) {
                    if (saving.getHap() <= 0) {
                        System.out.println("Программист помер от скуки. Не лучшая смерть.");
                        System.exit(0);
                    }
                    if (saving.getEne() <= 0) {
                        System.out.println("Усталость взяла свое. Отдохнем на том свете.");
                        System.exit(0);
                    }
                    System.out.println(saving.getDen() + " рублей    " + saving.getHap() + " настроения    " + saving.getEne() + " энергии    " + saving.getXp() + " опыт");
                    System.out.println("-----");
                    System.out.println("1:Работать промоутером +50 рублей, -10 энергии, -10 настроения");

                    if (saving.getPr() >= 0) {
                        System.out.println("2:Заправлять катриджи для принтеров +300 рублей, -7 энергии, -14 настроения");
                    }
                    if (saving.getPr() < 0) {
                        System.out.println("2:\uD83D\uDD12Заправлять катриджи для принтеров +300 рублей, -7 энергии, -14 настроения");
                    }

                    if (saving.getPr2() >= 0) {
                        System.out.println("3:Набирать тексты +800 рублей, -14 энергии, -15 настроения");
                    }
                    if (saving.getPr2() < 0) {
                        System.out.println("3:\uD83D\uDD12Набирать тексты +800 рублей, -14 энергии, -15 настроения");
                    }

                    if (saving.getPr3() >= 0) {
                        System.out.println("4:Перепродать аккаунт Clash of clans +2 500 рублей, -25 энергии, -31 настроения");
                    }
                    if (saving.getPr3() < 0) {
                        System.out.println("4:\uD83D\uDD12Перепродать аккаунт Clash of clans +2 500 рублей, -25 энергии, -31 настроения");
                    }

                    if (saving.getPr4() >= 0) {
                        System.out.println("5:Воровать у китая данные +20 000 рублей, -40 энергии, -40 настроения");
                    }
                    if (saving.getPr4() < 0) {
                        System.out.println("5:\uD83D\uDD12Воровать у китая данные +20 000 рублей, -40 энергии, -40 настроения");
                    }
                    System.out.println("---");
                    System.out.println("9:Назад");
                    Scanner in = new Scanner(System.in);
                    int x = in.nextInt();
                    if (x == 1) {
                        System.out.println("Жить то на что-то надо. Раздавать листовки - тоже работа");
                        saving.setDen(saving.getDen() + 50);
                        saving.setEne(saving.getEne() - 10);
                        saving.setHap(saving.getHap() - 10);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 4000);
                        saving.setPr3(saving.getPr3() + 20000);
                        saving.setPr4(saving.getPr4() + 40000);
                        saving.setXp(saving.getXp() + 10);
                        FileReader.saveSaving(saving);
                    }

                    if (x == 2 && saving.getPr() >= 0) {
                        System.out.println("Грязная работенка");
                        saving.setDen(saving.getDen() + 300);
                        saving.setEne(saving.getEne() - 7);
                        saving.setHap(saving.getHap() - 14);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 4000);
                        saving.setPr3(saving.getPr3() + 20000);
                        saving.setPr4(saving.getPr4() + 40000);
                        saving.setXp(saving.getXp() + 20);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 2 && saving.getPr() < 0) {
                        System.out.println("Необходимо создать первый проект - тараканьи бега");
                    }

                    if (x == 3 && saving.getPr2() >= 0) {
                        System.out.println("Ctrl + c, Ctrl + v, Ctrl + c, Ctrl + v...");
                        saving.setDen(saving.getDen() + 800);
                        saving.setEne(saving.getEne() - 14);
                        saving.setHap(saving.getHap() - 15);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 4000);
                        saving.setPr3(saving.getPr3() + 20000);
                        saving.setPr4(saving.getPr4() + 40000);
                        saving.setXp(saving.getXp() + 30);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 3 && saving.getPr2() < 0) {
                        System.out.println("Необходимо создать фри-ту-плэй клон ГТА");
                    }

                    if (x == 4 && saving.getPr3() >= 0) {
                        System.out.println("Да, и так тоже зарабатывают");
                        saving.setDen(saving.getDen() + 2500);
                        saving.setEne(saving.getEne() - 25);
                        saving.setHap(saving.getHap() - 31);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 4000);
                        saving.setPr3(saving.getPr3() + 20000);
                        saving.setPr4(saving.getPr4() + 40000);
                        saving.setXp(saving.getXp() + 40);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 4 && saving.getPr3() < 0) {
                        System.out.println("Необходимо открыть интернет-магазин");
                    }

                    if (x == 5 && saving.getPr4() >= 0) {
                        System.out.println("Правительство будет недовольно");
                        saving.setDen(saving.getDen() + 20000);
                        saving.setEne(saving.getEne() - 40);
                        saving.setHap(saving.getHap() - 40);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 4000);
                        saving.setPr3(saving.getPr3() + 20000);
                        saving.setPr4(saving.getPr4() + 40000);
                        saving.setXp(saving.getXp() + 50);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 5 && saving.getPr4() < 0) {
                        System.out.println("Необходимо создать свой стартап на кикстартере");
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