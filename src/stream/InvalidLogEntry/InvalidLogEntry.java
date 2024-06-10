package stream.InvalidLogEntry;

import java.util.*;
import java.util.stream.Collectors;

public class InvalidLogEntry {
    public static void main(String [] args){
        String[] lines = {
                "10.0.0.1 - log entry 1 11",
                "10.0.0.3 - log entry 2 213",
                "10.0.0.3 - log entry 133132",
                "Invalid log entry"
        };
        System.out.println(findTopIpAddress_v2(lines));
    }
    public static String findTopIpAddress(String [] lines){
        return Arrays.stream(lines)
                .filter(line -> line.contains("-"))
                .map(line -> line.split("-")[0].trim())
                .collect(Collectors.groupingBy(id -> id, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
    }
    public static String findTopIpAddress_v2(String [] lines){
        if(lines == null){
            return null;
        }
        Map<String, Long> ipAddressFrequencyMap =
                Arrays.stream(lines)
                .filter(line -> line.contains("-"))
                        .map(InvalidLogEntry::extractIpAddress)
                        .collect(Collectors.groupingBy(ip -> ip, Collectors.counting()));
        long maxFrequency = Collections.max(ipAddressFrequencyMap.values());
        return ipAddressFrequencyMap
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == maxFrequency)
                .min(Map.Entry.comparingByKey())
                .map(Map.Entry::getKey)
                .orElse(null);

    }
    private static String extractIpAddress(String logEntry){
        return logEntry.split("-")[0].trim();
    }
}