/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digital_calendar;

import java.awt.Component;
import java.util.Calendar;
import java.util.Date;


public class PanelDate extends javax.swing.JLayeredPane {

    private int month;
    private int year;
    
    public PanelDate(int month, int year) {
        initComponents();
        this.month= month;
        this.year= year;
        init();
    }

    private void init(){
        mon.asTitle();
        tue.asTitle();
        wed.asTitle();
        thu.asTitle();
        fri.asTitle();
        sat.asTitle();
        sun.asTitle();
        
        setDate();
    }
    
    private void setDate(){
        Calendar calendar= Calendar.getInstance();
        calendar.set(Calendar.YEAR, year);
        calendar.set(Calendar.MONTH, month-1);  //month jan as 0 so start from 0
        calendar.set(Calendar.DATE, 1);
        int startDay = calendar.get(Calendar.DAY_OF_WEEK) -1; // get day of week -1 to index
        calendar.add(Calendar.DATE, -startDay);
        ToDay toDay = getToDay();
        for(Component com : getComponents()){
            Cell cell =(Cell) com;
            if(!cell.isTitle()){
                cell.setText(calendar.get(Calendar.DATE) + "");
                cell.setDate(calendar.getTime());
                cell.currentMonth(calendar.get(Calendar.MONTH) == month -1);
                if(toDay.isToDay(new ToDay(calendar.get(Calendar.DATE), calendar.get(Calendar.MONTH) +1,calendar.get(Calendar.YEAR)))){
                    cell.setAsToDay();
                }
                calendar.add(Calendar.DATE, 1); //up 1 day
            }
        }
    }
    
    private ToDay getToDay(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        return new ToDay(calendar.get(Calendar.DATE),calendar.get(Calendar.MONTH)+1,calendar.get(Calendar.YEAR));
   
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sun = new digital_calendar.Cell();
        mon = new digital_calendar.Cell();
        tue = new digital_calendar.Cell();
        wed = new digital_calendar.Cell();
        thu = new digital_calendar.Cell();
        fri = new digital_calendar.Cell();
        sat = new digital_calendar.Cell();
        cell9 = new digital_calendar.Cell();
        cell16 = new digital_calendar.Cell();
        cell22 = new digital_calendar.Cell();
        cell28 = new digital_calendar.Cell();
        cell35 = new digital_calendar.Cell();
        cell43 = new digital_calendar.Cell();
        cell10 = new digital_calendar.Cell();
        cell11 = new digital_calendar.Cell();
        cell12 = new digital_calendar.Cell();
        cell13 = new digital_calendar.Cell();
        cell14 = new digital_calendar.Cell();
        cell15 = new digital_calendar.Cell();
        cell36 = new digital_calendar.Cell();
        cell17 = new digital_calendar.Cell();
        cell18 = new digital_calendar.Cell();
        cell19 = new digital_calendar.Cell();
        cell20 = new digital_calendar.Cell();
        cell21 = new digital_calendar.Cell();
        cell8 = new digital_calendar.Cell();
        cell23 = new digital_calendar.Cell();
        cell24 = new digital_calendar.Cell();
        cell25 = new digital_calendar.Cell();
        cell26 = new digital_calendar.Cell();
        cell27 = new digital_calendar.Cell();
        cell29 = new digital_calendar.Cell();
        cell30 = new digital_calendar.Cell();
        cell31 = new digital_calendar.Cell();
        cell32 = new digital_calendar.Cell();
        cell33 = new digital_calendar.Cell();
        cell34 = new digital_calendar.Cell();
        cell37 = new digital_calendar.Cell();
        cell38 = new digital_calendar.Cell();
        cell39 = new digital_calendar.Cell();
        cell40 = new digital_calendar.Cell();
        cell41 = new digital_calendar.Cell();
        cell42 = new digital_calendar.Cell();
        cell44 = new digital_calendar.Cell();
        cell45 = new digital_calendar.Cell();
        cell46 = new digital_calendar.Cell();
        cell47 = new digital_calendar.Cell();
        cell48 = new digital_calendar.Cell();
        cell49 = new digital_calendar.Cell();

        setLayout(new java.awt.GridLayout(7, 7));

        sun.setForeground(new java.awt.Color(255, 0, 0));
        sun.setText("Sun");
        sun.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(sun);

        mon.setText("Mon");
        mon.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(mon);

        tue.setText("Tue");
        tue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(tue);

        wed.setText("Wed");
        wed.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(wed);

        thu.setText("Thu");
        thu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(thu);

        fri.setText("Fri");
        fri.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(fri);

        sat.setText("Sat");
        sat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(sat);

        cell9.setForeground(new java.awt.Color(255, 0, 0));
        cell9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell9);

