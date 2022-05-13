package pt.ipp.isep.dei.examples.tdd.basic.domain;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import org.apache.commons.validator.routines.*;


/**
 * Calculator class.
 * This class is very simple in order to demonstrate how to build test cases for Unit Testing.
 */
public class BookmarkingTool {

    FileWriter fileWriter = new FileWriter("solvingissues.txt");
    PrintWriter printWriter = new PrintWriter(fileWriter, true);
    Path path = Paths.get("solvingissues.txt");


    public BookmarkingTool() throws IOException {
    }

    public File createFile(String pathName) throws IOException {
        File fileToCreate = new File(pathName);
        if (fileToCreate.createNewFile()) {
            System.out.println("File created: " + fileToCreate.getName());
        } else {
            System.out.println("File already exists.");
        }

        return fileToCreate;
    }


    public boolean validateUrl(String url){
        UrlValidator urlValidator = new UrlValidator();

        return urlValidator.isValid(url);
    }

    public void  addURL(String url) throws MalformedURLException, IOException {
        URL urlToSave = new URL(url);

        System.out.println(urlToSave.getProtocol());


        /*FileUtils.writeStringToFile(
                file, "Spain\r\n", StandardCharsets.UTF_8, true);



        /*printWriter.write(url + '\n');
        printWriter.newLine();
        printWriter.close();*/

    }

}