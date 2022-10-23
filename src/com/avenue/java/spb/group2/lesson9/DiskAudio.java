package com.avenue.java.spb.group2.lesson9;

public class DiskAudio extends Disk{
    // 1. Поля

    private String singer; //Исполнитель
    /*private String name; // Название альбома
    private int year; //Год выпуска*/
    private int countTrack; //Количество треков

    // 2. Конструкторы



    // 3. Методы


    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getCountTrack() {
        return countTrack;
    }

    public void setCountTrack(int countTrack) {
        this.countTrack = countTrack;
    }

    @Override
    public void printInfo() {
        System.out.println("Singer: " + getSinger() + " Count of tracks: " + getCountTrack() + " Name of album "+
                getName() + " Year of release: " + getYear());
    }
}
