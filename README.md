# Java ArrayIndexOutOfBoundsException Bug

This repository demonstrates a common Java programming error: the `IndexOutOfBoundsException`. The bug occurs when attempting to access an element in an array using an index that is out of the valid range (0 to array.length - 1).

The `bug.java` file contains the erroneous code. The `bugSolution.java` file provides a corrected version.

## Bug Description

The code tries to access an array element at index 5, while the array only has 5 elements (indices 0 through 4). This leads to an `IndexOutOfBoundsException` at runtime.

## Solution

The solution involves checking array bounds before accessing elements or using appropriate data structures (like ArrayList) that handle resizing automatically.