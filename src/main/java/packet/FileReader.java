package packet;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileReader {

    public static final String FILE_NAME = "C:\\Users\\User\\IdeaProjects\\programmer's life\\Save.txt";

    public static Saving getSaving() throws Exception {
        try {
            List<String> strings = Files.readAllLines(Paths.get(FILE_NAME));
            Saving saving = new Saving();
            if (strings != null && strings.size() > 0) {

                String komp = strings.get(0);
                saving.setKomp(komp);

                String shmot = strings.get(1);
                saving.setShmot(shmot);

                String den = strings.get(2);
                saving.setDen(Integer.valueOf(den));

                String ene = strings.get(3);
                saving.setEne(Integer.valueOf(ene));

                String hap = strings.get(4);
                saving.setHap(Integer.valueOf(hap));

                String pr = strings.get(5);
                saving.setPr(Integer.valueOf(pr));

                String pr2 = strings.get(6);
                saving.setPr2(Integer.valueOf(pr2));

                String pr3 = strings.get(7);
                saving.setPr3(Integer.valueOf(pr3));

                String pr4 = strings.get(8);
                saving.setPr4(Integer.valueOf(pr4));

                String prsumma2 = strings.get(9);
                saving.setPrsumma2(Integer.valueOf(prsumma2));

                String prsumma3 = strings.get(10);
                saving.setPrsumma3(Integer.valueOf(prsumma3));

                String prsumma4 = strings.get(11);
                saving.setPrsumma4(Integer.valueOf(prsumma4));

                String project = strings.get(12);
                saving.setProject(project);

            } else {
                throw new Exception("Файл пустой");
            }
            return saving;
        } catch (IOException e) {
            throw new Exception("Не удалось прочитать файл", e);
        }
    }

    public static void saveSaving(Saving saving) throws Exception {
        try (BufferedWriter writer = Files.newBufferedWriter(Paths.get(FILE_NAME))) {
            writer.write(saving.getKomp() + "\n");
            writer.write(saving.getShmot() + "\n");
            writer.write(saving.getDen() + "\n");
            writer.write(saving.getEne() + "\n");
            writer.write(saving.getHap() + "\n");

            writer.write(saving.getPr() + "\n");
            writer.write(saving.getPr2() + "\n");
            writer.write(saving.getPr3() + "\n");

            writer.write(saving.getPr4() + "\n");
            writer.write(saving.getPrsumma2() + "\n");
            writer.write(saving.getPrsumma3() + "\n");
            writer.write(saving.getPrsumma4() + "\n");

            writer.write(saving.getProject() + "\n");
        } catch (IOException ex) {
            throw new Exception("Не удалось записать файл", ex);
        }
    }
}