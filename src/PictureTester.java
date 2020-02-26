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
    Picture swan2 = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
    swan2.newEdgeDetection(10);
    swan2.explore();
    
  }

  public static void testKeepOnlyBlue() {
    Picture temple = new Picture("temple.jpg");
    temple.keepOnlyBlue();
    temple.explore();
  }

  public static void testNegate() {
    Picture temple = new Picture("temple.jpg");
    temple.negate();
    temple.explore();
  }

  public static void testGrayscale() {
    Picture swan = new Picture("swan.jpg");
    swan.grayscale();
    swan.explore();
  }

  public static void testFixUnderwater() {
    Picture water = new Picture("water.jpg");
    water.fixUnderwater();
    water.explore();
  }

  public static void testMirrorVerticalRightToLeft() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorVerticalRightToLeft();
    caterpillar.explore();
  }

  public static void testMirrorHorizontal() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }

  public static void testMirrorHorizontalBotToTop() {
    Picture swan = new Picture("swan.jpg");
    swan.mirrorHorizontalBotToTop();
    swan.explore();
  }

  public static void testMirrorDiagonal() {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.mirrorDiagonal();
    caterpillar.explore();
  }

  public static void testMirrorArms() {
    Picture snowman = new Picture("snowman.jpg");
    snowman.mirrorArms();
    snowman.explore();
  }

  public static void testMirrorGull() {
    Picture seagull = new Picture("seagull.jpg");
    seagull.mirrorGull();
    seagull.explore();
  }

  public static void testCopy() {
    Picture canvas = new Picture("640x480.jpg");
    canvas.myCollage();
    canvas.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    // testZeroBlue();
    // testKeepOnlyBlue();
    // testKeepOnlyRed();
    // testKeepOnlyGreen();
    // testNegate();
    // testGrayscale();
    // testFixUnderwater();
    // testMirrorVertical();
    // testMirrorVerticalRightToLeft();
    // testMirrorHorizontal();
    // testMirrorHorizontalBotToTop();
    // testMirrorTemple();
    // testMirrorArms();
    // testMirrorGull();
    // testMirrorDiagonal();
    // testCollage();
    // testCopy();
    // testEdgeDetection();
    // testEdgeDetection2();
    // testChromakey();
    // testEncodeAndDecode();
    // testGetCountRedOverValue(250);
    // testSetRedToHalfValueInTopHalf();
    // testClearBlueOverValue(200);
    // testGetAverageForColumn(0);
  }
}