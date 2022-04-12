package Utils;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountWords {
    private static final Logger LOGGER = LogManager.getLogger(CountWords.class);

    public static void main (String[] args) {
        String text = "";
        try {
            text = FileUtils.readFileToString(new File("src/main/resources/textfile.txt"), "UTF-8");
        } catch (IOException e) {
            LOGGER.error(e);
        }

        String[] words = text.split("\\s+");
        Set<String> uniqueWordsSet = new HashSet<>(Arrays.asList(words));
        LOGGER.info("Number of unique words in the text file: " + uniqueWordsSet.size());

        try {
            FileUtils.writeStringToFile(new File("src/main/resources/uniqueWordsCount.txt"),
                    uniqueWordsSet.toString() + "\n" + uniqueWordsSet.size() + " unique words", "UTF-8");
        } catch (IOException e) {
            LOGGER.error(e);
        }

        LOGGER.info("Unique Words: " + uniqueWordsSet);
    }
}
