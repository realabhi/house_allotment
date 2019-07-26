/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.igfl_allotment;

/**
 *
 * @author Abhi
 */
class User2 {
    private int pno;
    String uname, job_band, desig,doj,dop,house_no;
     
     public User2(int pno,String uname,String job_band,String desig,String doj,String dop,String house_no)
     {
         this.pno=pno;
         this.uname=uname;
         this.job_band=job_band;
         this.desig=desig;
         this.doj=doj;
         this.dop=dop;
         this.house_no=house_no;
         
         
         
     }
     public int getpno(){
         return pno;
     }
      public String getuname(){
         return uname;
         
     } 
      public String getjob_band(){
         return job_band;
         
         
     }
      
      public String getdesig(){
         if(desig.equals("1"))
    return("Senior  Manager");
         else if(desig.equals("2"))
    return("Manager");
         else if(desig.equals("3"))
    return("Senior Assistant");
         else if(desig.equals("4"))
    return("Junior Assistant");
         else if(desig.equals("5"))
    return("Sweeper");
         else
    return desig;
      }

      public String getdoj(){
         return doj;
     }
      public String getjop(){
         return dop;
     }
      public String gethouse_no(){
         return house_no;
     }
      
      
}