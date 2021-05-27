# https://codeforwin.org/2015/08/c-program-to-find-twos-complement-of-binary-number.html

def getTwosComp(num):
    bNum = [int(digit) for digit in num]
    # 1's complement
    for index, value in enumerate(bNum):
        bNum[index] = 0 if bNum[index]==1 else 1
    # Adding '1'
    carry = 1
    index = len(bNum) - 1
    while index >= 0:
        if carry==1:
            if bNum[index] == 1:
                bNum[index] = 0
                carry = 1
            else:
                bNum[index] = 1
                carry = 0
        index -= 1
    print(''.join(str(ch) for ch in bNum))

getTwosComp(input())