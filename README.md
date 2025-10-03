## What did we learn?
* Consumers are actions!
* Function modifies input into new output!
* Stream is a stream of data!
* Reduce reduces elements down to a single element!
* Don't call the callback!
## Assignments
### 1. Callback with Consumer
- [x] Create a method `processString(String input, Consumer<String> callback)` that takes a string and runs the callback 
function on it. 
- Test with different callbacks:
  1. [x] i. Print the string in uppercase.
  2. [x] ii. Print the number of characters in the string.

---

### 2. Callback for calculation
- [x] Create a method `processNumber(int number, Function<Integer, Integer> callback)` that takes an integer and a
function that processes it.
- Test with different callbacks:
  1. [x] i. Multiply the number by 2.
  2. [x] ii. Square the number.
  3. [x] iii. Add 10 to the number.

---

### 3. Stream filter
- [x] Create a list of integers.
- Use the Stream API to:
  1. [x] i. Filter out all even numbers.
  2. [x] ii. Increase each number by 5 (map).
  3. [x] iii. Print the result using forEach.

---

### 4. Stream + Comparator
- [x] Create a class `Person` with fields `String name` and `int age`.
- [x] Make a list of multiple people.
- Use Streams to:
  1. [x] i. Filter out people over 18.
  2. [x] ii. Sort them by age (ascending).
  3. [x] ii. Extract only their names (map).
  4. [x] iv. Print the names.

---

### 5. Stream reduce
- [x] Create a list of `Double` values representing product prices.
- [x] Use `Stream` with reduce to calculate the sum of all prices.
- [x] Use another reduce to calculate the max price.
