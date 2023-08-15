package bitmap.transformer;

import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

public class Bitmap
{
    public BufferedImage pixelsBitMap;

    public Bitmap( String file) throws IOException {
         File fileName = new File(file);
        this.pixelsBitMap = ImageIO.read(fileName);
    }

    public void convertImageToBlue() {
        for (int row = 0; row < this.pixelsBitMap.getWidth(); ++row) {
            for (int col = 0; col < this.pixelsBitMap.getHeight(); ++col) {
                 Color color = new Color(this.pixelsBitMap.getRGB(row, col));
                 int r = color.getRed();
                 int g = color.getGreen();
                 int b = color.getBlue();
                 int a = color.getAlpha();
                 Color convertBlue = new Color(0, 0, b, a);
                this.pixelsBitMap.setRGB(row, col, convertBlue.getRGB());
            }
        }
        System.out.println("image converted successfully");
    }

    public void convertToGreen() {
        for (int row = 0; row < this.pixelsBitMap.getWidth(); ++row) {
            for (int col = 0; col < this.pixelsBitMap.getHeight(); ++col) {
                 Color color = new Color(this.pixelsBitMap.getRGB(row, col));
                 int r = color.getRed();
                 int g = color.getGreen();
                 int b = color.getBlue();
                 int a = color.getAlpha();
                 Color lavenderColor = new Color(0, g, 0, a);
                this.pixelsBitMap.setRGB(row, col, lavenderColor.getRGB());
            }
        }
        System.out.println("image converted succesfully");
    }

    public void writeImage( String fileName) throws IOException {
         File fileToWrite = new File(fileName);
        ImageIO.write(this.pixelsBitMap, "bmp", fileToWrite);
    }
}