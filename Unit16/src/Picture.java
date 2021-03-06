import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroRed()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setRed(0);
	      }
	    }  
  }
  
  public void zeroGreen()
  {
	  Pixel[][] pixels = this.getPixels2D();
	    for (Pixel[] rowArray : pixels)
	    {
	      for (Pixel pixelObj : rowArray)
	      {
	        pixelObj.setGreen(0);
	      }
	    }
  }
  
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void keepOnlyRed()
  {
	  zeroGreen();
	  zeroBlue();
  }
  
  public void keepOnlyGreen()
  {
	  zeroRed();
	  zeroBlue();
  }
  
  public void keepOnlyBlue()
  {
	  zeroRed();
	  zeroGreen();
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	       pixelObj.setRed(255-pixelObj.getRed());
	       pixelObj.setGreen(255-pixelObj.getGreen());
	       pixelObj.setBlue(255-pixelObj.getBlue());

	    }
	  }
  }
  
  public void grayscale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	  	  int average = (pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3;
	      pixelObj.setRed(average);
	      pixelObj.setGreen(average);
	      pixelObj.setBlue(average);

	    }
	  }
  }
  
  public void fixUnderwater()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for (Pixel[] rowArray : pixels)
	  {
	    for (Pixel pixelObj : rowArray)
	    {
	      pixelObj.setRed(pixelObj.getRed()*5-637);
	      pixelObj.setGreen(pixelObj.getGreen()*5-637);
	      pixelObj.setBlue(pixelObj.getBlue()*5-637);

	    }
	  }
  }  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = 0; col < pixels[row].length; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[height - 1 - row][col];
        botPixel.setColor(topPixel.getColor());
      }
    } 
  }
  
  public void mirrorHorizontalBotToTop()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int height = pixels.length;
    for (int row = 0; row < height / 2; row++)
    {
      for (int col = 0; col < pixels[row].length; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[height - 1 - row][col];
        topPixel.setColor(botPixel.getColor());
      }
    } 
  }
  
  public void mirrorDiagonal()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    for (int row = 0; row < 480; row++)
    {
      for (int col = 0; col < 480; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[col][row];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
  }
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }
  

  public void mirrorArms()
  {
    int mirrorPoint = 193;
    Pixel topPixel = null;
    Pixel botPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 158; row < mirrorPoint; row++)
    {
      for (int col = 103; col < 170; col++)
      {
        
        topPixel = pixels[row][col];      
        botPixel = pixels[mirrorPoint - row + mirrorPoint][col];
        botPixel.setColor(topPixel.getColor());
      }
    }
    
    int mirrorPoint2 = 193;
    Pixel topPixel2 = null;
    Pixel botPixel2 = null;
    
    for (int row = 171; row < mirrorPoint; row++)
    {
      for (int col = 239; col < 294; col++)
      {
        
        topPixel2 = pixels[row][col];      
        botPixel2 = pixels[mirrorPoint - row + mirrorPoint][col];
        botPixel2.setColor(topPixel2.getColor());
      }
    }
  }
  
  public void mirrorGull()
  {
    int mirrorPoint = 350;
    Pixel gullPixel = null;
    Pixel noGullPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    
    for (int row = 230; row < 320; row++)
    {
      for (int col = 230; col < mirrorPoint; col++)
      {
        
        gullPixel = pixels[row][col];      
        noGullPixel = pixels[row][mirrorPoint - col + mirrorPoint];
        noGullPixel.setColor(gullPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }
  
  public void copy2(Picture fromPic, 
          int startRow, int startCol, int endRow, int endCol)
  {
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  for (int fromRow = 0, toRow = startRow; 
			  fromRow < endRow &&
			  toRow < toPixels.length; 
			  fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; 
				  fromCol < endCol &&
				  toCol < toPixels[0].length;  
				  fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }   
}
  
  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\flower1.jpg");
    Picture flower2 = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\test\\collage.jpg");
  }
  
  public void createCollage2()
  {
	  Picture TOOTHY = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\TOOTHY.jpg");
	  this.copy2(TOOTHY, 0, 0, 123, 200);
	  this.copy2(TOOTHY, 0, 200, 123, 200);
	  this.copy2(TOOTHY, 0, 400, 123, 200);
	  this.copy2(TOOTHY, 150, 0, 123, 200);
	  this.copy2(TOOTHY, 150, 200, 123, 200);
	  this.copy2(TOOTHY, 150, 400, 123, 200);
	  this.copy2(TOOTHY, 300, 0, 123, 200);
	  this.copy2(TOOTHY, 300, 200, 123, 200);
	  this.copy2(TOOTHY, 300, 400, 123, 200);
  }
  
  public void myCollage()
  {
	  Picture TOOTHY = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\TOOTHY.jpg");
	  Picture TOOTHYZeroGreen = new Picture(TOOTHY);
	  TOOTHYZeroGreen.zeroGreen();
	  Picture TOOTHYKeepOnlyRed = new Picture(TOOTHY);
	  TOOTHYKeepOnlyRed.keepOnlyRed();
	  Picture TOOTHYNegate = new Picture(TOOTHY);
	  TOOTHYNegate.negate();
	  this.copy2(TOOTHYZeroGreen, 0, 0, 123, 200);
	  this.copy(TOOTHY, 125, 0);
	  this.copy2(TOOTHYZeroGreen, 125, 0, 123, 350);
	  this.copy(TOOTHYNegate, 125, 325);
	  this.copy2(TOOTHYKeepOnlyRed, 125, 325, 123, 350);

	  int mirrorPoint = 320;
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  Pixel[][] pixels = this.getPixels2D();
	    
	  // loop through the rows
	  for (int row = 5; row < 123; row++)
	  {
	    // loop from 13 to just before the mirror point
	    for (int col = 5; col < mirrorPoint; col++)
	    {
	        
	      leftPixel = pixels[row][col];      
	      rightPixel = pixels[row]                       
	    		  [mirrorPoint - col + mirrorPoint];
	      rightPixel.setColor(leftPixel.getColor());
	    }
	  }

  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    

    
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
        {
        	leftPixel.setColor(Color.BLACK);
        }
        else
        {
            leftPixel.setColor(Color.WHITE);
        }
      }
    }
  }
  
  public void edgeDetection2(int edgeDist2)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    
    Pixel topPixel = null;
    Pixel botPixel = null;
    Color botColor = null;
    
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        topPixel = pixels[row][col];
        botPixel = pixels[row+1][col];
        rightColor = rightPixel.getColor();
        botColor = botPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist2 && topPixel.colorDistance(botColor) > 
            edgeDist2)
        {
        	leftPixel.setColor(Color.BLACK);
            topPixel.setColor(Color.BLACK);
        }
        else
        {
            leftPixel.setColor(Color.WHITE);
            topPixel.setColor(Color.WHITE);
        }
      }
    }
  }  
  
  public void encode(Picture messagePict)
  {
	  /*
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  // if the current pixel red is odd make it even
			  currPixel = currPixels[row][col];
			  if (currPixel.getRed() % 2 == 1)
				  currPixel.setRed(currPixel.getRed() - 1);
			  messagePixel = messagePixels[row][col];
			  if (messagePixel.colorDistance(Color.BLACK) < 50)
			  {
				  currPixel.setRed(currPixel.getRed() + 1);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
	  */
	  Pixel[][] messagePixels = messagePict.getPixels2D();
	  Pixel[][] currPixels = this.getPixels2D();
	  Pixel currPixel = null;
	  Pixel messagePixel = null;
	  int count = 0;
	  double avg = 0.0;
	  int lastDigit = 0;
	  
	  
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = currPixels[row][col];
			  avg += currPixel.getRed();
			  avg += currPixel.getGreen();
			  avg += currPixel.getBlue();
			  count++;
		  }
	  }
	  avg/= count;
	  lastDigit = ((int) avg)%10;
	  
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  // if the current pixel's RGB values modded by 10 are same as last digit make it not that
			  currPixel = currPixels[row][col];
			  if (currPixel.getRed() % 10 == lastDigit)
				  currPixel.setRed(currPixel.getRed() + 1);
			  if (currPixel.getBlue() % 10 == lastDigit)
				  currPixel.setBlue(currPixel.getGreen() + 1);
			  if (currPixel.getGreen() % 10 == lastDigit)
				  currPixel.setGreen(currPixel.getGreen() + 1);
			  messagePixel = messagePixels[row][col];
			  if (messagePixel.colorDistance(Color.BLACK) < 50)
			  {
				  currPixel.setRed(currPixel.getRed() - currPixel.getRed()%10 + lastDigit);
				  currPixel.setGreen(currPixel.getGreen() - currPixel.getGreen()%10 + lastDigit);
				  currPixel.setBlue(currPixel.getBlue() - currPixel.getBlue()%10 + lastDigit);
				  System.out.println(currPixel.getRed() + " and " + currPixel.getGreen() + " and " + currPixel.getBlue());
			  }
		  }
	  }
	  currPixels[0][0].setRed(currPixel.getRed() - currPixel.getRed()%10 + lastDigit);
	  //System.out.println(lastDigit);
  	}
  /**
  * Method to decode a message hidden in the
  * red value of the current picture
  * @return the picture with the hidden message
  */
  public Picture decode()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  int height = this.getHeight();
	  int width = this.getWidth();
	  Pixel currPixel = null;

	  Pixel messagePixel = null;
	  Picture messagePicture = new Picture(height,width);
	  Pixel[][] messagePixels = messagePicture.getPixels2D();
	  int count = 0;
	  int lastDigit = pixels[0][0].getRed()%10;
	  
	  //NEED TO FIND A WAY TO GET THE SAME LAST DIGIT VALUE. RIGHT NOW, IT IS DIFFERENT BECAUSE CHANGED RGB VALUES IN ENCODE
	  
	  for (int row = 0; row < this.getHeight(); row++)
	  {
		  for (int col = 0; col < this.getWidth(); col++)
		  {
			  currPixel = pixels[row][col];
			  messagePixel = messagePixels[row][col];
			  if (currPixel.getRed() % 10 == lastDigit && currPixel.getBlue() % 10 == lastDigit && currPixel.getGreen() % 10 == lastDigit)
			  {
				  System.out.println(currPixel.getRed()%10 + " and " + currPixel.getGreen() + " and " + currPixel.getBlue());
				  messagePixel.setColor(Color.BLACK);
				  count++;
			  }
		  }
	  }
	  System.out.println(count);
	  return messagePicture;
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("H:\\APCSA\\wang_ryan_apcsa-p22\\Unit16\\src\\images\\beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
