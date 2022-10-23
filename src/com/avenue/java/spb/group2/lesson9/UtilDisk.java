package com.avenue.java.spb.group2.lesson9;

public class UtilDisk {
    public static void findOldDisk(Disk[] disks) {
        Disk oldestDisk = disks[0];
        for (int i = 0; i < disks.length; i++) {
            if (oldestDisk.getYear() > disks[i].getYear()) {
                oldestDisk = disks[i];
            }
        }
        oldestDisk.printInfo();
    }
}
