package packet;

import java.util.Scanner;

public class Komp {
    public static void main() {


        int r123 = 1;
        while (r123 == 1) {
            r123++;
            try {
                //читаем из файла
                Saving saving = FileReader.getSaving();
                while (true) {
                    System.out.println(saving.getDen() + " рублей    " + saving.getHap() + " настроения    " + saving.getEne() + " энергии    " + saving.getXp() + " опыт");
                    System.out.println("-----");
                    System.out.println("одежда - " + saving.getShmot());
                    System.out.println("компьютер - " + saving.getKomp());
                    System.out.println("-----");
                    if (saving.getDen() < 1000 || (!saving.getShmot().equals("брюки, туфли и рубашка") && saving.getKomp().equals("старый, часто удаляющий винду по своей прихоти"))) {
                        System.out.println("1:\uD83D\uDD12Банальный слабенький ноутбок. Все же лучше, чем старая рухлядь - 2 000 рублей");
                    }
                    if (saving.getDen() >= 1000 && (saving.getShmot().equals("брюки, туфли и рубашка") || saving.getKomp().equals("ноутбук") || saving.getKomp().equals("готовый") || saving.getKomp().equals("готовый, улучшенный") || saving.getKomp().equals("топовый") || saving.getKomp().equals("топовый, на заказ"))) {
                        System.out.println("1:Банальный слабенький ноутбок. Все же лучше, чем старая рухлядь - 4 000 рублей");
                    }

                    if (saving.getDen() < 20000 || saving.getPr() < 0) {
                        System.out.println("2:\uD83D\uDD12Купленая в магазине готовая сборка. Потянет майнкрафт на максималках - 20 000 рублей");
                    }
                    if (saving.getDen() >= 20000 && saving.getPr() >= 0) {
                        System.out.println("2:Купленая в магазине готовая сборка. Потянет майнкрафт на максималках - 20 000 рублей");
                    }

                    if (saving.getDen() < 50000 || saving.getPr2() < 0) {
                        System.out.println("3:\uD83D\uDD12Готовая сборка с собственными улучшениями - 50 000 рублей");
                    }
                    if (saving.getDen() >= 50000 && saving.getPr2() >= 0) {
                        System.out.println("3:Готовая сборка с собственными улучшениями - 50 000 рублей");
                    }

                    if (saving.getDen() < 120000 || saving.getPr3() < 0) {
                        System.out.println("4:\uD83D\uDD12Дорогущий топовый компьютер - 120 000 рублей");
                    }
                    if (saving.getDen() >= 120000 && saving.getPr3() >= 0) {
                        System.out.println("4:Дорогущий топовый компьютер - 120 000 рублей");
                    }

                    if (saving.getDen() < 600000 || saving.getPr4() < 0) {
                        System.out.println("5:\uD83D\uDD12Сделаный на заказ ПК, с системой охлаждения жидким азотом, и предустановленным браузером Амиго - 600 000 рублей");
                    }
                    if (saving.getDen() >= 600000 && saving.getPr4() >= 0) {
                        System.out.println("5:Сделаный на заказ ПК, с системой охлаждения жидким азотом, и предустановленным браузером Амиго - 600 000 рублей");
                    }
                    System.out.println("---");
                    System.out.println("9:Назад");

                    Scanner in = new Scanner(System.in);
                    int x = in.nextInt();
                    if (x == 1 && saving.getDen() >= 2000 && saving.getShmot().equals("брюки, туфли и рубашка")) {
                        System.out.println("Компьютер улучшен!");
                        try {
                            saving.setDen(saving.getDen() - 2000);
                            saving.setKomp("ноутбук");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    } else if (x == 1 && (saving.getDen() < 1000 || !saving.getShmot().equals("брюки, туфли и рубашка"))) {
                        System.out.println("Неоходимо 2 000 рублей, брюки, туфли и рубашка");
                    }

                    if (x == 2 && saving.getDen() >= 20000 && saving.getPr() >= 0) {
                        System.out.println("Компьютер улучшен!");
                        try {
                            saving.setDen(saving.getDen() - 20000);
                            saving.setKomp("готовый");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    }
                    if (x == 2 && (saving.getDen() < 20000 || saving.getPr() < 0)) {
                        System.out.println("Неоходимо 20 000 рублей и создать свой первый проект ");
                    }

                    if (x == 3 && saving.getDen() >= 50000 && saving.getPr2() >= 0) {
                        System.out.println("Компьютер улучшен!");
                        try {
                            saving.setDen(saving.getDen() - 50000);
                            saving.setKomp("готовый, улучшенный");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    }
                    if (x == 3 && (saving.getDen() < 50000 || saving.getPr2() < 0)) {
                        System.out.println("Неоходимо 50 000 рублей и создать фри-ту-плэй клон ГТА");
                    }

                    if (x == 4 && saving.getDen() >= 120000 && saving.getPr3() >= 0) {
                        System.out.println("Компьютер улучшен!");
                        try {
                            saving.setDen(saving.getDen() - 120000);
                            saving.setKomp("топовый");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    }
                    if (x == 4 && (saving.getDen() < 120000 || saving.getPr3() < 0)) {
                        System.out.println("Неоходимо 120 000 рублей и открыть интернет-магазин");
                    }

                    if (x == 5 && saving.getDen() >= 600000 && saving.getPr4() >= 0) {
                        System.out.println("Компьютер улучшен!");
                        try {
                            saving.setDen(saving.getDen() - 600000);
                            saving.setKomp("топовый, на заказ");
                            //записываем в файл
                            FileReader.saveSaving(saving);
                        } catch (Exception ex) {
                            System.out.println(ex);
                            break;
                        }
                    }
                    if (x == 5 && (saving.getDen() < 600000 || saving.getPr4() < 0)) {
                        System.out.println("Неоходимо 600 000 рублей и создать свой стартап");
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



