def split_and_join(line):
    splitline = line.split()
    newline = "-".join(splitline)
    return newline
    

if __name__ == '__main__':
    line = input()
    result = split_and_join(line)
    print(result)
