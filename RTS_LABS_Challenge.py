def main():
    while(True):
        error = False
        print("ENTER NUMBERS FOR ARRAY\n\"QUIT\" TO QUIT")
        user = input()
        if(user.upper() == "QUIT"):
            print("QUITIING PROGRAM")
            exit()
        else:
            
            # Catch any other unforseen errors
            try:
                array = user.split(" ")
                for val in array:

                    # Catch any value that is not an integer
                    try:
                        val = int(val)

                    except Exception:
                        print("A NON INTEGER WAS FOUND!\nPLEASE ENTER ALL INTEGERS OR QUIT TO QUIT!")
                        error = True
                        break
                
                # Will only continue if all vlaues are integers
                if error == False:

                    # USED FOR TESTING #
                    #print(array)


                    test = input("ENTER VALUE TO TEST AGAINST: ")
                    below = 0
                    above = 0
                    
                    # Stepping through array and checking whether value is above or below test case
                    for val in array:

                        if val < test:
                            below += 1
                        if val > test:
                            above += 1
                    
                    print("ABOVE: %d, BELOW: %d" %(above, below))

            except Exception:
                print("PLEASE CHECK INPUT AND TRY AGAIN!\nMAKE SURE YOU ARE NOT USING SPACES AT THE END OF YOUR INTEGER STRING")


main()
    