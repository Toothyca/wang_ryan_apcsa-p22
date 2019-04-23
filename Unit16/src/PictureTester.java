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
	public static void testZeroRed()
	{
	  Picture beach = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.zeroRed();
	  beach.explore();
	}
	  
	public static void testZeroGreen()
	{
	  Picture beach = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.zeroGreen();
	  beach.explore();
	}
	
	public static void testZeroBlue()
  {
    Picture beach = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
	
	public static void testKeepOnlyRed()
	{
		Picture blueMark = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\blue-mark.jpg");
		blueMark.explore();
		blueMark.keepOnlyRed();
		blueMark.explore();
	}
	
	public static void testKeepOnlyGreen()
	{
		Picture blueMark = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\blue-mark.jpg");
		blueMark.explore();
		blueMark.keepOnlyGreen();
		blueMark.explore();
	}
	
	public static void testKeepOnlyBlue()
	{
		Picture blueMark = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\blue-mark.jpg");
		blueMark.explore();
		blueMark.keepOnlyBlue();
		blueMark.explore();
	}
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\temple.jpg");
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
    Picture swan = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	//testZeroRed();
	//testZeroGreen();
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
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