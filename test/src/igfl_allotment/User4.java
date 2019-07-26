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
class User4 {
    private int pno;
    String uname,house_number,p1,p2,alloted;
     
     public User4(int pno,String uname,String house_number,String p1,String p2,String alloted)
     {
         this.pno=pno;
         this.uname=uname;
         this.house_number=house_number;
         this.p1=p1;
         this.p2=p2;
         this.alloted=alloted;
       
         
         
     }
     public int getpno(){
         return pno;
     }
      public String getuname(){
         return uname;
         
     } 
      public String gethouse_number(){
         return house_number;
         
         
     }
      
        public String getp1(){
         return p1;
     }
      public String getp2(){
         return p2;
     }
      public String getalloted(){
          return alloted;
      }
      
      
}
