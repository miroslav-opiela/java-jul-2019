Vytvorte nasledovné metódy:

- V reťazci `tancuj vykrucaj` nahraďte všetky výskyty písmena `r` písmenom `l` a dvakrát opakujte. Modifikujte metódu podľa pokynov - zmena parametrov (žiaden parameter, jeden parameter typu String, doplnenie o ďalší parameter typu char), návratový typ.

- Pre zadaný reťazec vytvorte skratku zloženú z jeho prvých 3 písmen. Skratka je písaná veľkými písmenami.
	- Príklad: `java` -> `JAV`, `Slovenská republika` -> `SLO`
	- Tip: metódy `substring()` a `toUpperCase()` v triede `String`
	- Vylepšenie: namiesto prvých troch písmen nech sa skratka skladá z *n* znakov, pričom *n* je dané parametrom metódy.
```java
public String abbreviation(String s)
public String abbreviation(String s, int abbrLength)
```

- Vytvorte reťazec ktorý vznikne opakovaním zadaného znaku. Počet opakovaní je popísaný parametrom.
	- Príklad: `a, 5` -> `aaaaa`, `Q, 10` -> `QQQQQQQQQQ`, `c, 0` -> *prázdny retazec*
```java
public String generateWord(char c, int count)
```

- Vytvorte nový reťazec, ktorý vznikne otočením zadaného reťazca.
	- Príklad: `desserts` -> `stressed`, `aBc d` -> `d cBa`
```java
public String reverseString(String s)
```

- V zadanom reťazci spočítajte počet číslic.
	- Príklad: `Beverly hills 90210` -> `5`, `jeden dva tri` -> `0`
```java
public int numbersCount(String s)
```

- Overí, či sú všetky písmená v reťazci rovnaké. Nevzťahuje sa na čísla a iné znaky, iba písmená.
	- Príklad: `rrrrsr` -> `false`, `rrr r r322r` -> `true`, `123` -> `true`
```java
public boolean hasSameCharacters(String s)
```

- Rozhodnite, či zadaný reťazec je palindróm.
	- Príklad: `Jelenovi pivo nelej` -> `true`, `amerika` -> `false`
```java
public boolean isPalindrome(String s)
```

- Metóda rozhodne, či zadaný reťazec obsahuje dve medzery idúce za sebou.
	- Príklad (znak `*` tentokrát pre lepšiu predstavivosť reprezentuje medzeru): `Dve**medzery` -> `true`, `Tri_medzery***` -> `true`, `bezMedzier` -> `false`
```java
public boolean hasDuplicateSpaces(String s)
```

- Vytvorte metódu, ktorá vypíše zadaný počet čísel. Počiatočné číslo je 0. Ďalšie číslo sa od predošlého líši o jednu miliardu.
	- Príklad: `5` -> `0 1000000000 2000000000 3000000000 4000000000`
```java
public void printBillions(int count)
```

- Metóda nech vypíše náhodný deň v týždni.
```java
public void day()
```

- Vygenerujte 6 náhodných výšok človeka v centimetroch a vypočítajte priemer týchto čísel.
	- Príklad: `(170, 171, 172, 173, 174, 175)` -> `172.5`, `(170, 171, 170, 171, 172, 172)` -> `171`
	- Tip: vytvorte si pomocnú metódu na generovanie náhodného čísla zo zadaného intervalu. Pridajte si pomocný výpis, aby ste vedeli overiť správnosť riešenia.
```java
public double heightsAverage()
```

- Vygenerujte náhodný znak z reťazca
	- Príklad: `abcde` -> `e`, `abcde` -> `b`
```java
public char randomChar(String s)
```

- Metóda vygeneruje náhodné meno nasledovným spôsobom: meno sa skladá zo 4-7 písmen. V reťazci sa striedajú samohlásky a spoluhlásky. Začiatočné písmeno je spoluhláska.
	- Príklad: `dorota`, `monika`, `peter`, `juraj`
	- Tip: Vytvorte si nasledovné dva reťazce `aeiouy` a `bcdfghjklmnprstvz` - zloženie samohlások a spoluhlások si môžete upraviť.
```java
public String randomName()
```

- Majme nejaký dátum, metóda k tomuto dátumu pripočíta 10 rokov.
```java
public ? tenYearsLater(?)
```

- Načítajte čísla z konzoly a pre každé číslo vypočítajte a vypíšte jeho odmocninu. Načítavanie skončí, keď bude zadané záporné číslo.
```java
public void squareRoots()
```

- V poli sa nachádzajú čísla. Metóda všetky hodnoty väčšie ako zadaná `value` nastaví na `value`.
	- Príklad - `[1, 5, 7, 3, 4]`, `value = 4` -> `[1, 4, 4, 3, 4]`
```java
public void reduceBigValues(int[] numbers, int value)
```

- Pole nevie meniť svoju veľkosť. Vytvorte nové pole, ktoré vznikne z pôvodného pridaním zadanej hodnoty na koniec. Za `T` si dosaďte čokoľvek.
	- Príklad - `[1, 5, 7, 3]`, `value = 4` -> `[1, 5, 7, 3, 4]`
```java
public T[] addToArray(T[] array, T value)
```