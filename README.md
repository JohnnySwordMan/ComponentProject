# Component

1. App只是壳，不应该有任何模块
2. 所有的模块需要在App层implementation
3. 模块之间只能接口依赖

### SPI(Service Provider Interface)

1. Java通过读取指定目录下的配置文件，再通过反射获取了实现类，并把实现类保存到Map中，下次使用
2. 懒加载，在第一次调用的时候才会创建实例
3. 反射 ---> 慢
4. 注入方式有多种，例如：spi、dagger等，思想都是类似的，使用base模块存储和获取能力，app或impl层负责注入，供其他组件使用


### 待优化的点

1. Java中使用ServiceLoader去读取SPI配置信息是在程序运行时，我们可以将这个读取配置信息提前，在编译时候就搞定，
通过gradle插件，去扫描class文件，找到具体的服务类（可以通过标注来确定），然后生成新的java文件，这个文件中包含了具体的实现类。
这样程序在运行时，就已经知道了所有的具体服务类，缺点就是编译时间会加长，自己需要重新写一套读取SPI信息、生成java文件等逻辑。


### 参考文献

1. https://zhoukaibo.com/2019/03/16/java-spi/
2. https://juejin.im/post/5d2db85d6fb9a07ea7134408
3. https://juejin.im/post/5e5552a5f265da576d60a563
4. https://github.com/johnsonlee/booster-pngquant-provider