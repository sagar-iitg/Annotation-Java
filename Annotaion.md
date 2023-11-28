Metadata

Annotation represents metadata
provides additional information to the jvm

#### What is Annotation.?
##### It is kind of adding METADATA to the javacode
##### Means, It's usage is optional
##### We can use this metadata information at runtime and can be certain logic in our code if wanted
##### How to read metadata info? Using Reflection 
##### Annotation can be applied at anywhere like classes, Methods, interface, fields, parameters etc
#####  Extra Information


##### annotations are like pre-defined pieces of code that someone else has written to help you with common tasks, behaviors, or configurations in your code, reducing the need for you to write that code from scratch. They make your code more concise, self-descriptive, and can also assist in automated tools or frameworks.


1. pre-defined annotation //built in
2. custom annotation


used on annotation
(called meta-annotations)

@Target
@Retention
@Documented
@Inherited
@Repeatable (java8 feature)

Used on java code

@Deprecated 
@Override 
@SuppressWarnings
@FunctionalInterface
@SafeVarargs



#### @Deprecated

##### usage of Deprecated class method fields, shows you compile time warnings
##### deprecations means no further improvement is happening on this and use new alternative method or filed instead
##### Can be used over: Constructor, Field, LocalVariable, Method, Package, Parameter, Type(class,interface, enum)

#### @Override
##### During Compile time, it will check that the method should be overridden
##### and throws compile time error, if it do not match with the parent method
##### can be used over: METHODS

#### @SuppressWarnings:

##### It will tell compiler to ignore any compile time warning
##### Use it safely, could led to RUN time Exception if, any valid warnings is IGNORED
##### Can be used over, Field, Method, Parameter, Constructor,Module, LocalVariable, Type(Class or interface or enum)



#### @FunctionalInterface

##### Restrict Interface to have only one abstract method
##### Throws Compilation error, if more than one abstract method is present
##### Can be used over: Type(Class or interface or enum)



#### @SafeVarargs

##### Used to suppress "heap pollution warning"
##### Used over methods and constructors which has variable arguments as parameter
##### methods should be either static or final (method which can not be overridden)
##### In java9, we can also use it on private methods too


#### What is heap pollution

Object of one type(ex: String), storing the reference of another type (example Integer)


### Annotations used Over another annotations (meta-annotations)

#### @Target

##### This meta-annotation will restrict, where to use annotation.
##### Either at method or constructor or fields etc

## Element Type:

    /** Class, interface (including annotation interface), enum, or record
     * declaration */
    TYPE,

    /** Field declaration (includes enum constants) */
    FIELD,

    /** Method declaration */
    METHOD,

    /** Formal parameter declaration */
    PARAMETER,

    /** Constructor declaration */
    CONSTRUCTOR,

    /** Local variable declaration */
    LOCAL_VARIABLE,

    /** Annotation interface declaration (Formerly known as an annotation type.) */
    ANNOTATION_TYPE,

    /** Package declaration */
    PACKAGE,

    /**
     * Type parameter declaration
     *
     * @since 1.8
     */
    TYPE_PARAMETER,

    /**
     * Use of a type
     *
     * @since 1.8
     */
    TYPE_USE,

    /**
     * Module declaration.
     *
     * @since 9
     */
    MODULE,

    /**
     * Record component
     *
     * @jls 8.10.3 Record Members
     * @jls 9.7.4 Where Annotations May Appear
     *
     * @since 16
     */
    RECORD_COMPONENT;


#### @Retention

##### This meta-annotation tells,how annotation will be stored in java

###### RetentionPolicy.SOURCE : Annotation will be discarded by the compiler itself and it will not be recorded in .class file

###### Retention.CLASS : Annotation will be recorded in .class file but will be ignore by JVM at run time

###### RetentionPolicy.RUNTIME: Annotations will be recorded in .classfile+ available during runtime . Usage of reflection can be done

#### @Documented

##### By default, annotations are ignored when java documentations is generated
- with this meta-annotation even annotations will come in java docs

#### @Repeatable
- Allow us to use the same annotation more than one at same place
- we can not do this before java8 



```
@Target
ElementType.TYPE
ElementType.METHOD
ElementType.FIELD
ElementType.CONSTRUCTOR
ElementType.PARAMETER
ElementType.LOCAL_VARIABLE
ElementType.PACKAGE

```

@interface fun()
--> informs compiler that it is annotation not a interface

@Retention(RetentionPolicy.SOURCE) -Act like a comment in code














































