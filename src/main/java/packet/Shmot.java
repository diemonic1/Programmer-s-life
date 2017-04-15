package packet;

import java.util.Scanner;

public class Shmot {

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
                    System.out.println("1:Брюки, туфли и рубашка - не стильно, не модно, не молодежно - 2 000 рублей");

                    if (saving.getDen() < 6500 || saving.getPr() < 0) {
                        System.out.println("2:\uD83D\uDD12Кофта, штаны и кросовки ABIBAS, все с Ali Express - 6 500 рублей");
                    }
                    if (saving.getDen() >= 6500 && saving.getPr() >= 0) {
                        System.out.println("2:Кофта, штаны и кросовки ABIBAS, все с Ali Express - 6 500 рублей");
                    }

                    if (saving.getDen() < 11000 || saving.getPr2() < 0) {
                        System.out.println("3:\uD83D\uDD12Бомбер, джинсы и спортивки - 11 000 рублей");
                    }
                    if (saving.getDen() >= 11000 && saving.getPr2() >= 0) {
                        System.out.println("3:Бомбер, джинсы и спортивки - 11 000 рублей");
                    }

                    if (saving.getDen() < 16000 || saving.getPr3() < 0) {
                        System.out.println("4:\uD83D\uDD12Свитшот, черные джинсы и кеды - 16 000 рублей");
                    }
                    if (saving.getDen() >= 16000 && saving.getPr3() >= 0) {
                        System.out.println("4:Свитшот, черные джинсы и кеды - 16 000 рублей");
                    }

                    if (saving.getDen() < 23000 || saving.getPr4() < 0) {
                        System.out.println("5:\uD83D\uDD12Фланелевая рубашка, джоггеры и олд скулы. Набор настоящего джентельмена - 23 000 рублей");
                    }
                    if (saving.getDen() >= 23000 && saving.getPr4() >= 0) {
                        System.out.println("5:Фланелевая рубашка, джоггеры и олд скулы. Набор настоящего джентельмена - 23 000 рублей");
                    }
                    System.out.println("---");
                    System.out.println("9:Назад");

                    Scanner in = new Scanner(System.in);
                    int x = in.nextInt();
                    if (x == 1 && saving.getDen() >= 2000) {
                        System.out.println("Топ шмот закуплен!!!");
                        try {
                            saving.setDen(saving.getDen() - 2000);
                            saving.setShmot("брюки, туфли и рубашка");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    } else if (x == 1 && saving.getDen() < 2000) {
                        System.out.println("Неоходимо 2 000 рублей");
                    }

                    if (x == 2 && saving.getDen() >= 6500 && saving.getPr() >= 0) {
                        System.out.println("Топ шмот закуплен!!!");
                        try {
                            saving.setDen(saving.getDen() - 6500);
                            saving.setShmot("кофта, штаны и кросовки ABIBAS");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    }
                    if (x == 2 && (saving.getDen() < 6500 || saving.getPr() < 0)) {
                        System.out.println("Неоходимо 6 500 рублей и создать свой первый проект - тараканьи бега");
                    }

                    if (x == 3 && saving.getDen() >= 11000 && saving.getPr2() >= 0) {
                        System.out.println("Топ шмот закуплен!!!");
                        try {
                            saving.setDen(saving.getDen() - 11000);
                            saving.setShmot("бомбер, джинсы и спортивки");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    }
                    if (x == 3 && (saving.getDen() < 11000 || saving.getPr2() < 0)) {
                        System.out.println("Неоходимо 11 000 рублей и создать фри-ту-плэй клон ГТА");
                    }

                    if (x == 4 && saving.getDen() >= 16000 && saving.getPr3() >= 0) {
                        System.out.println("Топ шмот закуплен!!!");
                        try {
                            saving.setDen(saving.getDen() - 16000);
                            saving.setShmot("свитшот, черные джинсы и кеды");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    }
                    if (x == 4 && (saving.getDen() < 16000 || saving.getPr3() < 0)) {
                        System.out.println("Неоходимо 16 000 рублей и открыть интернет-магазин");
                    }

                    if (x == 5 && saving.getDen() >= 23000 && saving.getPr4() >= 0) {
                        System.out.println("Топ шмот закуплен!!!");
                        try {
                            saving.setDen(saving.getDen() - 23000);
                            saving.setShmot("фланелевая рубашка, джоггеры и олд скулы");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    }
                    if (x == 5 && (saving.getDen() < 23000 || saving.getPr4() < 0)) {
                        System.out.println("Неоходимо 23 000 рублей и создать свой стартап");
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