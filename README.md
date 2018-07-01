# springboot-demo

# 常用注解

* @SpringBootApplication
```text
包含@Configuration、@EnableAutoConfiguration、@ComponentScan
通常用在主类上。
```

* @Repository
```text
用于标注数据访问层组件，即DAO组件
```

* @Service
```text
用于标注业务层组件
```

* @Component
```text
@Component注解可以放在类的头上，泛指组件，当组件不好归类的时候，我们可以使用这个注解进行标注，@Component不推荐使用
```

* @Controller
```text
用于标注表现层组件，也就是Action
```

* @ResponseBody
```text
如果需要返回JSON，XML或自定义mediaType内容到页面，则需要在对应的方法上加上@ResponseBody注解，多用于异步请求
```

* @RestController
```text
是@ResponseBody 和 @Controller的组合，只是使用@RestController注解Controller，则Controller中的方法无法返回jsp页面或者html页面，配置的视图解析器InternalResourceViewResolver不起作用，返回的内容就是Return里的内容
```

* @RequestMapping
```text
RequestMapping是一个用来处理请求地址映射的注解，可用于类或方法上。用于类上，表示类中的所有响应请求的方法都是以该地址作为父路径。
该注解有六个属性：
params 指定request中必须包含某些参数值是，才让该方法处理。
headers 指定request中必须包含某些指定的header值，才能让该方法处理请求。
value 指定请求的实际地址，指定的地址可以是URI Template 模式
method 指定请求的method类型， GET、POST、PUT、DELETE等
consumes 指定处理请求的提交内容类型（Content-Type），如application/json,text/html;
produces 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回
```

* @RequestParam
```text
用在方法的参数前面。
@RequestParam String a =request.getParameter("a")
或者
@RestController
public class HelloController {

    @RequestMapping(value="/hello",method= RequestMethod.GET)
    public String sayHello(@RequestParam("id") Integer id){
        return "id:"+id;
    }
}
```

* @PathVariable
```text
路径变量。参数与大括号里的名字一样要相同。
RequestMapping("user/get/mac/{macAddress}")
public String getByMacAddress(@PathVariable String macAddress){
　　//do something;
}
```

* @GetMapping
```text
@RequestMapping(method = RequestMethod.GET)的缩写。
```

* @PostMapping
```text
@RequestMapping(method = RequestMethod.POST)的缩写。
```

* @Configuration
```text
指出该类是 Bean 配置的信息源，相当于XML中的<beans></beans>，一般加在主类上
```

* @EnableAutoConfiguration
```text
让 Spring Boot 根据应用所声明的依赖来对 Spring 框架进行自动配置，一般加在主类上。
```

* @AutoWired
```text
byType方式。把配置好的Bean拿来用，完成属性、方法的组装，它可以对类成员变量、方法及构造函数进行标注，完成自动装配的工作。
当加上（required=false）时，就算找不到bean也不报错。
```

* @Qualifier
```text
当有多个同一类型的Bean时，可以用@Qualifier("name")来指定。与@Autowired配合使用
```

* @Resource(name="name",type="type")
```text
没有括号内内容的话，默认byName。与@Autowired干类似的事。
```

## 表的映射类的相关注解

* @Entity注解
```text
表示的是关于表映射的类的注解
```
* @Table注解
```text
类映射的表的表名 @Table(name="news")
```
* @GeneratedValue
```text
在表的映射类的主键上加入这个注解，自动创建主键id。
```
* @Transient
```text
在映射类中有的字段，但表中没有，忽略注解下字段的映射
```
* @Id
```text
标注这个属性是表中的主键
```
* @Temporal(TemporalType.TIMESTAMP)
```text
标注Date类型字段，取到页面上是yyyy-MM-dd hh-mm-ss格式
```
