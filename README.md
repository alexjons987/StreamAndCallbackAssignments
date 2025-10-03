## What did we learn?
* Don't call the callback!
* Predicates are conditions!
* Consumers are actions!
* Comparators compare!
* Map transforms one thing to another!
## Assignments
### 1. Callback with Consumer
- [x] Create a method `processString(String input, Consumer<String> callback)` that takes a string and runs the callback 
function on it. 
- Test with different callbacks:
  1. [x] i. Print the string in uppercase.
  2. [x] ii. Print the number of characters in the string.

---

### 2. Callback for calculation
- [ ] Create a method `processNumber(int number, Function<Integer, Integer> callback)` that takes an integer and a
function that processes it.
- Test with different callbacks:
  1. [ ] i. Multiply the number by 2.
  2. [ ] ii. Square the number.
  3. [ ] iii. Add 10 to the number.

---

### 3. Stream filter
- [ ] Create a list of integers.
- Use the Stream API to:
  1. [ ] i. Filter out all even numbers.
  2. [ ] ii. Increase each number by 5 (map).
  3. [ ] ii. Print the result using forEach.

---

### 4. Stream + Comparator
- [ ] Create a class `Person` with fields `String name` and `int age`.
- [ ] Make a list of multiple people.
- Use Streams to:
  1. [ ] i. Filter out people over 18.
  2. [ ] ii. Sort them by age (ascending).
  3. [ ] ii. Extract only their names (map).
  4. [ ] iv. Print the names.

---

### 5. Stream reduce
- [ ] Create a list of `Double` values representing product prices.
- [ ] Use `Stream` with reduce to calculate the sum of all prices.
- [ ] Use another reduce to calculate the max price.
