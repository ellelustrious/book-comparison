## Book Comparison
Books are ordered by genre in alphabetical order. If two books are in the same genre, then the books will be alphabetically order by their titles.

Example:
```java
ArrayList<Book> inventory = new ArrayList<>();
inventory.add(new Book("Hamlet", "play"));
inventory.add(new Book("Beekeeper's Apprentice", "mystery"));
inventory.add(new Book("Big Java", "non-fiction"));
inventory.add(new Book("Beekeeper's Apprentice", "mystery"));
inventory.add(new Book("Bad Business", "mystery"));
inventory.add(new Book("Violet the Pilot","juvenile fiction" ));

Collections.sort(inventory);
for (Book b: inventory)
{
    System.out.printf("%-18s%s%n",b.getGenre(), b.getTitle());              
}
```
## Outputs:
```
juvenile fiction  Violet the Pilot
mystery           Bad Business
mystery           Beekeeper's Apprentice
mystery           Beekeeper's Apprentice
non-fiction       Big Java
play              Hamlet
```
