package org.example;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {

    String name;
    int age;


    /*
    * OOPS
    * 1. Data encapsulation
    *
    * 4 types of access modifiers
*1.public:
Grants access to a class, method, or field from anywhere in your program, regardless of package.
One-liner: Accessible from everywhere.
*
*
2. private:
Restricts access to a class member (method, field) to the same class only.
One-liner: Accessible only within the class.
*
*
*
3. protected:
Allows access to a class member from within the same package and from subclasses in any package.
One-liner: Accessible within the package and by subclasses.
*
*
*
*
4. default (package-private):
The default modifier (no keyword required) grants access to class members from within the same package only.
One-liner: Accessible within the package (default).
Key Points:

*
Top-level classes (outside of any package) can only be declared public or with the default modifier.
Access modifiers promote encapsulation, data hiding, and code maintainability.
Choose the appropriate modifier based on the desired level of accessibility and protection for your class members.
    *
    *
    *
    * 2.  Data Hiding
    * 3.  Inheritance
    * 4.  Polymorphism
    *
    *
    *
    * */
}
