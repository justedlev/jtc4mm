<div id="header" align="center">
    <h1>jtc4omm</h1>
    <h3>🔃 Java type converters for org.modelmapper</h3>
</div>

<div id="badges" align="center">

[![language](https://img.shields.io/badge/Java%2011-e6892e)](https://github.com/justedlev/jtc4mm)
[![Maven Central](https://img.shields.io/maven-central/v/io.github.justedlev.commons/jtc4mm.svg?label=jtc4mm)](https://central.sonatype.com/search?q=io.justedlev.commons.jtc4mm)
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
   - [BigDecimalToDouble](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FBigDecimalToDouble)
   - [BigDecimalToFloat](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FBigDecimalToFloat)
   - [BigDecimalToInteger](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FBigDecimalToInteger)
   - [BigDecimalToLong](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FBigDecimalToLong)
   - [DoubleToBigDecimal](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FDoubleToBigDecimal)
   - [FloatToBigDecimal](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FFloatToBigDecimal)
   - [IntegerToBigDecimal](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FIntegerToBigDecimal)
   - [LongToBigDecimal](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FLongToBigDecimal)
2. Date and time
   - [DateToLocalDateTime](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FDateToLocalDateTime)
   - [DateToTimestamp](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FDateToTimestamp)
   - [InstantToLocalDateTime](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FInstantToLocalDateTime)
   - [InstantToTimestamp](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FInstantToTimestamp)
   - [LocalDateTimeToTimestamp](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FLocalDateTimeToTimestamp)
   - [LocalDateToTimestamp](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FLocalDateToTimestamp)
   - [TimestampToLocalDate](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FTimestampToLocalDate)
   - [TimestampToLocalDateTime](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FTimestampToLocalDateTime)
3. String
   - [ToLowerCase](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FToLowerCase)
   - [ToUpperCase](..%2Fsrc%2Fmain%2Fjava%2Fio%2Fjustedlev%2Fcommons%2Fjtc4omm%2FToUpperCase)
