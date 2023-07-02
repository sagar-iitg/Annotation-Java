Metadata

Annotation represents metadata
provides additional information to the jvm

#### What is Annotation.?
##### It is kind of adding METADATA to the javacode
##### Means, It's usage is optional
##### We can use this metadata information at runtime and can be certain logic in our code if wanted
##### How to read metadata info? Using Reflection 
##### Annotation can be applied at anywhere like classes, Methods, interface, fields, parameters etc



1. pre-defined annotaion
2. custom annotation

used on annotaion
(called meta-annotaions)

@Target
@Retention
@Documented
@Inherited
@Repeatable (java8 feature)

Used on java code

@Deprecated 
@Override 
@SupressWarnings
@FunctionalInterface
@SafeVarargs



#### @Deprecated



##### usage of Deprecated class method fields, shows you compile time warnings
##### deprecations means no further improvement is happening on this and use new alternative method or filed instead
##### Can be used over: Constructor, Field, LocalVariable, Method, Package, Parameter, Type(class,interface, enum)




