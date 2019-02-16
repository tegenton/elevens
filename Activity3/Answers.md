1.
```java
public static String flip() {
    Random rand = new Random();
    if (rand.nextInt(3) == 0) {
        return "tails";
    }
    return "heads";
}
```

2.
```java
public static boolean arePermutations(int[] a, int[] b) {
    for (int test : a) {
        for (int comp : b) {
	    if (test != comp)
	        return false;
	}
    }
    return true;
}
```

3. 0, 2, 1, 0
