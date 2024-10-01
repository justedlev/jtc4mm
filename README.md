<div id="header" align="center">
    <h1>jtc4mm</h1>
    <h3>🔃 Java type converters for ModelMapper</h3>
</div>

<div id="badges" align="center">

[![language](https://img.shields.io/badge/Java%2011-e6892e?logo=openjdk)](https://github.com/justedlev/jtc4mm)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.justedlev.commons/jtc4mm?logo=apachemaven&label=jtc4mm)](https://central.sonatype.com/search?q=io.justedlev.commons.jtc4mm)
[![license](https://img.shields.io/github/license/justedlev/jtc4mm)](https://www.apache.org/licenses/LICENSE-2.0.txt)
[![stars](https://img.shields.io/github/stars/justedlev/jtc4mm)](https://github.com/Justedlev/jtc4mm/star)
[![issues](https://img.shields.io/github/issues/justedlev/jtc4mm)](https://github.com/Justedlev/jtc4mm/issues)

</div>

### 🤔 Why?

I was inspired to create __jtc4mm__ (java type converters for ModelMapper), 
because I noticed that I often implement converters in my projects, 
either as a separate module or inside the project itself 
(I believe that I’m not the only one who encountered this), 
so What are you looking for, simple converters for one of the powerful tools of 
[ModelMapper](https://modelmapper.org/)

### 📥 Maven dependency

```xml
<dependency>
    <groupId>io.github.justedlev.commons</groupId>
    <artifactId>jtc4mm</artifactId>
    <version>0.0.1</version>
</dependency>
```

### 🧾 Set

What has already been implemented:

1. Number
   - [BigDecimalToDouble](src/main/java/io/justedlev/commons/jtc4mm/BigDecimalToDouble.java)
   - [BigDecimalToFloat](src/main/java/io/justedlev/commons/jtc4mm/BigDecimalToFloat.java)
   - [BigDecimalToInteger](src/main/java/io/justedlev/commons/jtc4mm/BigDecimalToInteger.java)
   - [BigDecimalToLong](src/main/java/io/justedlev/commons/jtc4mm/BigDecimalToLong.java)
   - [DoubleToBigDecimal](src/main/java/io/justedlev/commons/jtc4mm/DoubleToBigDecimal.java)
   - [FloatToBigDecimal](src/main/java/io/justedlev/commons/jtc4mm/FloatToBigDecimal.java)
   - [IntegerToBigDecimal](src/main/java/io/justedlev/commons/jtc4mm/IntegerToBigDecimal.java)
   - [LongToBigDecimal](src/main/java/io/justedlev/commons/jtc4mm/LongToBigDecimal.java)
2. Date and time
   - [DateToLocalDateTime](src/main/java/io/justedlev/commons/jtc4mm/DateToLocalDateTime.java)
   - [DateToTimestamp](src/main/java/io/justedlev/commons/jtc4mm/DateToTimestamp.java)
   - [InstantToLocalDateTime](src/main/java/io/justedlev/commons/jtc4mm/InstantToLocalDateTime.java)
   - [InstantToTimestamp](src/main/java/io/justedlev/commons/jtc4mm/InstantToTimestamp.java)
   - [LocalDateTimeToTimestamp](src/main/java/io/justedlev/commons/jtc4mm/LocalDateTimeToTimestamp.java)
   - [LocalDateToTimestamp](src/main/java/io/justedlev/commons/jtc4mm/LocalDateToTimestamp.java)
   - [TimestampToLocalDate](src/main/java/io/justedlev/commons/jtc4mm/TimestampToLocalDate.java)
   - [TimestampToLocalDateTime](src/main/java/io/justedlev/commons/jtc4mm/TimestampToLocalDateTime.java)
   - [LocalDateToSqlDate](src/main/java/io/justedlev/commons/jtc4mm/LocalDateToSqlDate.java)
   - [SqlDateToLocalDate](src/main/java/io/justedlev/commons/jtc4mm/SqlDateToLocalDate.java)
3. String
   - [ToLowerCase](src/main/java/io/justedlev/commons/jtc4mm/ToLowerCase.java)
   - [ToUpperCase](src/main/java/io/justedlev/commons/jtc4mm/ToUpperCase.java)
   - [StringToUUID](src/main/java/io/justedlev/commons/jtc4mm/StringToUUID.java)
