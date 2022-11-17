package com.avenue.java.spb.group2.lesson16;

import com.avenue.java.spb.group2.lesson16.stream_api.OldUtil;
import com.avenue.java.spb.group2.lesson16.stream_api.Specialist;
import com.avenue.java.spb.group2.lesson16.stream_api.StreamUtil;

import java.util.ArrayList;
import java.util.List;

public class ApplicationStreamAPI {
    public static void main(String[] args) {
        Specialist spec1 = new Specialist("Ivanov Ivan", 10000, Speciality.BACKEND_DEVELOPER);
        Specialist spec2 = new Specialist("Petrov Petr", 95000, Speciality.FRONTEND_DEVELOPER);
        Specialist spec3 = new Specialist("Vasiliev Vasiliy", 9000, Speciality.FRONTEND_DEVELOPER);
        Specialist spec4 = new Specialist("Vladimirov Vladimir", 6500, Speciality.DEVOPS);
        Specialist spec5 = new Specialist("Alexandrov Alexandr", 12000, Speciality.BACKEND_DEVELOPER);

        List<Specialist> specialists = new ArrayList<>();
        specialists.add(spec1);
        specialists.add(spec2);
        specialists.add(spec3);
        specialists.add(spec4);
        specialists.add(spec5);

        Specialist specWithMinSalary1 = OldUtil.findWithMinSalary(specialists);
        Specialist specWithMinSalary2 = StreamUtil.findWithMinSalary(specialists);

//        OldUtil.printSpecialist(specWithMinSalary1);
//        System.out.println("----------------");
//        StreamUtil.printCollection(StreamUtil.filterBySpeciality(specialists, Speciality.BACKEND_DEVELOPER));
//        System.out.println("----------------");
//        StreamUtil.printCollection(StreamUtil.sortCollection(specialists));
//        System.out.println("----------------");
//        System.out.println(StreamUtil.matchAllDevops(specialists));
//        System.out.println(StreamUtil.matchAnyDevops(specialists));

        System.out.println(StreamUtil.matchAllSalaryMoreThan(specialists,6000));



    }
}
