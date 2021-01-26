package ge.edu.btu;

import java.io.File;

public class FileCounter {
    public int GetFilesQuantity(String filePath, String keyWord) {
        File file = new File(filePath);
        String[] filesList = file.list((dir, name) -> name.toLowerCase().startsWith(keyWord.toLowerCase()));
        assert filesList != null;
        return filesList.length;
    }

    public static void main(String[] args) {
        String text = "მოძებნილი ფაილების რაოდენობაა: ";
        String filePath = "C:\\Users\\avtan\\Desktop\\BTU_DIRECTORY";
        String keyWord = "btu";

        FileCounter fileCounter = new FileCounter();
        int filesQuantity = fileCounter.GetFilesQuantity(filePath, keyWord);

        System.out.println(text + filesQuantity);
    }
}
