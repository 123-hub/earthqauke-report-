package com.example.earthquake;

public class earthquake {
    private double mmmagnitude;
    private String mplace;
    private long mdateinmilisecond;
    private String murl;
   earthquake(double mag, String place, long date,String url) {
       mmmagnitude=mag;
       mplace=place;
       mdateinmilisecond=date;
       murl=url;
      }


      public double getmagnitude(){
       return mmmagnitude;

      }

      public String getMplace()
      {
          return mplace;

      }

      public long getdate()
      {
          return mdateinmilisecond;
      }

    public String getMurl() {
        return murl;
    }
}
