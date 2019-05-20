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
	
	public static void testNegate()
	{
		Picture TOOTHY = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\TOOTHY.jpg");
		TOOTHY.explore();
		TOOTHY.negate();
		TOOTHY.explore();
	}
  
	public static void testGrayscale()
	{
		Picture TOOTHY = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\TOOTHY.jpg");
		TOOTHY.explore();
		TOOTHY.grayscale();
		TOOTHY.explore();
	}
	
	public static void testFixUnderwater()
	{
		Picture water = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\water.jpg");
		water.explore();
		water.fixUnderwater();
		water.explore();
	}
	
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture jenny = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\jenny-red.jpg");
    jenny.explore();
    jenny.mirrorVertical();
    jenny.explore();
  }
  
  public static void testMirrorVerticalRightToLeft()
  {
    Picture jenny = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\jenny-red.jpg");
    jenny.explore();
    jenny.mirrorVerticalRightToLeft();
    jenny.explore();
  }
  
  public static void testMirrorHorizontal()
  {
    Picture motorcycle = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontal();
    motorcycle.explore();
  }
  
  public static void testMirrorHorizontalBotToTop()
  {
    Picture motorcycle = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\redMotorcycle.jpg");
    motorcycle.explore();
    motorcycle.mirrorHorizontalBotToTop();
    motorcycle.explore();
  }
  
	public static void testMirrorDiagonal()
	{
	  Picture beach = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\beach.jpg");
	  beach.explore();
	  beach.mirrorDiagonal();
	  beach.explore();
	}  
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  public static void testMirrorArms()
  {
    Picture snowman = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\snowman.jpg");
    snowman.explore();
    snowman.mirrorArms();
    snowman.explore();
  }
  
  public static void testMirrorGull()
  {
	  Picture gull = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\seagull.jpg");
	  gull.explore();
	  gull.mirrorGull();
	  gull.explore();	  
  }
  

  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  public static void testCopy2()
  {
	  Picture canvas = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\640x480.jpg");
	  canvas.createCollage2();
	  canvas.explore();
  }
  
  public static void testMyCollage()
  {
	  Picture canvas = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\640x480.jpg");
	  canvas.myCollage();
	  canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testEdgeDetection2()
  {
    Picture TOOTHY = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\TOOTHY.jpg");
    TOOTHY.edgeDetection(10);
    TOOTHY.explore();
  }
  
  public static void testEncode()
  {
	  Picture beach = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\beach.jpg");
	  beach.explore();
	  Picture msg = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\crybytes-apple_icon.jpg");
	  msg.explore();
	  beach.encode(msg);
	  beach.explore();
	  beach.decode().explore();
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
    //testMirrorVertical();
	//testMirrorVerticalRightToLeft();
	//testMirrorHorizontal();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
	//testCopy2();
	//testMyCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
    testEncode();
  }
}