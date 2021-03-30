1.七大原则：

单一职责原则(Single Responsibility)
接口隔离原则(Interface Segregation)
依赖倒置原则 里氏替换原则 开闭原则 迪米特法则 合成复用原则 1.1 单一职责原则(Single Responsibility)

	对类来说，一个类只应该负责一项职责。

	优点：

降低类的复杂性； 提高类的可读性； 降低变更引起的风险； 类中代码足够少的情况，可以只遵循方法级别的单一职责原则。 1.2 接口隔离原则(Interface Segregation)

	客户端不应该依赖它不需要的接口，即一个类对另一个类的依赖应该建立在最小的接口上。用不到的方法进行隔离。（将interface接口进行合适的拆分啦实现方法隔离。）

1.3 依赖倒转原则(Dependence Inversion Principle)

高层模块不应该依赖低层模块，二者都应该依赖其抽象； 抽象不应该依赖细节，细节应该依赖抽象； 依赖倒转的中心思想：面向接口编程；
依赖倒转的设计理念：相对于细节的多变性，抽象的东西相对稳定。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。在Java中，抽象指的是接口或者抽象类，细节就是具体实现的类。
使用接口或者抽象类的目的是制定好规范，而不涉及任何具体的操作，把展现细节的任务交给实现类区完成。