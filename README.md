**This exercise was completed for the Object-Oriented Programming course. Its aim was to apply collections, implement the Iterator pattern, and explore comparison and search techniques using the Comparable and Comparator interfaces.**

Develop a basic system to manage the books in a library using Java collections.
This system should allow adding, deleting, and searching for books, as well as comparing them by different criteria.

**Requirements:**

**Class Book:**
  - Attributes: title, author, year of publication, and ISBN.
  - Implement the toString() method to display the book information.
  - Implement comparison interfaces (Comparable and Comparator) to be able to compare books by title, author, and year of publication.

**Collection Management:**
  - Use a suitable collection (such as ArrayList or HashSet) to store books.
  - Implement methods to add and remove books from the collection.
  - Implement searching for books within the collection using an iterator.

**Book Comparison:**
  - Implement at least two comparators:
  - By book title.
  - By year of publication.

**User Interface:**
  - Create a simple interface in the console to interact with the user.
  - Allow the user to add, delete, search for books, and display all books.

**Instructions:**
  - Use Java collections to handle the data.
  - Apply the Iterator design pattern to traverse the book collection.
  - Implement the Comparable interface on the Book class for a default comparison (e.g., by ISBN) and create separate classes that implement Comparator for other comparison criteria.
  - Provide feedback to the user after each operation.
