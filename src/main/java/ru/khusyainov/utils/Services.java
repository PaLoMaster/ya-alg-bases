package ru.khusyainov.utils;

import java.io.*;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class Services {
    private static final String INPUT_TXT = "input.txt";
    private static final String OUTPUT_TXT = "output.txt";
    private static List<String[]> getStringsFromFile(String fileName) {
        List<String[]> result = new LinkedList<>();
        String lineSplitter = " ";
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = reader.readLine()) != null) {
                result.add(str.split(lineSplitter));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    private static List<String[]> getStringsFromInput() {
        return getStringsFromFile(INPUT_TXT);
    }

    private static List<String[]> getStringsFromOutput() {
        return getStringsFromFile(OUTPUT_TXT);
    }

    public static List<Integer[]> stringsToIntegers(List<String[]> list) {
        return list.stream().map(s -> Arrays.stream(s).map(Integer::parseInt).toArray(Integer[]::new)).
                collect(Collectors.toList());
    }

    public static List<Integer[]> getIntegersFromInput() {
        return stringsToIntegers(getStringsFromInput());
    }

    public static List<Integer[]> getIntegersFromOutput() {
        return stringsToIntegers(getStringsFromOutput());
    }

    public static int getIntegerFromInput() {
        return getIntegersFromInput().get(0)[0];
    }

    public static int getIntegerFromOutput() {
        return getIntegersFromOutput().get(0)[0];
    }

    private static <T> void writeToFile(String fileName, List<T> outList) {
        try (Writer writer = new FileWriter(fileName)) {
            for (Iterator<T> it = outList.iterator(); it.hasNext(); writer.write(System.lineSeparator())) {
                writer.write(it.next().toString());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static <T> void writeToInput(List<T> outList) {
        writeToFile(INPUT_TXT, outList);
    }

    private static <T> void writeToOutput(List<T> outList) {
        writeToFile(OUTPUT_TXT, outList);
    }

    public static <T> void writeToInput(T outValue) {
        writeToInput(List.of(outValue));
    }

    public static <T> void writeToOutput(T outValue) {
        writeToOutput(List.of(outValue));
    }

    public static int factorial(int start) {
        if (start <= 1) {
            return 1;
        }
        return start * factorial(--start);
    }
}
