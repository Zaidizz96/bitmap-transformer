/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package bitmap.transformer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testConvertImageToBlue() throws IOException {
        String filePath = "assets/blackbuck.bmp";
        Bitmap bitmap = new Bitmap(filePath);

        bitmap.convertImageToBlue();
        int blue = 0;
        for (int row = 0; row < bitmap.pixelsBitMap.getWidth(); ++row) {
            for (int col = 0; col < bitmap.pixelsBitMap.getHeight(); ++col) {
                Color color = new Color(bitmap.pixelsBitMap.getRGB(row, col));
                if (color.getBlue() > 0) {
                    blue = color.getBlue();
                }
            }
        }

        Assertions.assertTrue(blue > 0);
    }
}