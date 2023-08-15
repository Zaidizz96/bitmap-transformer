package bitmap.transformer;

import java.awt.Color;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.File;
import java.awt.image.BufferedImage;

public class Bitmap
{
    public BufferedImage pixelsBitMap;

    public Bitmap(final String file) throws IOException {
        final File fileName = new File(file);
        this.pixelsBitMap = ImageIO.read(fileName);
    }

    public void convertImageToBlue() {
        for (int row = 0; row < this.pixelsBitMap.getWidth(); ++row) {
            for (int col = 0; col < this.pixelsBitMap.getHeight(); ++col) {
                final Color color = new Color(this.pixelsBitMap.getRGB(row, col));
                final int r = color.getRed();
                final int g = color.getGreen();
                final int b = color.getBlue();
                final int a = color.getAlpha();
                final Color convertBlue = new Color(0, 0, b, a);
                this.pixelsBitMap.setRGB(row, col, convertBlue.getRGB());
            }
        }
        System.out.println("image converted successfully");
    }

    public void convertToGreen() {
        for (int row = 0; row < this.pixelsBitMap.getWidth(); ++row) {
            for (int col = 0; col < this.pixelsBitMap.getHeight(); ++col) {
                final Color color = new Color(this.pixelsBitMap.getRGB(row, col));
                final int r = color.getRed();
                final int g = color.getGreen();
                final int b = color.getBlue();
                final int a = color.getAlpha();
                final Color lavenderColor = new Color(0, g, 0, a);
                this.pixelsBitMap.setRGB(row, col, lavenderColor.getRGB());
            }
        }
        System.out.println("image converted succesfully");
    }

    public void writeImage(final String fileName) throws IOException {
        final File fileToWrite = new File(fileName);
        ImageIO.write(this.pixelsBitMap, "bmp", fileToWrite);
    }
}