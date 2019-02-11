1. A deck is a list of cards.

2. The deck in the question contains 6 cards.

3. For the game 21, you would need to initialize ranks, suits, and pointValues as such:
```java
ranks = {"2", ..."10", "jack", "queen", "king", "ace"};
suits = {"spades",  "hearts", "diamonds", "clubs"};
pointValues = {2, ...10, 10, 10, 10, 11};
```

4. The order of elements in ranks and pointValues matters, as each rank will be assigned the corresponding point value, but the order of suits does not matter as each suit will have a copy of every rank.
