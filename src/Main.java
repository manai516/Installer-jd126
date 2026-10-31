import java.io.File;
import java.util.List;

public class Main {
    static void main(String[] args) {
        String saveDir = "/Users/admin/Games/savegames/";

        GameProgress gp1 = new GameProgress(100, 3, 5, 125.5);
        GameProgress gp2 = new GameProgress(80, 2, 4, 540.0);
        GameProgress gp3 = new GameProgress(45, 1, 9, 3000.75);

        GameProgress.saveGame(saveDir + "save1.dat", gp1);
        GameProgress.saveGame(saveDir + "save2.dat", gp2);
        GameProgress.saveGame(saveDir + "save3.dat", gp3);

        List<String> files = List.of(saveDir + "save1.dat",
                saveDir + "save2.dat",
                saveDir + "save3.dat");
        GameProgress.zipFiles(saveDir + "zip.zip", files);

        for (String f : files) {
            new File(f).delete();
        }
    }
}
