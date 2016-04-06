package com.javarush.test.level18.lesson10.home08;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/* Нити и байты
Читайте с консоли имена файлов, пока не будет введено слово "exit"
Передайте имя файла в нить ReadThread
Нить ReadThread должна найти байт, который встречается в файле максимальное число раз, и добавить его в словарь resultMap,
где параметр String - это имя файла, параметр Integer - это искомый байт.
Закрыть потоки. Не использовать try-with-resources
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) throws IOException, InterruptedException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        List<String> fileList = new ArrayList<>();
        String fileName;

        while (!(fileName = reader.readLine()).equals("exit")){
            fileList.add(fileName);
        }

        reader.close();

        for (String name : fileList){
            ReadThread readThread = new ReadThread(name);
            readThread.start();
            readThread.join();
        }

        System.out.println(resultMap);
    }

    public static class ReadThread extends Thread {
        private String fileName;
        public ReadThread(String fileName) {
            //implement constructor body
            this.fileName = fileName;
        }
        // implement file reading here - реализуйте чтение из файла тут
        public void run(){
            try
            {
                FileInputStream fileInputStream = new FileInputStream(fileName);
                List<Integer> list = new ArrayList<>();

                while (fileInputStream.available() > 0){
                    list.add(fileInputStream.read());
                }

                fileInputStream.close();

                int max = 0;
                int id = 0;
                int frequency = 0;

                for (int i = 0; i < list.size(); i++) {
                    frequency = Collections.frequency(list, list.get(i));
                    if (frequency > max)
                    {
                        max = frequency;
                        id = list.get(i);
                    }
                }

                resultMap.put(fileName,id);

            }catch (Exception ex){

            }
        }
    }

}
