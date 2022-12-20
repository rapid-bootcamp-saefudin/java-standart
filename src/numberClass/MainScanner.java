package numberClass;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy");

        System.out.println("Masukan Nama : ");
        String nama = scanner.nextLine();


        System.out.println("Masukan Tgl Lahir ");
        String tglLahir = scanner.nextLine();
        Date tglLahirDate = formater.parse(tglLahir);
        System.out.println("tgl Lahir: "+ tglLahirDate);

        Date currentDate = new Date();
        String tglSekarang = formater.format(currentDate);
        System.out.println("tgl Sekarang Date "+ currentDate);
        System.out.println("tgl Sekarang "+ tglSekarang);

        // hitung umur
        Calendar calendar = Calendar.getInstance();
        // tgl date => calender
        calendar.setTime(tglLahirDate);
        System.out.println("calender tgl lahir "+ calendar.getTime());
        Calendar currentCalendar = Calendar.getInstance();
        currentCalendar.setTime(new Date());
        // check calender sekarang
        System.out.println("tgl Sekarang "+ currentCalendar.getTime());

        // ambil selisih
        long time = (currentCalendar.getTimeInMillis() - calendar.getTimeInMillis())/1000;
        long diff = currentDate.getTime() - tglLahirDate.getTime();

        long t1 = 60 * 60 * 1000;
        long t2 = diff / (24 * t1);

        // second => hour
        long hours = diff / (t1);
        // hour => day
        long days = t2;
        // day => week
        long weeks = t2 / 7;
        // day => month
        long months = t2 / 30;
        // day => year
        long years =  months / 12;

        System.out.println("\n\nbentuk Second \t" + time);
        System.out.println("bentuk Hours \t" + hours);
        System.out.println("bentuk Days \t" + days);
        System.out.println("bentuk Weeks \t" + weeks);
        System.out.println("bentuk Months \t" + months);
        System.out.println("bentuk Years \t" + years);

        // second => hour
        long hour = time/3600;
        // hour => day
        long day = hour/24;
        // day => week
        long week = day/7;
        // day => month
        long month = day/30;
        // day => year
        long year = month/12;

        System.out.println("\n\nbentuk Second \t" + time);
        System.out.println("bentuk Hour \t" + hour);
        System.out.println("bentuk Day \t\t" + day);
        System.out.println("bentuk Week \t" + week);
        System.out.println("bentuk Month \t" + month);
        System.out.println("bentuk Year \t" + year);
    }
}

