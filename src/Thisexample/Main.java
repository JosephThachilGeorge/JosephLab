package Thisexample;

public class Main {
    public static void main(String[] args) {

        ThisexamplenameIsHiddenbyaLocalVariable value=new ThisexamplenameIsHiddenbyaLocalVariable();


        value.display(1978741);


    }
}
/*

output is:

The vale of num:1983
Parameter num:1978741


 System.out.println("The vale of num:"+this.num); if we remove "this"
 then out put will be :

 The vale of num:1978741
 Parameter num:1978741

 */