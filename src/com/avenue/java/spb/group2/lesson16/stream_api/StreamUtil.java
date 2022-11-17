package com.avenue.java.spb.group2.lesson16.stream_api;

import com.avenue.java.spb.group2.lesson16.Speciality;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamUtil {
    public static Specialist findWithMinSalary(List<Specialist> list){
        return list.stream()
                .min(Comparator.comparing(Specialist::getSalary))
                .orElse(null);
    }

    public static Specialist findWithMaxSalary(List<Specialist> list){
        return list.stream()
                .max(Comparator.comparing(Specialist::getSalary))
                .orElse(null);
    }

    // Поиск по специальности
    public static List<Specialist> filterBySpeciality(List<Specialist> list, Speciality speciality){
        return list.stream()
                .filter(specialist -> specialist.getSpeciality().equals(speciality))
                .collect(Collectors.toList());
    }

    public static void printCollection(List<Specialist> list){
        list.stream().forEach(specialist -> System.out.println(specialist.getName()
                + " " + specialist.getSalary() + " " + specialist.getSpeciality()));
    }

    public static List<Specialist> sortCollection(List<Specialist> list){
        return list.stream()
                .sorted(Comparator.comparing(Specialist::getName))
                .collect(Collectors.toList());
    }

    public static boolean matchAllDevops (List<Specialist> list){
        return list.stream()
                .allMatch(specialist -> specialist.getSpeciality().equals(Speciality.DEVOPS));
    }

    public static boolean matchAnyDevops (List<Specialist> list){
        return list.stream()
                .anyMatch(specialist -> specialist.getSpeciality().equals(Speciality.DEVOPS));
    }

    public static boolean matchAllSalaryMoreThan(List<Specialist> list, Integer count){
        return list.stream()
                .allMatch(specialist -> specialist.getSalary().compareTo(count)>0);
    }

}



