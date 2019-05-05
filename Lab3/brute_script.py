
chars = ['a','b','c','d','e','f','g','h','i','j','k',
         'l','m','n','o','p','q','r','s','t','u','v',
         'w','x','y','z']
             
for first_char in chars:
    for second_char in chars:
        for third_char in chars:
            if ( 
                (ord(first_char) + ord(second_char) + ord(third_char) == 343) and 
                (ord(first_char) * ord(second_char) * ord(third_char) == 1493505) 
               ):
                
                print( first_char + ":" + str(ord(first_char)) + " " + 
                      second_char + ":" + str(ord(second_char)) + " " + 
                       third_char + ":" + str(ord(third_char)) + " " )