def find_missing_number(arr, x):
    for i in range(1, x + 1):
        found = False
        for num in arr:
            if num == i:
                found = True
                break
        if not found:
            return i

# Test cases
array1 = [5, 4, 1, 2]
x1 = 5
print("Missing number:", find_missing_number(array1, x1))  # Expected output: 3

array2 = [9, 5, 3, 2, 6, 1, 7, 8, 10]
x2 = 10
print("Missing number:", find_missing_number(array2, x2))  # Expected output: 4

array3 = [2, 3, 1, 5]
x3 = 5
print("Missing number:", find_missing_number(array3, x3))  # Expected output: 4

array4 = [1, 2, 3, 4, 5]
x4 = 6
print("Missing number:", find_missing_number(array4, x4))  # Expected output: 6


# Above code has the Time Complexity of O(n^2)