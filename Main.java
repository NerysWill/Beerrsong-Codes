public class Main{
    public static void main(String[] args){
        // BeerSong program
        int BeerNum = 99;
        String Word = "bottles";
        while (BeerNum > 0) {
            if (BeerNum == 1) {
                Word = "Bottle";
                
            }
            System.out.println(BeerNum + "" + Word + "" + "of beer on the wall");
            System.out.println(BeerNum + "" + Word + "" + "of beer" );
            System.out.println("Take one down");
            System.out.println("pass it around");
            BeerNum = BeerNum - 1;

            if (BeerNum > 0) {
                System.out.println(BeerNum + "" + Word + "" + "of beer on the wall");
                
            } else {
                System.out.println("No more bottles left on the wall");
            }
            
        }
    }
}