def print_formatted(number):
    width= len(str(bin(number)[2:]))
    for i in range(1,n+1):
       print(str(i).rjust(width)+" "+
             str(oct(i)[2:]).rjust(width)+" "+
             str(hex(i)[2:]).upper().rjust(width)+" "+
             str(bin(i)[2:]).rjust(width))        
        
