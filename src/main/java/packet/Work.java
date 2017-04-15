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
                    System.out.println("     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n");
                    if (saving.getHap() <= 0) {
                        System.out.println("Программист помер от скуки. Не лучшая смерть.");
                        for (int sdf = 1; sdf < 2; sdf++) {
                            try {
                                saving.setKomp("старый, часто удаляющий винду по своей прихоти");
                                saving.setShmot("домашние тапочки, маечка и тренники");
                                saving.setDen(250);
                                saving.setEne(50);
                                saving.setHap(50);
                                saving.setPr(-2147483648);
                                saving.setPr2(-2147483648);
                                saving.setPr3(-2147483648);
                                saving.setPr4(-2147483648);
                                saving.setPrsumma2(0);
                                saving.setPrsumma3(0);
                                saving.setPrsumma4(0);
                                saving.setProject("отсутствует");
                                FileReader.saveSaving(saving);
                            } catch (Exception ex) {
                                System.out.println(ex);
                                break;
                            }
                        }
                        System.exit(0);
                    }
                    if (saving.getEne() <= 0) {
                        System.out.println("Усталость взяла свое. Отдохнем на том свете.");
                        for (int sdf = 1; sdf < 2; sdf++) {
                            try {
                                saving.setKomp("старый, часто удаляющий винду по своей прихоти");
                                saving.setShmot("домашние тапочки, маечка и тренники");
                                saving.setDen(250);
                                saving.setEne(50);
                                saving.setHap(50);
                                saving.setPr(-2147483648);
                                saving.setPr2(-2147483648);
                                saving.setPr3(-2147483648);
                                saving.setPr4(-2147483648);
                                saving.setPrsumma2(0);
                                saving.setPrsumma3(0);
                                saving.setPrsumma4(0);
                                saving.setProject("отсутствует");
                                FileReader.saveSaving(saving);
                            } catch (Exception ex) {
                                System.out.println(ex);
                                break;
                            }
                        }
                        System.exit(0);
                    }
                    System.out.println(saving.getDen() + " рублей | " + saving.getHap() + " настроения | " + saving.getEne() + " энергии");
                    System.out.println("-----");
                    System.out.println("одежда - " + saving.getShmot());
                    System.out.println("компьютер - " + saving.getKomp());
                    System.out.println("проект - " + saving.getProject());
                    System.out.println("-----");
                    System.out.println("1:Работать промоутером +100 рублей, -10 энергии, -10 настроения");

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
                        System.out.println("5:Воровать у китая данные +10 000 рублей, -40 энергии, -40 настроения");
                    }
                    if (saving.getPr4() < 0) {
                        System.out.println("5:\uD83D\uDD12Воровать у китая данные +10 000 рублей, -40 энергии, -40 настроения");
                    }
                    System.out.println("---");
                    System.out.println("9:Назад");
                    Scanner in = new Scanner(System.in);
                    int x = in.nextInt();
                    if (x == 1) {
                        System.out.println("Жить то на что-то надо. Раздавать листовки - тоже работа");
                        saving.setDen(saving.getDen() + 100);
                        saving.setEne(saving.getEne() - 10);
                        saving.setHap(saving.getHap() - 10);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
                        FileReader.saveSaving(saving);
                    }

                    if (x == 2 && saving.getPr() >= 0) {
                        System.out.println("Грязная работенка");
                        saving.setDen(saving.getDen() + 300);
                        saving.setEne(saving.getEne() - 7);
                        saving.setHap(saving.getHap() - 14);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
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
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
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
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
                        FileReader.saveSaving(saving);
                    }
                    if (x == 4 && saving.getPr3() < 0) {
                        System.out.println("Необходимо открыть интернет-магазин");
                    }

                    if (x == 5 && saving.getPr4() >= 0) {
                        System.out.println("Правительство будет недовольно");
                        saving.setDen(saving.getDen() + 10000);
                        saving.setEne(saving.getEne() - 40);
                        saving.setHap(saving.getHap() - 40);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
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