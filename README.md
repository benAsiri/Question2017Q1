##2017 - SLIIT VERSION

This answer might be not right for you if you are not woring out by yourself. Please find your own way.

## Question 1 - SM

Using the Java reflection API, write a method that:

1. Takes a class name as a parameter.

2. For each method, calculates the Depth of Inheritance Tree (DIT) metric for the
return type.

3. Outputs the method whose return type has the highest DIT value.
Refer to the following method signatures as required:

• java.lang.Class:
```
String getName();
Class forName(String);
Method getMethod(String, Object...);
Method[] getMethods();
Class getSuperclass();
Class asSubclass(Class);
```

•java.lang.reflect.Method:

```
String getName();
boolean isAccessible();
Class[] getParameterTypes();
Class getReturnType();
```

## Authors

* **Dileepa** - *Initial work* - [dsrajapaksa](https://github.com/dsrajapaksa)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
