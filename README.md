#### 使用方法
1. 在project的build.gradle中添加如下代码：
    ```
    repositories {
        ...
        maven { url 'https://jitpack.io' }

    }
    
    dependencies {
        ...
        classpath 'com.github.FullCat:Hypnus:0.1.0'
    }
    
    ```
2. 在需要提示的项目中添加对插件的应用
    ```
    apply plugin: 'hypnus'
    ```