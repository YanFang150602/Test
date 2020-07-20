


问题：测试代码时，报mybatis.xml文件找不到
原因：idea不会将xml文件由src目录（包括包里的xml文件）编译到classes目录下
解决：在pom.xml文件里的build标签里添加：
    <resources>
        <resource>
            <directory>src/main/java</directory>
        </resource>
    </resources>
