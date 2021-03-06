/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
    /** Method to test zeroBlue */
    public static void testZeroBlue()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

    /** Method to test mirrorVertical */
    public static void testMirrorVertical()
    {
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVertical();
        caterpillar.explore();
    }

    /** Method to test mirrorTemple */
    public static void testMirrorTemple()
    {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }

    /** Method to test the collage method */
    public static void testCollage()
    {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /** Method to test edgeDetection */
    public static void testEdgeDetection()
    {
        Picture swan = new Picture("swan.jpg");
        swan.edgeDetection(10);
        swan.explore();
    }

    public static void testNegate(){
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.negate();
        caterpillar.explore();

    }
    public static void testGrayScale(){
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.grayScale();
        caterpillar.explore();

    }
    public static void testMirrorVerticalRightToLeft(){ 
        Picture caterpillar = new Picture("caterpillar.jpg");
        caterpillar.explore();
        caterpillar.mirrorVerticalRightToLeft();
        caterpillar.explore();
    }

    public static void testHorizontal()
    {
        Picture swan = new Picture("swan.jpg");
        swan.explore();
        swan.mirrorHorizontal();
        swan.explore();
    }

    public static void testHorizontalBotToTop(){
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorHorizontalBotToTop();
        temple.explore();

    }

    public static void testMirrorDiagonal()
    {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.mirrorDiagonal();
        beach.explore();
    }

    public static void testMirrorArms()
    {
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }
    
     public static void testCropAndCopy()
    {
        Picture snowman = new Picture("snowman.jpg");
        Picture copy= new Picture();
        snowman.explore();
        copy.cropAndCopy(snowman, 10, 100, 20, 200, 30,100, 0, 100);
        copy.explore();
    }
    
    public static void testMirrorGull(){
        Picture seagull = new Picture("seagull.jpg");
        seagull.explore();
        seagull.mirrorGull();
        seagull.explore();
    }

    public static void testFixUnderwater(){
        Picture water = new Picture("water.jpg");
        water.explore();
        water.fixUnderwater();
        water.explore();
    }
    public static void testScaleByHalf(){
        Picture seagull = new Picture("seagull.jpg");
        seagull.explore();
        seagull.scaleByHalf();
        seagull.explore();
    }
    
    

    /** Main method for testing.  Every class can have a main
     * method in Java */
    public static void main(String[] args)
    {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run

        testZeroBlue();
        testNegate();
        testMirrorVerticalRightToLeft();
        testHorizontal();
        testHorizontalBotToTop();
        testMirrorDiagonal();
        testMirrorArms();
        testMirrorGull();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        testNegate();
        testGrayScale();
        //testFixUnderwater();
        testMirrorVertical();

        testMirrorTemple();
        testMirrorArms();
        testMirrorGull();
        testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}