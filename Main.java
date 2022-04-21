package com.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        StringBuilder message = new StringBuilder();
        String [] repository = {"src", "res", "savegame", "temp", "test", "main"};
        String [] nameFileInRes = {"drawables", "vectors", "icons"};
        //File [] file = {src, };
        for(int i = 0; i < repository.length; i++){
            File file = new File("C:\\Users\\ПК\\Desktop\\Games\\" + repository[i]);
            file.mkdir();
            if (file.exists()) message.append("Каталог " + repository[i]  + '\n');
        }
        //File src = new File("C:\\Users\\ПК\\Desktop\\Games\\src");
        //src.mkdir();
        //if (src.exists()) message.append("Каталог src создан" + '\n');
        //File res = new File("C:\\Users\\ПК\\Desktop\\Games\\res");
        //res.mkdir();
        //if (res.exists()) message.append("Каталог res создан" + '\n');
        //File savegames = new File("C:\\Users\\ПК\\Desktop\\Games\\savegames");
        //savegames.mkdir();
        //if (savegames.exists()) message.append("Каталог savegames создан" + '\n');
        //File temp = new File("C:\\Users\\ПК\\Desktop\\Games\\temp");
        //temp.mkdir();
        //if (temp.exists()) message.append("Каталог temp создан" + '\n');
        //File test = new File("C:\\Users\\ПК\\Desktop\\Games\\src\\test");
        //test.mkdir();
        //if (test.exists()) message.append("Каталог test создан" + '\n');
        //File main = new File("C:\\Users\\ПК\\Desktop\\Games\\src\\main");
        //main.mkdir();
        //if (main.exists()) message.append("Каталог main создан" + '\n');
        //String [] roots = {"C:\\Users\\ПК\\Desktop\\Games\\","C:\\Users\\ПК\\Desktop\\Games\\"};
        File [] fileName = {new File("C:\\Users\\ПК\\Desktop\\Games\\" + repository[5], "Main.java"),
            new File("C:\\Users\\ПК\\Desktop\\Games\\" + repository[5], "Utils.java"),
                new File("C:\\Users\\ПК\\Desktop\\Games\\" + repository[3], "temp.txt")};
        for(int j = 0; j < fileName.length; j++) {
            try {
                fileName[j].createNewFile();
                if (fileName[j].exists())
                    message.append("Файл " + fileName[j].getName() + '\n');
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }
        //try {
            //utilsFile.createNewFile();
            //if (utilsFile.exists())
                //message.append("Файл Utils.java создан" + '\n');
        //} catch (IOException ex) {
            //System.out.println(ex.getMessage());
        //}
        //try {
            //tempFile.createNewFile();
            //if (tempFile.exists())
                //message.append("Файл temp.txt создан" + '\n');
        //} catch (IOException ex) {
            //System.out.println(ex.getMessage());
        //}
        for(int k = 0; k < nameFileInRes.length; k++) {
            File nameFileInResName = new File("C:\\Users\\ПК\\Desktop\\Games\\res\\" + nameFileInRes[k]);
            nameFileInResName.mkdir();
            if (nameFileInResName.exists()) message.append("Каталог " + nameFileInRes[k] + " создан" + '\n');
        }
        //File vectors = new File("C:\\Users\\ПК\\Desktop\\Games\\res\\vectors");
        //vectors.mkdir();
        //if (vectors.exists()) message.append("Каталог vectors создан" + '\n');
        //File icons = new File("C:\\Users\\ПК\\Desktop\\Games\\res\\icons");
        //icons.mkdir();
        //if (icons.exists()) message.append("Каталог icons создан" + '\n');
        //}
        System.out.println(message);

        try (FileWriter writer = new FileWriter("C:\\Users\\ПК\\Desktop\\Games\\" + repository[3], false)) {
            writer.write(message.toString());
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
//utilsFile.createNewFile() && tempFile.createNewFile()