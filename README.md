# Java Method Reference & Stream API Demo

This project demonstrates how to use **Java 8 Stream API** and **Method References** to process and transform a list of employee names.

The program performs several operations such as:

* Removing empty strings
* Removing special characters
* Converting names to uppercase
* Sorting names alphabetically
* Creating `Employee` objects using constructor references

---

# Technologies Used

* Java 8+
* Stream API
* Method References
* Apache Commons Lang (`StringUtils`)

---

# Project Structure

```text
project
│
├── MethodReferenceDemo.java
├── Employee.java
└── MyDataFormatter.java
```

### Files Description

| File                       | Description                                               |
| -------------------------- | --------------------------------------------------------- |
| `MethodReferenceDemo.java` | Main class demonstrating Stream API and Method References |
| `Employee.java`            | Employee model class                                      |
| `MyDataFormatter.java`     | Utility class to remove special characters                |

---

# Input Data

The program starts with a list containing:

* Valid names
* Empty strings
* Null values
* Names with special characters

```java
List<String> names = new ArrayList<>(
Arrays.asList(
"prs%^@#^ad",
"",
"chau#@#$@%#han",
"mo@#%@unika",
"sha#%@#%nvi",
"",
null
));
```

---

# Data Processing Steps

The Stream API performs the following transformations:

### 1. Remove Empty Strings

```java
.filter(StringUtils::isNotEmpty)
```

Uses a **static method reference** from Apache Commons `StringUtils`.

---

### 2. Remove Special Characters

```java
.map(fd::removeSplChars)
```

Uses an **instance method reference** from `MyDataFormatter`.

---

### 3. Convert to Uppercase

```java
.map(String::toUpperCase)
```

Uses a **method reference to an instance method of arbitrary objects**.

---

### 4. Sort Names Alphabetically

```java
.sorted(String::compareTo)
```

Sorts names in alphabetical order.

---

### 5. Create Employee Objects

```java
.map(Employee::new)
```

Uses a **constructor reference** to create `Employee` objects.

---

# Full Stream Pipeline

```java
List<Employee> employees = names.stream()

.filter(StringUtils::isNotEmpty)

.map(fd::removeSplChars)

.map(String::toUpperCase)

.sorted(String::compareTo)

.map(Employee::new)

.toList();
```

---

# Output Example

```text
[Employee{name='CHAUHAN'}, 
 Employee{name='MOONIKA'}, 
 Employee{name='PRASAD'}, 
 Employee{name='SHANVI'}]
```

---

# Types of Method References Used

This project demonstrates **all four types of Java Method References**.

| Type                                | Example                   |
| ----------------------------------- | ------------------------- |
| Static Method Reference             | `StringUtils::isNotEmpty` |
| Instance Method Reference           | `fd::removeSplChars`      |
| Instance Method of Arbitrary Object | `String::toUpperCase`     |
| Constructor Reference               | `Employee::new`           |

---

# Key Concepts Covered

* Java 8 Stream API
* Functional Programming
* Method References
* Lambda expressions
* Data transformation pipeline
* Clean and readable code

---

# How to Run

### 1. Clone Repository

```bash
git clone https://github.com/yourusername/java-method-reference-demo.git
```

### 2. Open in IDE

Use any Java IDE:

* IntelliJ IDEA
* Eclipse
* VS Code

### 3. Run the Program

Run:

```
MethodReferenceDemo.java
```

---

# Learning Outcome

After completing this project, you will understand:

* How **method references simplify lambda expressions**
* How to build **clean stream pipelines**
* How to perform **data transformation using Java Streams**

---

# Author

**Prasad Chauhan**

Java Backend Developer
Java | Spring Boot | Microservices
