

/**
 * Write a description of class Collage_lab here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Collage_lab
{
   public static void main( String[] args){
       Picture canvas= new Picture(678,999);
       Picture eric= new Picture("eric kim.jpg");
      
       Picture ericKim= new Picture("eric kim.jpg");
       Picture ericsEyes= new Picture("eric kim.jpg");
       Picture finalEric= new Picture("eric kim.jpg");
       Picture star= new Picture("star.jpg");
       Picture money= new Picture("money.jpg");
       
       ericsEyes.negate();
       eric.fixUnderwater();
       
       
       star.scaleByHalf();
       
       eric.cropAndCopy(star, 0, 148, 0, 198, 303, 392, 40, 180);
       eric.cropAndCopy(money, 0, 48, 0, 141, 252, 320, 209, 350);
       
       
       
       
       for( int i=0; i<6; i++){
        eric.scaleByHalf();
       
        }
       canvas.cropAndCopy(ericKim, 0,511, 0, 511, 0, 511, 0, 511);
       
       
        for(int x=0; x<245; x+=10){
        canvas.cropAndCopy(eric, x, 255+x, x, 255+x,x,255+x, x,255+x ); 
       }
       canvas.mirrorVertical();
       
       canvas.cropAndCopy(ericsEyes, 229, 404, 0, 360, 511, 678, 0, 360);
       canvas.cropAndCopy(ericsEyes, 229, 404, 0, 360, 511, 678, 361, 721 );
       canvas.cropAndCopy(ericsEyes, 229, 404, 0, 360, 511, 678, 721, 999 );
       
       finalEric.scaleByHalf();
       finalEric.scaleByHalf();
       canvas.cropAndCopy(finalEric, 0, 127, 0, 127,100, 227, 450, 577 );
       
       canvas.explore();
       
       canvas.write("MyCollage.jpg");
      
       
    }

}
