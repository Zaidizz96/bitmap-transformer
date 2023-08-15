# bitmap-transformer
This Java application allows you to transform bitmap images by converting them to different colors. The application provides command-line options to perform transformations and save the modified images.

---
### Contributors

---
- Zaid Izziddine
- Marwa Hussein

---
### Run the application

---
this application can be running by take an input arguments from CLI.

- First arguments from input CLI representing the bmp file path , that we want modify on it ex.`blackbuck/bmp`.
- Second argument from  CLI representing the output new bmp file path ex. `newBlackBuck/bmp`.
- Third argument from CLI representing the name of the transformation that we need.

#### CLI command to run the app ( convert color to GREEN).

``` bash
./gradlew run --args 'assets/blackbuck.bmp assets/newBlackBuck.bmp green' 
```
---
### Supported color transformations

---

- #### Green Conversion
  Converts the image to shades of green while preserving the original red and blue components.
![](.././bitmap-transformer/app/assets/newBlackBuck1.bmp)

- #### Blue Conversion 
  Converts the image to shades of blue while preserving the original red and green components.
![](.././bitmap-transformer/app/assets/newBlackBuck.bmp)