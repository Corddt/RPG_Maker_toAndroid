简体中文 | [English](README_en.md)
# RPGMaker 项目导出至 Android 教程

## 简介
这个教程指导您如何将 RPGMaker 项目导出为 Android 应用。通过这些步骤，您可以在 Android 设备上运行和测试您的 RPGMaker 游戏。


## 导出步骤
1. **从 RPGMaker 导出 `www` 文件夹**
    - 在 RPGMaker 中完成您的游戏项目。
    - 选择“文件”菜单并点击”部署“
    - ![output1.png](README_pic%2Foutput1.png)
    - 导出项目时，选择“导出为Android/iOS”,确保不要勾选任何额外的选项。
    - ![output2.png](README_pic%2Foutput2.png)

2. **在 Android Studio 中设置项目**
    - 打开您的 Android Studio 项目。
    - 在项目文件浏览器中找到现有的 `www` 文件夹。
    - ![output3_www.png](README_pic%2Foutput3_www.png)
    - 将 RPGMaker 导出的 `www` 文件夹替换掉 Android Studio 项目中的对应模板www文件夹。
    - ![output4_asset.png](README_pic%2Foutput4_asset.png)

3. **构建 Android 应用**
    - 在 Android Studio 中，选择“构建”菜单。
    - 点击“构建项目”。
    - ![output5_gene.png](README_pic%2Foutput5_gene.png)
    - 等待构建过程完成，即可在您的 Android 设备或模拟器上测试游戏。

## 常见问题与解答
- **Q**: 构建时出现错误怎么办？
- **A**: 确保 RPGMaker 的 `www` 文件夹完整无误地替换了 Android Studio 项目中的文件夹。检查所有必要的依赖项是否已正确配置。

## 贡献和支持

欢迎贡献和反馈，一起让这个教程变得更好！

---
README 版本 1.0
