# Giftwrap
A class to simplify adding items to a Bundle in Android. Multiple calls to the various `put` methods of the Bundle can be replaced with multiple calls to the single `put` method of this class, and a final call to `wrap` to return the finished Bundle.

For example, the following:
```
Bundle bundle = new Bundle();
bundle.putInt("myInt", 1);
bundle.putBoolean("myBoolean", true);
bundle.putDouble("myDouble", 2.2);
bundle.putString("myString", "Hello");
```

can be replaced with:
```
Bundle bundle = new Giftwrap()
      .put("myInt", 1)
      .put("myBoolean", true)
      .put("myDouble", 2.2)
      .put("myString", "Hello")
      .wrap();
```

Though the Bundle class has methods for adding ArrayLists of various types, all ArrayLists added via Giftwrap are added with `Bundle.putSerializable` and can be retrieved in their original form via the Bundle's various `get` methods for ArrayLists, such as `Bundle.getIntegerArrayList`. Similarly, Strings are added using ```Bundle.putCharSequence``` but can still be retrived using ```Bundle.getString```.
