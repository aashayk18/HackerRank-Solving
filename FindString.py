def count_substring(string, sub_string):
    count = 0
    start = 0
    length = len(string)
    index = string.find(sub_string, start, length)
    while index != -1:
        count = count + 1
        start = index + 1
        index = string.find(sub_string, start, length)
    return count
