package packet;

import java.util.Scanner;

public class Menu {
    public static void main() {

        int r123 = 1;
        while (r123 == 1) {
            r123++;
            try {
                //читаем из файла
                Saving saving = FileReader.getSaving();
                //задачи
                //1
                if (saving.getDen() < 2000 && saving.getShmot().equals("домашние тапочки, маечка и тренники")) {
                    System.out.println("Заработайте 2000 рублей");
                }
                //2
                if (saving.getDen() >= 2000 && saving.getShmot().equals("домашние тапочки, маечка и тренники")) {
                    System.out.println("Купите брюки, туфли и рубашку");
                }
                //3
                if (saving.getShmot().equals("брюки, туфли и рубашка") && saving.getKomp().equals("старый, часто удаляющий винду по своей прихоти")) {
                    System.out.println("Купите ноутбук");
                }
                //4
                if (saving.getPr() < 0 && saving.getKomp().equals("ноутбук")) {
                    System.out.println("Создайте первый проект - тараканьи бега в подсобке");
                }
                //5
                if (saving.getPr() >= 0 && saving.getPr2() < 0) {
                    System.out.println("Купите кофту, штаны, кросовки ABIBAS, готовую сборку компьютера и создайте фри-ту-плэй клон ГТА");
                }
                //6
                if (saving.getPr2() >= 0 && saving.getPr3() < 0) {
                    System.out.println("Откройте интернет-магазин");
                }
                // 7
                if (saving.getPr3() >= 0 && saving.getPr4() < 0) {
                    System.out.println("Создайте свой стартап на кикстартере");
                }
                //8
                if (saving.getPr4() >= 0) {
                    System.out.println("Станьте великим программистом");
                }
                //конец задач

                //опыт

                if (saving.getXp() >= 100) {
                    for (int sdf1 = 1; sdf1 < 2; sdf1++) {
                        saving.setDen(saving.getDen() + 500);
                        System.out.println("+500 рублей");
                    }
                }

                if (saving.getXp() >= 200) {
                    for (int sdf2 = 1; sdf2 < 2; sdf2++) {
                        saving.setDen(saving.getDen() + 600);
                        System.out.println("+600 рублей");
                    }
                }

                if (saving.getXp() >= 400) {
                    for (int sdf3 = 1; sdf3 < 2; sdf3++) {
                        saving.setDen(saving.getDen() + 1000);
                        System.out.println("+1000 рублей");
                    }
                }

                if (saving.getXp() >= 600) {
                    for (int sdf4 = 1; sdf4 < 2; sdf4++) {
                        saving.setDen(saving.getDen() + 1500);
                        System.out.println("+1500 рублей");
                    }
                }
            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
        }

        //меню
        int r1234 = 1;
        while (r1234 == 1) {
            r1234++;
            try {
                //читаем из файла
                Saving saving = FileReader.getSaving();
                System.out.println(saving.getDen() + " рублей    " + saving.getHap() + " настроения    " + saving.getEne() + " энергии    " + saving.getXp() + " опыт");
                System.out.println("-----");
                System.out.println("одежда - " + saving.getShmot());
                System.out.println("компьютер - " + saving.getKomp());
                System.out.println("-----");
                System.out.println("1:Пойти работать");
                System.out.println("2:Пойти поесть");
                System.out.println("3:Поднять настроение");
                System.out.println("4:Купить шмот");
                System.out.println("5:Обновить комп");
                System.out.println("6:Заняться фрилансом");
                System.out.println("---");
                System.out.println("7:Сбросить сохранения игры");
                System.out.println("---");
                System.out.println("9:Выйти из игры");


                //конец меню

                Scanner in = new Scanner(System.in);
                int x = in.nextInt();
                if (x == 1) {
                    Work.main();
                }
                if (x == 2) {
                    Food.main();
                }
                if (x == 3) {
                    Happy.main();
                }
                if (x == 4) {
                    Shmot.main();
                }
                if (x == 5) {
                    Komp.main();
                }
                if (x == 6) {
                    Project.main();
                }
                if (x == 7) {

                    System.out.println("Действительно сбросить сохранения игры?");
                    System.out.println("1.Да");
                    System.out.println("2.Нет");

                    Scanner inw = new Scanner(System.in);
                    int x1 = inw.nextInt();

                    if (x1 == 1) {
                        for (int sdf = 1; sdf < 2; sdf++) {
                            try {
                                saving.setKomp("старый, часто удаляющий винду по своей прихоти");
                                saving.setShmot("домашние тапочки, маечка и тренники");
                                saving.setDen(250);
                                saving.setEne(50);
                                saving.setHap(50);
                                saving.setXp(0);
                                saving.setPr(-2147483648);
                                saving.setPr2(-2147483648);
                                saving.setPr3(-2147483648);
                                saving.setPr4(-2147483648);
                                saving.setPrsumma2(0);
                                saving.setPrsumma3(0);
                                saving.setPrsumma4(0);
                                FileReader.saveSaving(saving);
                            } catch (Exception ex) {
                                System.out.println(ex);
                                break;
                            }
                            Menu.main();
                        }
                        if (x1 == 2) {
                            Menu.main();
                        }

                    }
                }

                if (x == 9) {

                    System.out.println("Выйти из игры?");
                    System.out.println("1.Да");
                    System.out.println("2.Нет");

                    Scanner inw = new Scanner(System.in);
                    int x1 = inw.nextInt();

                    if (x1 == 1) {
                        System.exit(0);
                    }
                    if (x1 == 2) {
                        Menu.main();
                    }

                }
                if (x == 8) {
                    saving.setDen(saving.getDen() + 10000000);
                    FileReader.saveSaving(saving);
                    Menu.main();
                }
            } catch (Exception ex) {
                System.out.println(ex);
                break;
            }
        }
    }
}
