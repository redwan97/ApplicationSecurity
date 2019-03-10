AppSec         03/08/19
Redwanul Mutee rm4243
Farhad Ahmed   sfa961

We decided to write a short program that resizes any image to an image with specified  square dimensions. 
Place image to transform in the data folder. If the program is compiled without any specifications, 
then a default image will be transformed. Examine the data folder to view the output.

To compile with default images.

	javac ImageResizer.java			
	java ImageResizer 

To compile with custom images, specify via system args. 

	javac ImageResizer.java			
	java ImageResizer [-original image-] [-path-] [-size-]


