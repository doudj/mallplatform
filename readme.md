#### 自动生成代码
    mybatis-generator，自动生成实体类、dao和mapper文件

    resource目录下的GenerateScripts目录下的文件，在mall-generator项目下的pom.xml文件中配置各个数据库配置文件，会自动生成相对应的代码。
    配置完文件之后，在mall-generate目录下使用maven命令：mvn install就可以生成代码咯。

![1574341253054](https://github.com/doudouCN/mallplatform/raw/master/resource/pic/1574341253054.png)

#### 使用lombok
    自动生成的代码DTO中都带有set、get方法，使用@Data注解简化代码， Date类型都统一更换为LocalDateTime

#### 引入hutool-all工具包
    只有当hutool工具包中没有相关方法的时候，才推荐使用自己写的方法

#### 多数据源配置
    因为后管需要查看所有数据库中的数据（7个），所以使用多数据源，使用druid连接池，数据库的配置信息在admin项目下的application.yml配置文件中。
    关闭数据源的自动加载，在@SpringBootApplication后面使用exclude
    通过自定义创建数据源来创建各个数据库连接，对应的配置类在config目录下