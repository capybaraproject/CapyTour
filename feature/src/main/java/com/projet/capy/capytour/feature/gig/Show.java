package com.projet.capy.capytour.feature.gig;



import com.projet.capy.capytour.feature.tools.Tools;

import java.time.LocalDateTime;

import java.util.Scanner;



public class Show implements Tools {

   private LocalDateTime liveDate;
   private LocalDateTime getInDate;
   private LocalDateTime soundchek;
   private LocalDateTime curfew;

    public LocalDateTime getLiveDate() {
        return liveDate;
    }

    public void setLiveDate(LocalDateTime liveDate) {
        this.liveDate = liveDate;
    }

    public LocalDateTime getGetInDate() {
        return getInDate;
    }

    public void setGetInDate(LocalDateTime getInDate) {
        this.getInDate = getInDate;
    }

    public LocalDateTime getSoundchek() {
        return soundchek;
    }

    public void setSoundchek(LocalDateTime soundchek) {
        this.soundchek = soundchek;
    }

    public LocalDateTime getCurfew() {
        return curfew;
    }

    public void setCurfew(LocalDateTime curfew) {
        this.curfew = curfew;
    }

    public LocalDateTime doUserInputToDate(){
        Scanner scan = new Scanner(System.in);


        //toDo change the following code for a good deployment  on Android (by get EditView).
        System.out.println("Entrez le jour  (dd)");
        int day = scan.nextInt();

        System.out.println("Entrez le mois en numerique (mm)");
        int month = scan.nextInt();
        System.out.println("Entrez l'annee (aaaa)");
        int year = scan.nextInt();

        System.out.println("Entrez heures (hh)");
        int hour = scan.nextInt();


        System.out.println("Entrez minutes (mm)");
        int minutes=scan.nextInt();



      LocalDateTime date = LocalDateTime.of(year,month,day,hour,minutes);

            return date;



    }


    @Override
    public String toString() {
        return "Show{" +
                "liveDate=" + liveDate +
                ", getInDate=" + getInDate +
                ", soundchek=" + soundchek +
                ", curfew=" + curfew +
                '}';
    }


    public void createNewUserObject(Show show) {
        //toDo change the following code for a good deployment  on Android (by get EditView).

        System.out.println("Pour la date du live : ");
        show.setLiveDate(show.doUserInputToDate());
        System.out.println("pur la date du get in");
        show.setGetInDate(show.doUserInputToDate());
        System.out.println("Pour la date des balances");
        show.setSoundchek(show.doUserInputToDate());
        System.out.println("Pour la date du curfew");
        show.setCurfew(show.doUserInputToDate());



    }

    @Override
    public void createNewUserObject() {

    }
}
    

