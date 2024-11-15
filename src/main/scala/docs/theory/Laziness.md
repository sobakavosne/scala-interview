Initial Memory Setup (Before `x` is Evaluated)

```
x$lazyInit = false               # Indicates `x` has not been evaluated
x$value = pointer_to_thunk       # Points to code for creating the tuple

pointer_to_thunk -> [code_to_create_tuple]  # Code to compute (1, 2)
```

Memory Layout

```
x -> x$value
x$value -> pointer_to_thunk

pointer_to_thunk -> [code_to_create_tuple]
```

Lazy Initialisation Code (Executed when `x` is accessed)

```
if (!x$lazyInit) {               # Check if `x` has already been evaluated
    x$value = createTuple()      # Call the code to compute (1, 2)
x$lazyInit = true                # Mark `x` as evaluated
}

return x$value                   # Return the evaluated tuple
```

Updated Memory Setup (After `x` is Evaluated)

```
x$lazyInit = true                # `x` is now marked as evaluated
x$value = pointer_to_tuple       # Points to the computed Tuple2 instance

pointer_to_tuple -> [tag: TUPLE, value0: 1, value1: 2]
```

Final Memory Layout

```
x -> x$value
x$value -> pointer_to_tuple

pointer_to_tuple -> [tag: TUPLE, value0: 1, value1: 2]
```
