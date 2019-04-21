import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

/*
AppSec Lab 1a: 				Image Resizer  (Takes an image and creates a new resized square version)
Authors:					Redwanul Mutee 	rm4243
							Farhad Ahmed 	fa961
*/

public class ImageResizer {
    //Inputs: path of base iamge, path to save new image, dimensions of square
    public void sqTransformImg(String basePath, String squarePath, int sqDim) throws IOException {
        File baseImgFile = new File(basePath);                                                             	//Open the original image file
	    BufferedImage baseImg = ImageIO.read(baseImgFile);                                                 	//Create BufferredImage for original image file
	    BufferedImage sqrImg = new BufferedImage(sqDim, sqDim, baseImg.getType());                         	//Create BufferedImage for square image with dimensions 
	    Graphics2D fillSqrImg = sqrImg.createGraphics();                                                   	//Create Graphics2D object to assist in filling square image
	    fillSqrImg.drawImage(baseImg, 0, 0, sqDim, sqDim, null);                                           	//Draw original image into square image
	    ImageIO.write(sqrImg, squarePath.substring(squarePath.lastIndexOf(".")+1), new File(squarePath));  	//Create the new image file
    }
    
	public static void main(String [] args) {
        String imgFilePath;
        String sqFilePath;
        int sqSideLen;
        if (args.length == 0) {
            imgFilePath = "../data/ddd.jpg";                                                                //Path of the default image
            sqFilePath = "../data/squareDDD.jpg";                                                           //Path of the square default image
            sqSideLen = 512;		                                                                        //Size of the default square image
        }
        else {                                                                                              //User specified variables
            System.out.println(args[0]+args[1]+args[2]);
            imgFilePath = args[0];
            sqFilePath = args[1];
            sqSideLen = Integer.parseInt(args[2]);
        }

		ImageResizer ImageResizeInst = new ImageResizer();                                                 	//Instantiate class
        try { ImageResizeInst.sqTransformImg(imgFilePath, sqFilePath, sqSideLen); }                        	//Try to transform original image into square dimensions
        catch (IOException e) { System.out.println("Error!! The File Was Not Found!!"); }                   //Print error otherwise
		return;	
	}
}
