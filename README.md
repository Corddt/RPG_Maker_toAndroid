English | [简体中文](README_zh.md)
# RPGMaker Project Export to Android Tutorial

## Introduction
This tutorial guides you on how to export your RPGMaker project to an Android application. By following these steps, you can run and test your RPGMaker game on Android devices.

## Export Steps
1. **Export the `www` Folder from RPGMaker**
   - Complete your game project in RPGMaker.
   - Select the "File" menu and click "Deployment".
   - ![output1.png](README_pic%2Foutput1.png)
   - When exporting the project, choose "Export to Android/iOS" and ensure no additional options are checked.
   - ![output2.png](README_pic%2Foutput2.png)

2. **Set Up Your Project in Android Studio**
   - Open your Android Studio project.
   - Find the existing `www` folder in the project file explorer.
   - ![output3_www.png](README_pic%2Foutput3_www.png)
   - Replace the `www` folder from RPGMaker with the corresponding template `www` folder in your Android Studio project.
   - ![output4_asset.png](README_pic%2Foutput4_asset.png)

3. **Build the Android Application**
   - In Android Studio, select the "Build" menu.
   - Click "Build Project".
   - ![output5_gene.png](README_pic%2Foutput5_gene.png)
   - Wait for the build process to complete, and then you can test the game on your Android device or emulator.

## Frequently Asked Questions
- **Q**: What should I do if I encounter errors during the build?
- **A**: Ensure that the `www` folder from RPGMaker has been completely and correctly replaced in your Android Studio project. Check that all necessary dependencies are correctly configured.

## Contributions and Support

Contributions and feedback are welcome to make this tutorial better!

---
README Version 1.0