        cell16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell16);

        cell22.setForeground(new java.awt.Color(255, 0, 0));
        cell22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell22);

        cell28.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell28);

        cell35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell35);

        cell43.setForeground(new java.awt.Color(255, 0, 0));
        cell43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell43);

        cell10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell10);

        cell11.setForeground(new java.awt.Color(255, 0, 0));
        cell11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell11);

        cell12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell12);

        cell13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell13);

        cell14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell14);

        cell15.setForeground(new java.awt.Color(255, 0, 0));
        cell15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell15);

        cell36.setForeground(new java.awt.Color(255, 0, 0));
        cell36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell36);

        cell17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell17);

        cell18.setForeground(new java.awt.Color(255, 0, 0));
        cell18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell18);

        cell19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell19);

        cell20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell20);

        cell21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell21);

        cell8.setForeground(new java.awt.Color(255, 0, 0));
        cell8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell8);

        cell23.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell23);

        cell24.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell24);

        cell25.setForeground(new java.awt.Color(255, 0, 0));
        cell25.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell25);

        cell26.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell26);

        cell27.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell27);

        cell29.setForeground(new java.awt.Color(255, 0, 0));
        cell29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell29);

        cell30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell30);

        cell31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell31);

        cell32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell32);

        cell33.setForeground(new java.awt.Color(255, 0, 0));
        cell33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell33);

        cell34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell34);

        cell37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell37);

        cell38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell38);

        cell39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell39);

        cell40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell40);

        cell41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell41);

        cell42.setForeground(new java.awt.Color(255, 0, 0));
        cell42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell42);

        cell44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell44);

        cell45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell45);

        cell46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell46);

        cell47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell47);

        cell48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell48);

        cell49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        add(cell49);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private digital_calendar.Cell cell10;
    private digital_calendar.Cell cell11;
    private digital_calendar.Cell cell12;
    private digital_calendar.Cell cell13;
    private digital_calendar.Cell cell14;
    private digital_calendar.Cell cell15;
    private digital_calendar.Cell cell16;
    private digital_calendar.Cell cell17;
    private digital_calendar.Cell cell18;
    private digital_calendar.Cell cell19;
    private digital_calendar.Cell cell20;
    private digital_calendar.Cell cell21;
    private digital_calendar.Cell cell22;
    private digital_calendar.Cell cell23;
    private digital_calendar.Cell cell24;
    private digital_calendar.Cell cell25;
    private digital_calendar.Cell cell26;
    private digital_calendar.Cell cell27;
    private digital_calendar.Cell cell28;
    private digital_calendar.Cell cell29;
    private digital_calendar.Cell cell30;
    private digital_calendar.Cell cell31;
    private digital_calendar.Cell cell32;
    private digital_calendar.Cell cell33;
    private digital_calendar.Cell cell34;
    private digital_calendar.Cell cell35;
    private digital_calendar.Cell cell36;
    private digital_calendar.Cell cell37;
    private digital_calendar.Cell cell38;
    private digital_calendar.Cell cell39;
    private digital_calendar.Cell cell40;
    private digital_calendar.Cell cell41;
    private digital_calendar.Cell cell42;
    private digital_calendar.Cell cell43;
    private digital_calendar.Cell cell44;
    private digital_calendar.Cell cell45;
    private digital_calendar.Cell cell46;
    private digital_calendar.Cell cell47;
    private digital_calendar.Cell cell48;
    private digital_calendar.Cell cell49;
    private digital_calendar.Cell cell8;
    private digital_calendar.Cell cell9;
    private digital_calendar.Cell fri;
    private digital_calendar.Cell mon;
    private digital_calendar.Cell sat;
    private digital_calendar.Cell sun;
    private digital_calendar.Cell thu;
    private digital_calendar.Cell tue;
    private digital_calendar.Cell wed;
    // End of variables declaration//GEN-END:variables
}
