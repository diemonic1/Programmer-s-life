package packet;

import java.util.Scanner;

public class Project {
    public static void main() {
        while (true) {

            int r123 = 1;
            while (r123 == 1) {
                r123++;
                try {
                    //читаем из файла
                    Saving saving = FileReader.getSaving();
                    while (true) {

                        if (saving.getPr2() >= 0) {
                            saving.setPrsumma2(saving.getPr() + saving.getPr2());
                        }
                        if (saving.getPr3() >= 0) {
                            saving.setPrsumma3(saving.getPr() + saving.getPr2() + saving.getPr3());
                        }
                        if (saving.getPr4() >= 0) {
                            saving.setPrsumma4(saving.getPr() + saving.getPr2() + saving.getPr3() + saving.getPr4());
                        }
                        FileReader.saveSaving(saving);

                        System.out.println("     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n     \n");
                        System.out.println(saving.getDen() + " рублей | " + saving.getHap() + " настроения | " + saving.getEne() + " энергии");
                        System.out.println("-----");
                        System.out.println("одежда - " + saving.getShmot());
                        System.out.println("компьютер - " + saving.getKomp());
                        System.out.println("проект - " + saving.getProject());
                        System.out.println("-----");
                        if (saving.getDen() < 5000 || !saving.getShmot().equals("брюки, туфли и рубашка") || !saving.getKomp().equals("ноутбук") || saving.getPr() >= 0) {
                            System.out.println("1:\uD83D\uDD12Устроить тараканьи бега со ставками в подсобке компании - 5 000 рублей");
                        }
                        if (saving.getDen() >= 5000 && saving.getShmot().equals("брюки, туфли и рубашка") && saving.getKomp().equals("ноутбук") && saving.getPr() < 0) {
                            System.out.println("1:Устроить тараканьи бега со ставками в подсобке компании - 5 000 рублей");
                        }

                        if (saving.getDen() < 20000 || !saving.getShmot().equals("кофта, штаны и кросовки ABIBAS") || !saving.getKomp().equals("готовый") || saving.getPr2() >= 0) {
                            System.out.println("2:\uD83D\uDD12Создать фри-ту-плэй клон ГТА на андроид с кучей рекламы и доната - 20 000 рублей");
                        }
                        if (saving.getDen() >= 20000 && saving.getShmot().equals("кофта, штаны и кросовки ABIBAS") && saving.getKomp().equals("готовый") && saving.getPr2() < 0) {
                            System.out.println("2:Создать фри-ту-плэй клон ГТА на андроид с кучей рекламы и доната - 20 000 рублей");
                        }

                        if (saving.getDen() < 80000 || !saving.getShmot().equals("бомбер, джинсы и спортивки") || !saving.getKomp().equals("готовый, улучшенный") || saving.getPr3() >= 0) {
                            System.out.println("3:\uD83D\uDD12Открыть интернет-магазин - 80 000 рублей");
                        }
                        if (saving.getDen() >= 80000 && saving.getShmot().equals("бомбер, джинсы и спортивки") && saving.getKomp().equals("готовый, улучшенный") && saving.getPr3() < 0) {
                            System.out.println("3:Открыть интернет-магазин - 80 000 рублей");
                        }

                        if (saving.getDen() < 120000 || !saving.getShmot().equals("свитшот, черные джинсы и кеды") || !saving.getKomp().equals("топовый") || saving.getPr4() >= 0) {
                            System.out.println("4:\uD83D\uDD12Создать свой стартап на кикстартере - 120 000 рублей");
                        }
                        if (saving.getDen() >= 120000 && saving.getShmot().equals("свитшот, черные джинсы и кеды") && saving.getKomp().equals("топовый") && saving.getPr4() < 0) {
                            System.out.println("4:Создать свой стартап на кикстартере - 120 000 рублей");
                        }

                        if (!saving.getShmot().equals("фланелевая рубашка, джоггеры и олд скулы") || !saving.getKomp().equals("топовый, на заказ")) {
                            System.out.println("5:\uD83D\uDD12Стать великим программистом");
                        }
                        if (saving.getShmot().equals("фланелевая рубашка, джоггеры и олд скулы") && saving.getKomp().equals("топовый, на заказ")) {
                            System.out.println("5:Стать великим программистом");
                        }
                        System.out.println("---");

                        if (saving.getPr() > 0 || saving.getPrsumma2() > 0 || saving.getPrsumma3() > 0 || saving.getPrsumma4() > 0) {
                            System.out.println("6:Забрать прибыль");
                        } else {
                            System.out.println("6:\uD83D\uDD12Забрать прибыль");
                        }

                        System.out.println("---");
                        System.out.println("9:Назад");
                        Scanner in = new Scanner(System.in);
                        int x = in.nextInt();

                        if (x == 1 && saving.getPr() < 0 && saving.getDen() >= 5000 && saving.getShmot().equals("брюки, туфли и рубашка") && saving.getKomp().equals("ноутбук")) {
                            System.out.println("Вперед, таракашек номер три! На тебя поставил мой начальник!");
                            saving.setDen(saving.getDen() - 5000);
                            saving.setPr(0);
                            saving.setProject("тараканьи бега");
                            FileReader.saveSaving(saving);
                        }
                        if (x == 1 && (saving.getDen() < 5000 || !saving.getShmot().equals("брюки, туфли и рубашка") || !saving.getKomp().equals("ноутбук"))) {
                            System.out.println("Необходимо 5 000 рублей, брюки, туфли, рубашка и ноутбук");
                        }

                        if (x == 2 && saving.getPr2() < 0 && saving.getDen() >= 20000 && saving.getShmot().equals("кофта, штаны и кросовки ABIBAS") && saving.getKomp().equals("готовый")) {
                            System.out.println("Это станет хитом плэй маркета!");
                            saving.setDen(saving.getDen() - 20000);
                            saving.setPr2(0);
                            saving.setProject("фри-ту-плэй клон ГТА");
                            FileReader.saveSaving(saving);
                        }
                        if (x == 2 && (saving.getDen() < 20000 || !saving.getShmot().equals("кофта, штаны и кросовки ABIBAS") || !saving.getKomp().equals("готовый"))) {
                            System.out.println("Необходимо 20 000 рублей, кофта, штаны, кросовки ABIBAS и готовая сборка компьютера");
                        }

                        if (x == 3 && saving.getPr3() < 0 && saving.getDen() >= 80000 && saving.getShmot().equals("бомбер, джинсы и спортивки") && saving.getKomp().equals("готовый, улучшенный")) {
                            System.out.println("Цены низкие, качество-высокое!(нет)");
                            saving.setDen(saving.getDen() - 80000);
                            saving.setPr3(0);
                            saving.setProject("интернет-магазин");
                            FileReader.saveSaving(saving);
                        }
                        if (x == 3 && (saving.getDen() < 80000 || !saving.getShmot().equals("бомбер, джинсы и спортивки") || !saving.getKomp().equals("готовый, улучшенный"))) {
                            System.out.println("Необходимо 80 000 рублей, бомбер, джинсы, спортивки и готовая компьютер улучшениями");
                        }

                        if (x == 4 && saving.getPr4() < 0 && saving.getDen() >= 120000 && saving.getShmot().equals("свитшот, черные джинсы и кеды") && saving.getKomp().equals("топовый")) {
                            System.out.println("Арбитраж трафика, продумывание стратегии, управление бизнес-планом");
                            saving.setDen(saving.getDen() - 120000);
                            saving.setPr4(0);
                            saving.setProject("стартап на кикстартере");
                            FileReader.saveSaving(saving);
                        }
                        if (x == 4 && (saving.getDen() < 120000 || !saving.getShmot().equals("свитшот, черные джинсы и кеды") || !saving.getKomp().equals("топовый"))) {
                            System.out.println("Необходимо 120 000 рублей, свитшот, черные джинсы, кеды и Дорогущий топовый компьютер");
                        }

                        if (x == 5 && saving.getShmot().equals("фланелевая рубашка, джоггеры и олд скулы") && saving.getKomp().equals("топовый, на заказ")) {
                            System.out.println("Игра выиграна!");
                            System.exit(0);
                        }
                        if (x == 5 && (!saving.getShmot().equals("фланелевая рубашка, джоггеры и олд скулы") || !saving.getKomp().equals("топовый, на заказ"))) {
                            System.out.println("Необходимы фланелевая рубашка, джоггеры, олд скулы и сделаный на заказ ПК");
                        }

                        if (x == 6 && saving.getPr() >= 0 && saving.getPr2() >= 0 && saving.getPr3() >= 0 && saving.getPr4() >= 0) {
                            System.out.println("С проектов собрано - " + saving.getPrsumma4() + " рублей");
                            saving.setDen(saving.getDen() + saving.getPrsumma4());
                            saving.setPr(0);
                            saving.setPr2(0);
                            saving.setPr3(0);
                            saving.setPr4(0);
                            FileReader.saveSaving(saving);
                        }
                        else if (x == 6 && saving.getPr() >= 0 && saving.getPr2() >= 0 && saving.getPr3() >= 0) {
                            System.out.println("С проектов собрано - " + saving.getPrsumma3() + " рублей");
                            saving.setDen(saving.getDen() + saving.getPrsumma3());
                            saving.setPr(0);
                            saving.setPr2(0);
                            saving.setPr3(0);
                            FileReader.saveSaving(saving);
                        }
                        else if (x == 6 && saving.getPr() >= 0 && saving.getPr2() >= 0) {
                            System.out.println("С проектов собрано - " + saving.getPrsumma2() + " рублей");
                            saving.setDen(saving.getDen() + saving.getPrsumma2());
                            saving.setPr(0);
                            saving.setPr2(0);
                            FileReader.saveSaving(saving);
                        }
                        else if (x == 6 && saving.getPr() >= 0) {
                            System.out.println("С проектов собрано - " + saving.getPr() + " рублей");
                            saving.setDen(saving.getDen() + saving.getPr());
                            saving.setPr(0);
                            FileReader.saveSaving(saving);
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
}