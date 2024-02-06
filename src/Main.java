public class Main {
public static void main(String[] args){
 int vasyaAge = 29;
 int katyaAge = 14;
 int mishaAge = 36;

 int min = -1;
 int middle = -1;
 int max = -1;

 if (vasyaAge <= katyaAge && vasyaAge <= mishaAge){
  min = vasyaAge;
  if (katyaAge <= mishaAge){
   middle = katyaAge;
   max = mishaAge;
  } else {
   middle = mishaAge;
   max = katyaAge;
  }
 } else if (katyaAge <= vasyaAge && katyaAge <= mishaAge) {
  min = katyaAge;
  if (vasyaAge <= mishaAge){
   middle = vasyaAge;
   max = mishaAge;
  } else {
   middle = mishaAge;
   max = vasyaAge;
  }
   } else if (mishaAge <= vasyaAge && mishaAge <= katyaAge) {
  min = mishaAge;
  if (vasyaAge <= katyaAge){
   middle = vasyaAge;
   max = katyaAge;
  } else {
   middle = katyaAge;
   max = vasyaAge;
  }
 }
 System.out.println("Minimal age:" + min);
 System.out.println("Middle age:" + middle);
 System.out.println("Maximal age:" + max);
}
}
