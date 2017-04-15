package packet;

import java.util.Scanner;

public class Happy {
    public static void main() {
        int r1234 = 1;
        while (r1234 == 1) {
            r1234++;
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
                    System.out.println("1:Залипать в стену -3 энергии, +15 настроения");

                    if (saving.getPr() >= 0) {
                        System.out.println("2:Смотреть телевизор -6 энергии, +20 настроения");
                    }
                    if (saving.getPr() < 0) {
                        System.out.println("2:\uD83D\uDD12Смотреть телевизор -6 энергии, +20 настроения");
                    }

                    if (saving.getPr2() >= 0) {
                        System.out.println("3:Играть в компьютер -6 энергии, +25 настроения");
                    }
                    if (saving.getPr2() < 0) {
                        System.out.println("3:\uD83D\uDD12Играть в компьютер -6 энергии, +25 настроения");
                    }

                    if (saving.getPr3() >= 0) {
                        System.out.println("4:Смотреть всякую ересь на YouTube -7 энергии, +35 настроения");
                    }
                    if (saving.getPr3() < 0) {
                        System.out.println("4:\uD83D\uDD12Смотреть всякую ересь на YouTube -7 энергии, +35 настроения");
                    }

                    if (saving.getPr4() >= 0) {
                        System.out.println("5:Поругаться с тестировщиками -10 энергии, +40 настроения");
                    }
                    if (saving.getPr4() < 0) {
                        System.out.println("5:\uD83D\uDD12Поругаться с тестировщиками -10 энергии, +40 настроения");
                    }
                    System.out.println("---");
                    System.out.println("9:Назад");
                    Scanner in = new Scanner(System.in);
                    int x = in.nextInt();
                    if (x == 1) {
                        System.out.println("Безудержное веселье");
                        saving.setEne(saving.getEne() - 6);
                        saving.setHap(saving.getHap() + 15);
                        saving.setPr(saving.getPr() + 10);
                        saving.setPr2(saving.getPr2() + 400);
                        saving.setPr3(saving.getPr3() + 700);
                        saving.setPr4(saving.getPr4() + 900);
                        FileReader.saveSaving(saving);
                    }

                    if (x == 2 && saving.getPr() >= 0) {
                        System.out.println("Одни реклама и новости");
                        saving.setEne(saving.getEne() - 6);
                        saving.setHap(saving.getHap() + 20);
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
                        System.out.println("О да, что может лучше родимых игрушечек?");
                        saving.setEne(saving.getEne() - 6);
                        saving.setHap(saving.getHap() + 25);
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
                        System.out.println("YouTube уже не тот...");
                        saving.setEne(saving.getEne() - 7);
                        saving.setHap(saving.getHap() + 35);
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
                        System.out.println("Поругаться с тестеровщиками (цена - бесценно)");
                        saving.setEne(saving.getEne() - 10);
                        saving.setHap(saving.getHap() + 40);
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

