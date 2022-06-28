What is Map-Reduce ?
Ans: Map-Reduce is a functional programming model it serves our 2 purpose .
Map: Transforming data
Reduce : Aggregating data(combine elements and produce a single value)

Ex: Stream : {2,4,6,9,1,3,7} : -> Sum of numbers present in stream ?

Map() -> Transform Stream<Object> to Stream of int .
Reduce() -> combine stream of int and produce the sum result.

Reduce method argument:
T reduce(T identity, BinaryOperator<T> accumulator);
1. identity is initial value of type T
2.accumulator is a function for combining two values .
ex : Integer sumResult = Stream.of(2,4,6,7).reduce(0,(a,b)->a+b);
identity: 0 which is nothing initial value
Accumulator : (a,b) -> a+b fucnction 