import java.io.File;
import java.io.IOException;

public class Installer {
    public static void main(String[] args) {
        File games = new File("/Users/admin/Games");
        File src = new File(games, "src");
        File rec = new File(games, "rec");
        File savegames = new File(games, "savegames");

        games.mkdirs();
        src.mkdir();
        rec.mkdir();
        savegames.mkdir();

        try {
            File mainJava = new File(src, "Main.java");
            File utilsJava =new File(src, "Utils.java");
            mainJava.createNewFile();
            utilsJava.createNewFile();
        } catch (IOException e) {
            System.out.println("Ошибка при создании файла" + e.getMessage());
        }

    }
}
